/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class EliminarRespuestaDto {
    
     private final String identificacion;

    public EliminarRespuestaDto(String identificacion) throws Exception {
        if(identificacion == null || identificacion.isEmpty()){
            throw new Exception("El campo identificacion esta vacio");
            
        }
        this.identificacion = identificacion;
    }
    
   

    public String getIdentificacion() {
        return identificacion;
    }
    
}
