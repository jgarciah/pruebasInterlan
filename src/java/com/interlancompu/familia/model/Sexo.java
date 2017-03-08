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
public class Sexo {
    private int id;
    private String definicion;

    public Sexo() {
    }

    
    public Sexo(int id) {
        this.id = id;
        switch (id){
            case 1:
                this.definicion = "Masculino";
                break;
            case 2:
                this.definicion = "Femenino";
                break;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getId() {
        return id;
    }
    
    public String getDefinicion() {
        switch (id){
            case 1:
                this.definicion = "Masculino";
                break;
            case 2:
                this.definicion = "Femenino";
                break;
        }
        return definicion;
    }
}
