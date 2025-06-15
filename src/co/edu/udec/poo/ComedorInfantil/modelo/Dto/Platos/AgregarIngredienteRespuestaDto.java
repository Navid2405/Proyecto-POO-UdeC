/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos;

import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class AgregarIngredienteRespuestaDto {
    
    private final String nombrePlato;
    private final List<String> ingredientes;

    public AgregarIngredienteRespuestaDto(String nombrePlato, List<String> ingredientes) {
        this.nombrePlato = nombrePlato;
        this.ingredientes = ingredientes;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
    
    
    
}
