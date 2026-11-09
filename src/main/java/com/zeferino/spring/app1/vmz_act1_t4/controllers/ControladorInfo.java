package com.zeferino.spring.app1.vmz_act1_t4.controllers;



    
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorInfo {

    // Endpoint 3:(Datos personales)
    @GetMapping("/mis-datos")
    public String regresarDatos() {
        return "{ \"nombre\": \"Zeferino\", \"carrera\": \"sistemas\", \"semestre\": 7 }";
    }
}
