/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.entidades;

import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Menu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
    private String nombre;
    @ElementCollection
    @CollectionTable(name = "plato_ingredientes", joinColumns = @JoinColumn(name = "plato_nombre"))
    @Column(name = "ingrediente")
    private List<String> ingredientes;
    
    //relaciones 
    @ManyToOne
    @JoinColumn(name = "nombre_menu")
    private Menu menu;
    
    
    //METODOS

    public Platos() {
    }
    
    
    
    public Platos(String Nombre){
            this.nombre=Nombre;
            this.ingredientes= new ArrayList<>();
            
            
        
    }
    
    
    
    public void aggIngrediente(String Ingrediente){
        this.ingredientes.add(Ingrediente);
        
    }
    
    //GET
    public String getNombre(){
        return nombre;
    }
    
    public List <String> getIngredientes(){
        return ingredientes;
    }

    public Menu getMenu() {
        return menu;
    }
    
    
  
    
    //SET
    public void setNombre(String Nombre){
        this.nombre=Nombre;
        
    }
    public void setIngredientes(List<String> ingredientes){
        this.ingredientes = ingredientes;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
    
    @Override
    public String toString() {
        return this.nombre + " - Ingredientes: " + this.ingredientes;
    }
    
}
