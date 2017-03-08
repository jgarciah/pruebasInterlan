/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interlancompu.familia.model;

import java.util.ArrayList;

/**
 *
 * @author WEBMASTER
 */
public class Familia {
    ArrayList<Pariente> listParientes;

    public Familia() {
    }

    public Familia(ArrayList<Pariente> listParientes) {
        this.listParientes = listParientes;
    }

    public ArrayList<Pariente> getListParientes() {
        return listParientes;
    }

    public void setListParientes(ArrayList<Pariente> listParientes) {
        this.listParientes = listParientes;
    }
    
    public String addPariente(Pariente p){
        for(Pariente x: this.listParientes){
            if(p.getTipoFamiliar().getId() == 1 && x.getTipoFamiliar().getId() == 1)
                return "Sólo puede existir un padre";
            if(p.getTipoFamiliar().getId() == 2 && x.getTipoFamiliar().getId() == 2)
                return "Sólo puede existir una madre";
        }
        
        this.listParientes.add(p);
        return "Se agregó correctamente el familiar";
    }
    
    public void clearFamilia(){
        this.listParientes.clear();
    }
    
    public int getNumeroHijos(){
        int i = 0;
        for(Pariente x: this.listParientes){
            if(x.getTipoFamiliar().getId() == 3)
                i++;
        }
        return i;
    }
    
    public Pariente getHermanoMayor(){
        if(!this.listParientes.isEmpty()){
            Pariente mayor;
            ArrayList<Pariente> sublista = new ArrayList<Pariente>();
            for(Pariente p : this.listParientes){
                if(p.getSexo().getId() == 1 && p.getTipoFamiliar().getId() == 3)
                    sublista.add(p);
            }
            mayor = sublista.get(0);
            for(Pariente p : sublista){
                if(p.getEdad() > mayor.getEdad())
                    mayor = p;
            }
            return mayor;
        }
        else return null;
    }
    
    public Pariente getHermanoMenor(){
        if(!this.listParientes.isEmpty()){
            Pariente menor;
            ArrayList<Pariente> sublista = new ArrayList<Pariente>();
            for(Pariente p : this.listParientes){
                if(p.getSexo().getId() == 1 && p.getTipoFamiliar().getId() == 3)
                    sublista.add(p);
            }
            menor = sublista.get(0);
            for(Pariente p : sublista){
                if(p.getEdad() < menor.getEdad())
                    menor = p;
            }
            return menor;
        }
        else return null;
    }
    public Pariente getHermanaMayor(){
        if(!this.listParientes.isEmpty()){
            Pariente mayor;
            ArrayList<Pariente> sublista = new ArrayList<Pariente>();
            for(Pariente p : this.listParientes){
                if(p.getSexo().getId() == 2 && p.getTipoFamiliar().getId() == 3)
                    sublista.add(p);
            }
            mayor = sublista.get(0);
            for(Pariente p : sublista){
                if(p.getEdad() > mayor.getEdad())
                    mayor = p;
            }
            return mayor;
        }
        else return null;
    }
    
    public Pariente getHermanaMenor(){
        if(!this.listParientes.isEmpty()){
            Pariente menor;
            ArrayList<Pariente> sublista = new ArrayList<Pariente>();
            for(Pariente p : this.listParientes){
                if(p.getSexo().getId() == 2 && p.getTipoFamiliar().getId() == 3)
                    sublista.add(p);
            }
            menor = sublista.get(0);
            for(Pariente p : sublista){
                if(p.getEdad() < menor.getEdad())
                    menor = p;
            }
            return menor;
        }
        else return null;
    }
    
    public int getNumeroHombres(){
        int i = 0;
        for(Pariente x: this.listParientes){
            if(x.getSexo().getId() == 1)
                i++;
        }
        return i;
    }
    
    public int getNumeroMujeres(){
        int i = 0;
        for(Pariente x: this.listParientes){
            if(x.getSexo().getId() == 2)
                i++;
        }
        return i;
    }
    
    public Pariente getPariente(int i){
        return this.listParientes.get(i);
    }
    
    public int getCountParientes(){
        return this.listParientes.size();
    }
    
    public void dormirPariente(Pariente p){
        for(Pariente x: this.listParientes){
            if(x.equals(p))
                x.dormir();
        }
    }
    public void despertarPariente(Pariente p){
        for(Pariente x: this.listParientes){
            if(x.equals(p))
                x.despertar();
        }
    }
}
