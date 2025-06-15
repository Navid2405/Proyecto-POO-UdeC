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
public class ListarPeticionDto {

    private final String nombre;
    private final List<String> ingredientes;

    public ListarPeticionDto(String nombre, List<String> ingredientes){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }


    public List<String> getIngredientes() {
        return ingredientes;

    }

}
