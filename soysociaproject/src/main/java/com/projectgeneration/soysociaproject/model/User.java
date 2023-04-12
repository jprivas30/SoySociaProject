package com.projectgeneration.soysociaproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "Usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String rut;
    private String correo;
    private String username;
    private String contrasenia;
    private Integer telefono;
    private String redsocial;
    private String interes1;
    private String interes2;
    private String interes3;
    private String fecha_creacion_cuenta;
    private char status;
    private String descripcion;
    private String imagen;
    private String rol;
}

