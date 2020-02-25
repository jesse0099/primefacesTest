/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cci.services;

/**
 *
 *@author Daniel
 *@param <T>
 */

import java.util.List;


public class Dao {
    public interface IDao<T> {
    public List<T> getAll();
    public void save(T data);
    public void get(int id);
    public void update(T data);
    public void delete(int id);
}

}
