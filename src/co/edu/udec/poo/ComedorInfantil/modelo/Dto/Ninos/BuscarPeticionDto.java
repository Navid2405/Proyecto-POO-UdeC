/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class BuscarPeticionDto {
    
    private final String identificacion;

    public BuscarPeticionDto(String identificacion) {
        if(identificacion == null || identificacion.isEmpty()){
            
        }
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    
     
    
    
}
