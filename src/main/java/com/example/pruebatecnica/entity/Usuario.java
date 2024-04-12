package com.example.pruebatecnica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    @NotBlank
    @NotNull(message = "El campo no puede estar vacio")
    private Long idUsuario;
    @Column(nullable = false)
    @NotBlank
    @Size(max = 30 , message = "El campo no puede tener mas de 30 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String nombre;
    @Column(nullable = false)
    @NotBlank
    @Size(max = 30 , message = "El campo no puede tener mas de 30 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String apellido;
    @Column(nullable = false)
    @NotBlank
    @Size(max = 3 , message = "El campo no puede tener mas de 3 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String tipoDocumento;
    @Column(nullable = false)
    @NotBlank
    @Size(max = 30 , message = "El campo no puede tener mas de 30 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String numeroDocumento;
    @Column(nullable = false)
    @NotBlank
    @Size(min =10, max = 10 , message = "El campo no puede tener mas de 10 caracteres")
    @NotNull(message = "El campo no puede estar vacio")
    private String numeroCelular;
    @Email
    @Column(nullable = false)
    @NotBlank
    @NotNull(message = "El campo no puede estar vacio")
    private String email;



}
