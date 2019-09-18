/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristianaguilar.sesionbeans;

import com.cristianaguilar.entities.Notaorden;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface NotaordenFacadeLocal {

    void create(Notaorden notaorden);

    void edit(Notaorden notaorden);

    void remove(Notaorden notaorden);

    Notaorden find(Object id);

    List<Notaorden> findAll();

    List<Notaorden> findRange(int[] range);

    int count();
    
}
