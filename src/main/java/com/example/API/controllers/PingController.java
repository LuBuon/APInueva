package com.example.API.controllers;


import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")

public class PingController {

    @RequestMapping(path = "/ping")
    public @ResponseBody String ping() {

        System.out.println("Hola Mundo");
        return "pong";
    }

    @GetMapping("/api/nombres")
    @ResponseBody
    public String nombre(@RequestParam(required = false) String nombre) {

        return "NOMBRE: " + nombre;
    }

    @GetMapping("/api/{apellidos}")
    @ResponseBody
    public String apellido (@PathVariable("apellidos") String apellido) {

        return "APELLIDO: " + apellido;
    }
}
