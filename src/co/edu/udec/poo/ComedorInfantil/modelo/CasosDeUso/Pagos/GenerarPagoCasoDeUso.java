/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.GenerarPagoPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.GenerarPagoRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagosCrud;

/**
 *
 * @author Navid Lobato
 */
public class GenerarPagoCasoDeUso {
    private final PagosCrud pCrud;

    public GenerarPagoCasoDeUso(PagosCrud pCrud) {
        this.pCrud = pCrud;
    }
    
    public GenerarPagoRespuestaDto procesar (GenerarPagoPeticionDto peticion) throws Exception{
        try {
            pCrud.generarPago(peticion.getIdPago());
            return new GenerarPagoRespuestaDto(peticion.getIdPago());
            
        } catch (Exception e) {
         String msj = "Error al Generar el pago";
            throw new Exception(msj);
        }
    }
}
