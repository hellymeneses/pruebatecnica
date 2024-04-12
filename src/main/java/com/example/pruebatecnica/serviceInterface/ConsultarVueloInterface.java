package com.example.pruebatecnica.serviceInterface;

import com.example.pruebatecnica.entity.Vuelo;

import java.util.List;

public interface ConsultarVueloInterface {

    List<Vuelo> consultarVuelos();

    List<Vuelo>consultarVueloPorDestino(String lugarDestino);


}
