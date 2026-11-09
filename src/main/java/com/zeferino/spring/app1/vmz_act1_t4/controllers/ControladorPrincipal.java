package com.zeferino.spring.app1.vmz_act1_t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPrincipal {

    // Endpoint 1: Autor
     @GetMapping("/autor")
    public String regresarAutor() {
        return "Proyecto desarrollado por: Zeferino"; 
    }

    // Endpoint 2: Lista simulada (Materias)
    @GetMapping("/materias")
    public String regresarMaterias() {
        return "[\"Desarrollo Web\", \"Bases de Datos\", \"Programación\", \"Redes\"]";
    }


}
