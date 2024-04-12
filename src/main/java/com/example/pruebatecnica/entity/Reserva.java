package com.example.pruebatecnica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotBlank
    @NotNull(message = "El campo no puede estar vacio")
    private String idReserva;

    @NotNull(message = "El campo no puede estar vacio")
    @NotBlank
    @Column(nullable = false , unique = true)
    private String idTiquete;

    @NotNull
    private Boolean estadoReserva;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idVuelo")
    private Vuelo vuelo;




}
