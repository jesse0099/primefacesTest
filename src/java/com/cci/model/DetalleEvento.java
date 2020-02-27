/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nvidi
 */
public class DetalleEvento {
    private String nombre;
    private Date   duracion;
    private String descripcion;
    private List<String> slots;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }
    
    public DetalleEvento(){
        this.slots = new ArrayList<>();
    }

    public DetalleEvento(String nombre, Date duracion, String descripcion, List<String> slots) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.slots = slots;
    }
    
    
    
    
}
