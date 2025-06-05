/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.Date;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Navid Lobato
 */
public class Comer {
    private int Id;
    private Date Fecha;
    private String IdentificacionNino;
    private String NumeroMenu;
    private int CantComidas;
    
    
    public Comer(Date Fecha, Ninos nino, Menu menu, int CantComidas){
        Random random= new Random();
        this.Id= random.nextInt(1000);
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

}
