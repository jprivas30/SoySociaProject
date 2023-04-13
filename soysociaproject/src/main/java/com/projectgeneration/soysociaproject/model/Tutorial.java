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
@Entity(name ="tutorial")
public class Tutorial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tutorial_id;
    private String titulo;
    private String descripcion;
    private String contenido;
    private String enlace;
    private String categoria;

}
