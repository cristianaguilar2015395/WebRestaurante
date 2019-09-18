package com.cristianaguilar.entities;

import com.cristianaguilar.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T07:14:18")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, String> apellido;
    public static volatile SingularAttribute<Meseros, Integer> idmesero;
    public static volatile SingularAttribute<Meseros, String> nombre;
    public static volatile ListAttribute<Meseros, Facturas> facturasList;

}