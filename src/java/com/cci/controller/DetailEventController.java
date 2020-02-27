/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.controller;

import com.cci.model.DetalleEvento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Nvidi
 */
@ManagedBean(name = "detailEventController")
@RequestScoped
public class DetailEventController {

    public List<DetalleEvento> lst = new ArrayList<>();

    public List<DetalleEvento> getLst() {
        return lst;
    }

    public void setLst(List<DetalleEvento> lst) {
        this.lst = lst;
    }

    public DetailEventController() {
        PrimeFaces.current().executeScript("console.log('toy cargando')");
        List<String> strLoader = new ArrayList<>();
        strLoader.add("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo");
        strLoader.add("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo");
        strLoader.add("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo");
        this.lst.add(new DetalleEvento("Evento 1", new Date(1,2,1999), "UltraDescripcion", strLoader));
        this.lst.add(new DetalleEvento("Evento 2", new Date(1,2,1999), "UltraDescripcion", strLoader));
        this.lst.add(new DetalleEvento("Evento 3", new Date(1,2,1999), "UltraDescripcion", strLoader));
        PrimeFaces.current().executeScript("console.log('" + this.lst.size() + "')");
    }

    public void onLoad() {
        this.lst = new ArrayList<>();
        PrimeFaces.current().executeScript("console.log('toy cargando')");
        List<String> strLoader = new ArrayList<>();
        strLoader.add("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo");
        strLoader.add("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo");
        strLoader.add("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo");
        this.lst.add(new DetalleEvento("Evento", new Date(), "UltraDescripcion", strLoader));
        this.lst.add(new DetalleEvento("Evento", new Date(), "UltraDescripcion", strLoader));
        this.lst.add(new DetalleEvento("Evento", new Date(), "UltraDescripcion", strLoader));
        PrimeFaces.current().executeScript("console.log('" + this.lst.size() + "')");
    }

}
