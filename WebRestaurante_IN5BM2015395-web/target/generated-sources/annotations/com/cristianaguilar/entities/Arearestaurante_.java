package com.cristianaguilar.entities;

import com.cristianaguilar.entities.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T07:14:18")
@StaticMetamodel(Arearestaurante.class)
public class Arearestaurante_ { 

    public static volatile SingularAttribute<Arearestaurante, String> descripcion;
    public static volatile SingularAttribute<Arearestaurante, Integer> idarea;
    public static volatile ListAttribute<Arearestaurante, Mesas> mesasList;

}