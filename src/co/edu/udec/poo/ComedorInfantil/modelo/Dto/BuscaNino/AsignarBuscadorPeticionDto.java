/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino;

/**
 *
 * @author Navid Lobato
 */
public class AsignarBuscadorPeticionDto {
    
    private final String dni;
    private final String identificacion;

    public AsignarBuscadorPeticionDto(String dni, String identificacion) throws Exception {

        if (dni.trim().isEmpty()) {
            String msj = "El campo Dni no puede estar vacio";
            throw new Exception(msj);
        }
        if (identificacion.trim().isEmpty()) {
            String msj = "El campo identificacion no puede estar vacio";
            throw new Exception(msj);
        }
        this.dni = dni;
        this.identificacion = identificacion;
    }

    public String getDni() {
        return dni;
    }

    public String getIdentificacion() {
        return identificacion;
    }


    
}
