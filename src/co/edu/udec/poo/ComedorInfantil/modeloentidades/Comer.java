/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.Date;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
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
    private Date Fecha;
    private String IdentificacionNino;
    private String NumeroMenu;
    private int CantComidas;
    
    @ManyToOne
     @JoinColumns({
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion"),
    @JoinColumn(name = "nino_matricula", referencedColumnName = "matricula")
})
    private Ninos nino_comer;
    
    

    public Comer() {
    }
    
    
    public Comer(Date Fecha, Ninos nino, Menu menu, int CantComidas){
        this.CantComidas=CantComidas;
        this.IdentificacionNino= nino.getIdentificacion();
        this.NumeroMenu = menu.getNumMenu();
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

}
