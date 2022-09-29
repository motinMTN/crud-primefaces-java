/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import bc.TipoRepuestoFacadeLocal;
import be.TipoRepuesto;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author MTN
 */

@ManagedBean
@SessionScoped
public class ManagedBeanTipoRepuesto implements Serializable{

    @EJB
    private TipoRepuestoFacadeLocal tipoRepuestoFacade;   
    private TipoRepuesto objeto;
    private int tipo_accion = 1;

    public int getTipo_accion() {
        return tipo_accion;
    }

    public void setTipo_accion(int tipo_accion) {
        this.tipo_accion = tipo_accion;
    }
    
    
    public ManagedBeanTipoRepuesto(){
        objeto = new TipoRepuesto(); 
    }

    public TipoRepuesto getObjeto() {
        return objeto;
    }

    public void setObjeto(TipoRepuesto objeto) {
        this.objeto = objeto;
    }
    
    public List<TipoRepuesto> getLista(){
        return tipoRepuestoFacade.findAll();
    }
    
    public void reinstanciar(){
        this.objeto = new TipoRepuesto();
    }
    
    public void procesar(){
        if(tipo_accion == 1){
            //Crear
            objeto.setFechaRegistro(new Date());
            
            tipoRepuestoFacade.create(objeto);
        }
    }
    
}
