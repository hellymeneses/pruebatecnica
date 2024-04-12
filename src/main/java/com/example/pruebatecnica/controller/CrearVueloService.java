package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Vuelo;
import com.example.pruebatecnica.serviceInterface.CrearVueloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline")
public class CrearVueloService {

    @Autowired
    CrearVueloInterface crearVueloInterface;

    @PostMapping("/vuelo/create")
    public Vuelo crearVuelo (@RequestBody Vuelo vuelo){
        return crearVueloInterface.crearVuelo(vuelo);
    }
}
