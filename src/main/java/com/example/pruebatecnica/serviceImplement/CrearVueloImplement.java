package com.example.pruebatecnica.serviceImplement;

import com.example.pruebatecnica.entity.Vuelo;
import com.example.pruebatecnica.repository.VueloRepository;
import com.example.pruebatecnica.serviceInterface.CrearVueloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrearVueloImplement implements CrearVueloInterface {
    @Autowired
    VueloRepository vueloRepository;

    @Override
    public Vuelo crearVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }
}
