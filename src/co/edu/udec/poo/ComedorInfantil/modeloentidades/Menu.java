/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class Menu {
    
    
    private String NumMenu;
    private String Nombre;
    private List<Platos> platos;
    
    //Constructor
    public Menu(String Nombre, String NumMenu){
        this.Nombre=Nombre;
        this.NumMenu=NumMenu;
        this.platos= new ArrayList<>();
        
    }
  
    
     public void agregarPlato(Platos plato) {
        platos.add(plato);
    }
    
    //GETTERS
      public String getNumMenu() {
        return NumMenu;
    }

    public String getNombre() {
        return Nombre;
    }

    public List<Platos> getPlatos(){
        return platos;
    }
    //SETTERS
    public void setNumMenu(String NumMenu) {
        this.NumMenu = NumMenu;
    }

    public void setNombre(String Nombre) {
        this.Nombre=Nombre;
    }
       
}   

    
