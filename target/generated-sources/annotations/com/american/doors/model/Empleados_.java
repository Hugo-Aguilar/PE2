package com.american.doors.model;

import com.american.doors.model.FasesXEmpleados;
import com.american.doors.model.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-14T23:35:24")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile ListAttribute<Empleados, FasesXEmpleados> fasesXEmpleadosList;
    public static volatile SingularAttribute<Empleados, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleados, String> apellidoEmpleado;
    public static volatile SingularAttribute<Empleados, Usuarios> idUsuario;
    public static volatile SingularAttribute<Empleados, String> nombreEmpleado;
    public static volatile SingularAttribute<Empleados, Date> fechaIngresoEmpleado;
    public static volatile SingularAttribute<Empleados, String> codEmpleado;

}