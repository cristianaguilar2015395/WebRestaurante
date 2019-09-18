package com.cristianaguilar.entities;

import com.cristianaguilar.entities.Arearestaurante;
import com.cristianaguilar.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T07:14:18")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesa;
    public static volatile SingularAttribute<Mesas, Integer> numeroPersonas;
    public static volatile SingularAttribute<Mesas, Arearestaurante> idarea;
    public static volatile ListAttribute<Mesas, Facturas> facturasList;

}