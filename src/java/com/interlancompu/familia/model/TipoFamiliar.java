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
public class TipoFamiliar {
    private int id;
    private String definicion;

    public TipoFamiliar() {
    }

    public TipoFamiliar(int id) {
        this.id = id;
        switch (id){
            case 1:
                this.definicion = "Padre";
                break;
            case 2:
                this.definicion = "Madre";
                break;
            case 3:
                this.definicion = "Hijo";
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
                this.definicion = "Padre";
                break;
            case 2:
                this.definicion = "Madre";
                break;
            case 3:
                this.definicion = "Hijo";
                break;
        }
        return definicion;
    }
}
