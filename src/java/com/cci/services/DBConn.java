/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.services;

/**
 *
 * @author Daniel
 */


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConn {
    
    
     private static final String url="jdbc:mysql://localhost:3306/proyecto2?zeroDateTimeBehavior=convertToNull";
    private static final String usuario="root";
    private static final String pass = "AsdF2013";
    protected Connection conn=null;
    
    protected void  conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,usuario,pass);
        }catch (SQLException | ClassNotFoundException e){
             Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    protected void desconectar(){
        
        try{
            
        if(!conn.isClosed()){
            conn.close();
        }
            
        }catch (SQLException e){
             Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE,null, e);
        }
    }
            
         
}
