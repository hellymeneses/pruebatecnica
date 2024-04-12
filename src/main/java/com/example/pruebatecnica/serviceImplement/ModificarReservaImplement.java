package com.example.pruebatecnica.serviceImplement;

import com.example.pruebatecnica.entity.Reserva;
import com.example.pruebatecnica.repository.ReservaRepository;
import com.example.pruebatecnica.serviceInterface.ModificarReservaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModificarReservaImplement implements ModificarReservaInterface {

    @Autowired
    ReservaRepository reservaRepository;
    @Override
    public Reserva actualizarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}
