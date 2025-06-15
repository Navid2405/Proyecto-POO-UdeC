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
public class ConsultarBajasRespuestaDto {
    private final List<ConsultarBajasPeticionDto> peticion;
    public ConsultarBajasRespuestaDto(List<ConsultarBajasPeticionDto> peticion) throws Exception {
    
        this.peticion= peticion;

    }

    public List<ConsultarBajasPeticionDto> getPeticion() {
        return peticion;
    }
    
    

}
