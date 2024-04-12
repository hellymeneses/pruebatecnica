package com.example.pruebatecnica.serviceImplement;

import com.example.pruebatecnica.entity.Reserva;
import com.example.pruebatecnica.repository.ReservaRepository;
import com.example.pruebatecnica.serviceInterface.CrearReservaTiquetInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrearReservaTiquetImplement implements CrearReservaTiquetInteface {

    @Autowired
    ReservaRepository reservaRepository;
    @Override
    public Reserva reservarTiquete(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}
