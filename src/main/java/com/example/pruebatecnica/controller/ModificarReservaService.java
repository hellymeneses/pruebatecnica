package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Reserva;
import com.example.pruebatecnica.serviceInterface.ModificarReservaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline")
public class ModificarReservaService {

    @Autowired
    ModificarReservaInterface modificarReservaInterface;

    @PutMapping("/modificar/reserva")
    public Reserva modificarReserva(@RequestBody Reserva reserva){
        return modificarReservaInterface.actualizarReserva(reserva);

    }
}
