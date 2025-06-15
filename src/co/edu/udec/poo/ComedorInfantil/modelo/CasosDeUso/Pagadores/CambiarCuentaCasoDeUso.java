/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagadorCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;

/**
 *
 * @author Navid Lobato
 */
public class CambiarCuentaCasoDeUso {
    private final PagadorCrud pCrud;

    public CambiarCuentaCasoDeUso(PagadorCrud pCrud) {
        this.pCrud = pCrud;
    }

     public CambiarCuentaRespuestaDto procesar(CambiarCuentaPeticionDto peticion) throws Exception{
        
        try {
            pCrud.cambiarNumCuenta(peticion.getNuevoNumCuenta(), peticion.getDni());
            return new CambiarCuentaRespuestaDto(peticion.getNuevoNumCuenta(), peticion.getDni());
        
        } catch (Exception e) {
            String msj="No se pudo cambiar numero de cuenta al pagador" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
    
}
