/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class RetirarRespuestaDto {
    private final String identificacion;

    public RetirarRespuestaDto(String identificacion) throws Exception {
        if(identificacion == null || identificacion.isEmpty()){
            String msj= "El campo de identifcacion no puede estar vacio";
            throw new Exception (msj);
            
        }
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}
