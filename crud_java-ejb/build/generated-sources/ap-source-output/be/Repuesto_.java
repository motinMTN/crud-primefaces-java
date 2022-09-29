package be;

import be.TipoRepuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-29T13:59:51")
@StaticMetamodel(Repuesto.class)
public class Repuesto_ { 

    public static volatile SingularAttribute<Repuesto, String> descripcion;
    public static volatile SingularAttribute<Repuesto, Integer> pkId;
    public static volatile SingularAttribute<Repuesto, Date> fechaRegistro;
    public static volatile SingularAttribute<Repuesto, TipoRepuesto> tipoRepuesto;
    public static volatile SingularAttribute<Repuesto, String> nombre;

}