/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.services;

import com.cci.model.usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class allServices {
    
    public List<usuario> buscarTodos(){
     userDao IDao = new userDao();
     return ((userDao)IDao).getAll();
    }
    
    public boolean register(usuario u){
        boolean chk = false;
         userDao IDao = new userDao();
         
         try{
          IDao.save(u);
          chk =true;
         }catch(Exception e){
             e.printStackTrace();
         }
        return chk;
    }
}
