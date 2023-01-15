/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.fb.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author fbatt
 */
public class dtoPersona {
    @NotBlank
    private String Nombre;
    @NotBlank
    private String Apellido;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String Img;  

    public dtoPersona() {
    }

    public dtoPersona(String Nombre, String Apellido, String descripcion, String Img) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.descripcion = descripcion;
        this.Img = Img;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }
    
    
    
    
    
    
}
