/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos;

/**
 *
 * @author Navid Lobato
 */
public class AgregarIngredientePeticionDto {
    
    private final String nombrePlato;
    private final String ingrediente;

    public AgregarIngredientePeticionDto(String nombrePlato, String ingrediente) {
        this.nombrePlato = nombrePlato;
        this.ingrediente = ingrediente;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public String getIngrediente() {
        return ingrediente;
    }
    
    
}
