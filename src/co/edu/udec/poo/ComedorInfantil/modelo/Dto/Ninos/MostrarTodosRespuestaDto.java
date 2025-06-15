/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class MostrarTodosRespuestaDto {
    
    private final List<MostrarTodosPeticionDto> peticion;

    public MostrarTodosRespuestaDto(List<MostrarTodosPeticionDto> peticion) {
        this.peticion = peticion;
    }

    public List<MostrarTodosPeticionDto> getPeticion() {
        return peticion;
    }
    
    
    
    
    
}
