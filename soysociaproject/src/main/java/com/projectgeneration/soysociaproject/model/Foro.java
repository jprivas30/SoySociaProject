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

@Entity(name ="foro")
public class Foro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foro_id;
    private String titulo;
    private String categoria;
    private String contenido;
    private String fecha;
    private String usuario_id;

}
