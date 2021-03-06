package Modelos;
// Generated 12/11/2015 08:24:19 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Controles generated by hbm2java
 */
public class Controles  implements java.io.Serializable {


     private Integer idControl;
     private Embarazo embarazo;
     private Date fecha;
     private boolean realizado;

    public Controles() {
    }

    public Controles(Embarazo embarazo, Date fecha, boolean realizado) {
       this.embarazo = embarazo;
       this.fecha = fecha;
       this.realizado = realizado;
    }
   
    public Integer getIdControl() {
        return this.idControl;
    }
    
    public void setIdControl(Integer idControl) {
        this.idControl = idControl;
    }
    public Embarazo getEmbarazo() {
        return this.embarazo;
    }
    
    public void setEmbarazo(Embarazo embarazo) {
        this.embarazo = embarazo;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public boolean isRealizado() {
        return this.realizado;
    }
    
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }




}


