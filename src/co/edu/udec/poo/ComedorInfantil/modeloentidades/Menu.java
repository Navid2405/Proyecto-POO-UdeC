/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String NumMenu;
    private String Nombre;
    
    @OneToMany(mappedBy= "menu")
    private List<Platos> platos;
    
    
    //Constructor

    public Menu() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       
}   

    
