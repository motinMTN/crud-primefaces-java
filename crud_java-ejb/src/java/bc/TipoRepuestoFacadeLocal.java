/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bc;

import be.TipoRepuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MTN
 */
@Local
public interface TipoRepuestoFacadeLocal {

    void create(TipoRepuesto tipoRepuesto);

    void edit(TipoRepuesto tipoRepuesto);

    void remove(TipoRepuesto tipoRepuesto);

    TipoRepuesto find(Object id);

    List<TipoRepuesto> findAll();

    List<TipoRepuesto> findRange(int[] range);

    int count();
    
}
