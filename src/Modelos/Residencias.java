package Modelos;
// Generated 12/11/2015 08:24:19 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Residencias generated by hbm2java
 */
public class Residencias  implements java.io.Serializable {


     private Integer idResidencia;
     private String nombre;
     private Set madreses = new HashSet(0);

    public Residencias() {
    }

	
    public Residencias(String nombre) {
        this.nombre = nombre;
    }
    public Residencias(String nombre, Set madreses) {
       this.nombre = nombre;
       this.madreses = madreses;
    }
   
    public Integer getIdResidencia() {
        return this.idResidencia;
    }
    
    public void setIdResidencia(Integer idResidencia) {
        this.idResidencia = idResidencia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getMadreses() {
        return this.madreses;
    }
    
    public void setMadreses(Set madreses) {
        this.madreses = madreses;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }




}


