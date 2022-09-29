/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bc;

import be.Repuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MTN
 */
@Local
public interface RepuestoFacadeLocal {

    void create(Repuesto repuesto);

    void edit(Repuesto repuesto);

    void remove(Repuesto repuesto);

    Repuesto find(Object id);

    List<Repuesto> findAll();

    List<Repuesto> findRange(int[] range);

    int count();
    
}
