package com.american.doors.model;

import com.american.doors.model.Fases;
import com.american.doors.model.Proyectos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-14T23:35:24")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile ListAttribute<Productos, Fases> fasesList;
    public static volatile SingularAttribute<Productos, Proyectos> idProyecto;
    public static volatile SingularAttribute<Productos, Boolean> importado;
    public static volatile SingularAttribute<Productos, String> descripcionProducto;
    public static volatile SingularAttribute<Productos, Date> horasDelProyecto;
    public static volatile SingularAttribute<Productos, Integer> idProducto;
    public static volatile SingularAttribute<Productos, Long> precioHoras;
    public static volatile SingularAttribute<Productos, String> nombreProducto;

}