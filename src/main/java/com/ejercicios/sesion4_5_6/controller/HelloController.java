
package com.ejercicios.sesion4_5_6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Ejercicio 1
 * Crear un proyecto Spring Boot con las dependencias:
 * H2
 * Spring Data JPA
 * Spring Web
 * Spring Boot dev tools
 * Crear una clase HelloController que sea un controlador REST. 
 * Dentro de la clase crear un método que retorne un saludo. 
 * Probar que retorna el saludo desde el navegador y desde Postman.
 * @author adrj
 */

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo!!";
    }
}
