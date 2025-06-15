/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarPeticionDto {
    
    private final String nombre;
    private final String ingredientes;
   

    public RegistrarPeticionDto(String nombre, String ingredientes) {
        this.nombre = nombre;
        this.ingredientes=ingredientes;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }
    
    

    
    
    
    
}
