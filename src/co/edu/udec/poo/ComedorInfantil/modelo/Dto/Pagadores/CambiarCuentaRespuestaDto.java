/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores;

/**
 *
 * @author Navid Lobato
 */
public class CambiarCuentaRespuestaDto {
     private final String nuevoNumCuenta;
    private final String dni;

    public CambiarCuentaRespuestaDto(String nuevoNumCuenta, String dni) {
        this.nuevoNumCuenta = nuevoNumCuenta;
        this.dni = dni;
    }

    public String getNuevoNumCuenta() {
        return nuevoNumCuenta;
    }

    public String getDni() {
        return dni;
    }
}
