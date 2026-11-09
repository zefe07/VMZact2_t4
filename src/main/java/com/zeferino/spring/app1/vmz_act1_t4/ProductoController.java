package com.zeferino.spring.app1.vmz_act1_t4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductoController {

    @Value("${mi.proyecto.autor}")
    private String nombreAutor;

    private List<ProductoDTO> obtenerProductos() {
        List<ProductoDTO> lista = new ArrayList<>();
        lista.add(new ProductoDTO("Laptop", 15000, "Electronica"));
        lista.add(new ProductoDTO("Silla", 2000, "Muebles"));
        lista.add(new ProductoDTO("Celular", 8000, "Electronica"));
        return lista;
    }

    @GetMapping("/productos")
    public String verProductos(Model model) {
        model.addAttribute("productos", obtenerProductos());
        model.addAttribute("autor", nombreAutor);
        return "lista-productos";
    }

    @GetMapping("/productos/filtrar")
    public String filtrarPorCategoria(@RequestParam(name = "categoria", required = false) String categoria, Model model) {
        List<ProductoDTO> filtrados = new ArrayList<>();
        for (ProductoDTO p : obtenerProductos()) {
            if (categoria == null || p.getCategoria().equalsIgnoreCase(categoria)) {
                filtrados.add(p);
            }
        }
        model.addAttribute("productos", filtrados);
        model.addAttribute("autor", nombreAutor);
        return "lista-productos";
    }

    @GetMapping("/productos/{id}")
    public String verDetalle(@PathVariable("id") int id, Model model) {
        ProductoDTO producto = obtenerProductos().get(id);
        model.addAttribute("producto", producto);
        return "detalle-producto";
    }

    @GetMapping("/productos/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new ProductoDTO());
        return "formulario-producto";
    }

    @PostMapping("/productos/guardar")
    public String guardarProducto(@ModelAttribute("producto") ProductoDTO producto, Model model) {
        model.addAttribute("mensaje", "Producto guardado: " + producto.getNombre());
        model.addAttribute("producto", producto); // Para que la vista de detalle lo muestre
        return "detalle-producto";
    }

    @PostMapping("/api/productos")
    @ResponseBody
    public ProductoDTO crearProductoAPI(@RequestBody ProductoDTO producto) {
        return producto;
    }
}