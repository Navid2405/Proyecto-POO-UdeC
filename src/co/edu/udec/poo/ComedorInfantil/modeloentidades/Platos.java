/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class Platos {
    private String Nombre;
    private List<String> Ingredientes;
    
    //METODOS
    public Platos(String Nombre, List<String> Ingredientes){
            this.Nombre=Nombre;
            this.Ingredientes= new ArrayList<>();
            this.Ingredientes= Ingredientes;
        
    }
    
    
    
    public void aggIngrediente(String Ingrediente){
        Ingredientes.add(Ingrediente);
        
    }
    //GET
    public String getNombre(){
        return Nombre;
    }
    
    public List<String> getIngredientes(){
        return Ingredientes;
    }
    
    //SET
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
        
    }
    public void setIngredientes(List<String> Ingredientes){
        this.Ingredientes=Ingredientes;
    }
    
    @Override
    public String toString() {
        return this.Nombre + " - Ingredientes: " + this.Ingredientes;
    }
    
}
