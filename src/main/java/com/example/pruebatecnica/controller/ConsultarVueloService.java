package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Vuelo;
import com.example.pruebatecnica.serviceInterface.ConsultarVueloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airline")
public class ConsultarVueloService {


    @Autowired
    ConsultarVueloInterface consultarVueloInterface;


    @GetMapping("/vuelos")
    public List<Vuelo>  consultarVuelos(){
        return consultarVueloInterface.consultarVuelos();
    }

    
}
