/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Navid Lobato
 */
@Entity(name = "Menus")
public class Menu implements Serializable {
    
    @Id
    private String Nombre;
    private String NumMenu;
    @OneToMany(mappedBy= "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Platos> platos= new ArrayList<>();
    
    
    //Constructor

    public Menu() {
        this.platos= new ArrayList<>();
    }
    
    
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

    public void setPlatos(List<Platos> platos) {
        this.platos = platos;
    }
    
    

  
       
}   

    
