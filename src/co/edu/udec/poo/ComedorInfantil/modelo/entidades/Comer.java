/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.entidades;

import java.util.Date;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author Navid Lobato
 */
@Entity(name= "Comedor")
public class Comer implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;
    private String Fecha;
    private String IdentificacionNino;
    private String NumeroMenu;
    private int CantComidas;
    
    @ManyToOne
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion")

    private Ninos nino_comer;
    
    

    public Comer() {
    }
    
    
    public Comer(String Fecha, String identificacionNino, String nombreMenu, int CantComidas){
        this.CantComidas=CantComidas;
        this.IdentificacionNino= identificacionNino;
        this.NumeroMenu = nombreMenu;
        this.Fecha=Fecha;
        
    }
    
    
    
    public String getIdentificacionNino(){
        return IdentificacionNino;
    }
    
    public String getnumeroMenu(){
        return NumeroMenu;
    }
    
    public int getCantCOmidas(){
        return CantComidas;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getCantComidas() {
        return CantComidas;
    }

    public String getNumeroMenu() {
        return NumeroMenu;
    }

    public Ninos getNino_comer() {
        return nino_comer;
    }
    
    
    

  @Override
  public String toString(){
      return "Fecha:" + Fecha + ", Menu:" + NumeroMenu + ", Cantidad:" + CantComidas;
  }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNino_comer(Ninos nino_comer) {
        this.nino_comer = nino_comer;
    }
    
    
    
    

}
