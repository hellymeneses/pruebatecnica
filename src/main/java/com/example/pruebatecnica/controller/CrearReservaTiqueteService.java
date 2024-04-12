package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Reserva;
import com.example.pruebatecnica.serviceInterface.CrearReservaTiquetInteface;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/airline")
public class CrearReservaTiqueteService {

    @Autowired
    CrearReservaTiquetInteface crearReservaTiquetInteface;


    @PostMapping("/reserva/create")
    public ResponseEntity<?> crearReservaTiquet(@Valid @RequestBody Reserva reserva, BindingResult result) {
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {
            List<String> error = result.getFieldErrors().stream()
                    .map(fieldError -> "El campo '" + fieldError.getField() + "' " + fieldError.getDefaultMessage())
                    .toList();
            response.put("Errores de validacion: ", error);

            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        Reserva reservaResponse = crearReservaTiquetInteface.reservarTiquete(reserva);
        response.put("data", reservaResponse);
        response.put("status", HttpStatus.OK.toString());
        response.put("message", "La reserva fue creada exitosamente");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
