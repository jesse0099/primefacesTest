/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.controller;


import com.cci.model.usuario;
import com.cci.services.DBConn;
import com.cci.services.allServices;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.cci.services.allServices;
import java.util.List;
import java.util.ArrayList;

@ManagedBean( name = "registrar")
@SessionScoped
public class userRegister implements Serializable {
    
    private String username;
    private String email;
    private String password;
    private string pass2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public string getPass2() {
        return pass2;
    }

    public void setPass2(string pass2) {
        this.pass2 = pass2;
    }

  
    public boolean registrar(){
        
        boolean chk=false;
        allServices service = new allServices();
        
        if(this.password.equals(this.pass2)){
            
           chk=service.register(new usuario(this.username,this.email,this.password));
            
        }  
        return chk;
    }
    
    
}
