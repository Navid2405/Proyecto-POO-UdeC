/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Navid Lobato
 */
@Entity
public class Platos implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String Ingredientes;
    
    //relaciones 
    @ManyToOne
    @JoinColumn(name = "nombre_menu")
    private Menu menu;
    
    
    //METODOS

    public Platos() {
    }
    
    
    
    public Platos(String Nombre, String Ingredientes){
            this.Nombre=Nombre;
            //this.Ingredientes= new ArrayList<>();
            this.Ingredientes= Ingredientes;
        
    }
    
    
    
    /*public void aggIngrediente(String Ingrediente){
        Ingredientes.add(Ingrediente);
        
    }*/
    
    //GET
    public String getNombre(){
        return Nombre;
    }
    
    public String getIngredientes(){
        return Ingredientes;
    }
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //SET
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
        
    }
    public void setIngredientes(String Ingredientes){
        this.Ingredientes=Ingredientes;
    }
    
    @Override
    public String toString() {
        return this.Nombre + " - Ingredientes: " + this.Ingredientes;
    }
    
}
