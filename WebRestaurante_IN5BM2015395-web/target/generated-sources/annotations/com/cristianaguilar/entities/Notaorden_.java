package com.cristianaguilar.entities;

import com.cristianaguilar.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T07:14:18")
@StaticMetamodel(Notaorden.class)
public class Notaorden_ { 

    public static volatile SingularAttribute<Notaorden, String> descripcion;
    public static volatile SingularAttribute<Notaorden, Integer> idorden;
    public static volatile ListAttribute<Notaorden, Facturas> facturasList;

}