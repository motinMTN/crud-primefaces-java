/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bc;

import be.Repuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MTN
 */
@Stateless
public class RepuestoFacade extends AbstractFacade<Repuesto> implements RepuestoFacadeLocal {

    @PersistenceContext(unitName = "crud_java-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepuestoFacade() {
        super(Repuesto.class);
    }
    
}
