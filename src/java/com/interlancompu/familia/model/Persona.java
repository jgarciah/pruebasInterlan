/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interlancompu.familia.model;

/**
 *
 * @author WEBMASTER
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedulaIdentidad;
    private EstadoCivil estadoCivil;
    private int edad;

    public Persona(String nombre, String apellido, String cedulaIdentidad, EstadoCivil estadoCivil, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedulaIdentidad = cedulaIdentidad;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }

    public Persona() {
        estadoCivil = new EstadoCivil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean despertar(){
        return true;
    }
    
    public boolean dormir(){
        return true;
    }
    
}
