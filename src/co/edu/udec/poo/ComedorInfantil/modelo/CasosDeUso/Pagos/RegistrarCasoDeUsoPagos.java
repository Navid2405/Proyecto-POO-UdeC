/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagos;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarCasoDeUsoPagos {

    private final PagosCrud pCrud;

    public RegistrarCasoDeUsoPagos(PagosCrud pCrud) {
        this.pCrud = pCrud;
    }

    public RegistrarRespuestaDto procesar(RegistrarPeticionDto peticion) throws Exception {

        try {
            Pagos p = new Pagos(peticion.getId(),peticion.getFecha(), peticion.getCostoComida(), peticion.getIdentificacion(), peticion.getDniPagador());
            pCrud.registrarPago(p);
            return new RegistrarRespuestaDto(peticion.getId(),peticion.getFecha(), peticion.getCostoComida(), peticion.getIdentificacion(), peticion.getDniPagador());
        } catch (Exception e) {
            String msj = "Error al registrar el pago";
            throw new Exception(msj);
        }
    }
}
