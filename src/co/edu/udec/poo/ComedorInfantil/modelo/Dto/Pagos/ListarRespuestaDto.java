/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos;

import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class ListarRespuestaDto {
    private final List<ListarPeticionDto> peticion;

    public ListarRespuestaDto(List<ListarPeticionDto> peticion) {
        this.peticion = peticion;
    }

    public List<ListarPeticionDto> getPeticion() {
        return peticion;
    }
    
    
    
    
}
