/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interlancompu.familia.beans;

import com.interlancompu.familia.model.Familia;
import com.interlancompu.familia.model.Pariente;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author WEBMASTER
 */
@ManagedBean
@SessionScoped
public class FamiliaBean implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Familia familia;
    private Pariente nuevoPariente;

    public FamiliaBean() {
        nuevoPariente = new Pariente();
        this.familia = new Familia(new ArrayList<>());
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Pariente getNuevoPariente() {
        return nuevoPariente;
    }

    public void setNuevoPariente(Pariente nuevoPariente) {
        this.nuevoPariente = nuevoPariente;
    }
    
    public void agregarFamiliar(){
        String msj = familia.addPariente(nuevoPariente);
        if (msj.contains("correctamente")){
            this.nuevoPariente = new Pariente();
        }
        mostrarMensaje(msj);
    }
    
    public void clearFormPariente(){
        this.nuevoPariente = new Pariente();
    }
    public void imprimir(){
        System.out.println("imprimir");
        int i = 0;
        System.out.println(this.familia.getListParientes().size());
        for(Pariente x: this.familia.getListParientes()){
                System.out.println(x.getNombre());
        }
    }
    
    public void cambiarEstado(Pariente p){
        if(p.isEstado())
            familia.dormirPariente(p);
        else
            familia.despertarPariente(p);
    }
    
    public void mostrarMensaje(String msj) {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Atencion",  msj) );
    }
}
