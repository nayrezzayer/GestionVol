/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Iyed
 */
public interface EscaleCrud <T> {
         boolean create (T p);
    boolean update (int id, T p);
    boolean delete (int id);
    ArrayList<T> retrieveAll();
    T retrieveById (int id);
    ArrayList <T> retrieveByKeyWord (String key);
}
