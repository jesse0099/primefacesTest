/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.services;

import com.cci.model.usuario;
import com.cci.services.Dao.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */

public class userDao extends DBConn implements IDao<usuario>{
 ResultSet rset;
 Statement stm;
    @Override
    public List<usuario> getAll() {
        List<usuario> returned = new ArrayList<>();
        try{
            super.conectar();
            stm = conn.createStatement();
            rset = stm.executeQuery("select idUsers,username,email,password from users");
            
            while(rset.next()){
                System.out.println(""+rset.getInt(1));
                returned.add(new usuario(rset.getString(2),rset.getString(3),rset.getString(4)));
            }
        }catch(SQLException ex){
            
        }finally{
            super.desconectar();
            try {
                rset.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return returned;
    }

    @Override
    public void save(usuario data) {
      try{
            PreparedStatement pre ;
            super.conectar();
            pre = conn.prepareStatement("INSERT INTO usuario VALUES username=?,email=?,password=?;");
            pre.setString(1, data.getUsername());
            pre.setString(2, data.getEmail());
            pre.setString(3,data.getPassword());
            pre.execute();
            
        }catch(SQLException ex){
            
        }finally{
            super.desconectar();
            try {
                rset.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
        
    }

    @Override
    public void get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(usuario data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
