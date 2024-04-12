package com.example.pruebatecnica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotBlank
    @NotNull(message = "El campo no puede estar vacio")
    private Long idVuelo;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 30, message = "El campo no puede tener mas de 30 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String lugarOrigen;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 30, message = "El campo no puede tener mas de 30 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String lugarDestino;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(nullable = false)
    @NotBlank
    @Size(max = 30, message = "El campo no puede tener mas de 30 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String aerolinea;


}
