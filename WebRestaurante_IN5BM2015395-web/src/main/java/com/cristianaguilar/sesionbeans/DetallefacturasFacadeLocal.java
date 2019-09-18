/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristianaguilar.sesionbeans;

import com.cristianaguilar.entities.Detallefacturas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface DetallefacturasFacadeLocal {

    void create(Detallefacturas detallefacturas);

    void edit(Detallefacturas detallefacturas);

    void remove(Detallefacturas detallefacturas);

    Detallefacturas find(Object id);

    List<Detallefacturas> findAll();

    List<Detallefacturas> findRange(int[] range);

    int count();
    
}
