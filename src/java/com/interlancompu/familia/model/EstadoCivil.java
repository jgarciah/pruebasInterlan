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
public class EstadoCivil {
    private int id;
    private String definicion;

    public EstadoCivil() {
    }

    public EstadoCivil(int id) {
        this.id = id;
        switch (id){
            case 1:
                this.definicion = "Soltero";
                break;
            case 2:
                this.definicion = "Casado";
                break;
            case 3:
                this.definicion = "Viudo";
                break;
            case 4:
                this.definicion = "Divorciado";
                break;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDefinicion() {
        switch (id){
            case 1:
                this.definicion = "Soltero";
                break;
            case 2:
                this.definicion = "Casado";
                break;
            case 3:
                this.definicion = "Viudo";
                break;
            case 4:
                this.definicion = "Divorciado";
                break;
        }
        return definicion;
    }
}
