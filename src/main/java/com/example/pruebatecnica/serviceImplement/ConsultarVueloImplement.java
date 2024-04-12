package com.example.pruebatecnica.serviceImplement;

import com.example.pruebatecnica.entity.Vuelo;
import com.example.pruebatecnica.repository.VueloRepository;
import com.example.pruebatecnica.serviceInterface.ConsultarVueloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultarVueloImplement  implements ConsultarVueloInterface {

    @Autowired
    VueloRepository vueloRepository;

    @Override
    public List<Vuelo> consultarVuelos(){
        return vueloRepository.findAll();
    }

    @Override
    public List<Vuelo> consultarVueloPorDestino(String lugarDestino) {
        return null;
    }
}
