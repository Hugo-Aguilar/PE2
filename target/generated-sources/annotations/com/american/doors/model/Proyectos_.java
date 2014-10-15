package com.american.doors.model;

import com.american.doors.model.Productos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-14T23:35:24")
@StaticMetamodel(Proyectos.class)
public class Proyectos_ { 

    public static volatile SingularAttribute<Proyectos, Date> fechaIniProyecto;
    public static volatile SingularAttribute<Proyectos, Integer> idproyectos;
    public static volatile SingularAttribute<Proyectos, String> codProyecto;
    public static volatile SingularAttribute<Proyectos, Date> fechaEstimadaFinProyecto;
    public static volatile SingularAttribute<Proyectos, Date> fechaFinProyecto;
    public static volatile SingularAttribute<Proyectos, String> nombreProyecto;
    public static volatile ListAttribute<Proyectos, Productos> productosList;
    public static volatile SingularAttribute<Proyectos, Date> tiempoMuertoProyecto;
    public static volatile SingularAttribute<Proyectos, Boolean> estadoProyecto;
    public static volatile SingularAttribute<Proyectos, Long> costoProyecto;

}