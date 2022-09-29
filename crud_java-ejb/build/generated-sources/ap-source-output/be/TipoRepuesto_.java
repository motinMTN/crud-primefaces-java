package be;

import be.Repuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-29T13:59:51")
@StaticMetamodel(TipoRepuesto.class)
public class TipoRepuesto_ { 

    public static volatile SingularAttribute<TipoRepuesto, String> descripcion;
    public static volatile SingularAttribute<TipoRepuesto, Integer> pkId;
    public static volatile SingularAttribute<TipoRepuesto, Date> fechaRegistro;
    public static volatile ListAttribute<TipoRepuesto, Repuesto> repuestoList;
    public static volatile SingularAttribute<TipoRepuesto, String> nombre;

}