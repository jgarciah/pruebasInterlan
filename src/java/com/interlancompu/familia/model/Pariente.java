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
public class Pariente extends Persona{
    private Sexo sexo;
    private TipoFamiliar tipoFamiliar;
    private boolean estado;

    public Pariente() {
        sexo = new Sexo();
        tipoFamiliar = new TipoFamiliar();
        estado = true;
    }

    public Pariente(Sexo sexo, TipoFamiliar tipoFamiliar) {
        this.sexo = sexo;
        this.tipoFamiliar = tipoFamiliar;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public TipoFamiliar getTipoFamiliar() {
        return tipoFamiliar;
    }

    public void setTipoFamiliar(TipoFamiliar tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
