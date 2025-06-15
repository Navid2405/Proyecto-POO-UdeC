/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagos;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ListarCasoDeUsoPagos {
    private final PagosCrud pCrud;

    public ListarCasoDeUsoPagos(PagosCrud pCrud) {
        this.pCrud = pCrud;
    }
    
    public ListarRespuestaDto procesar() throws Exception{
        try {
            List<Pagos> listaP= pCrud.Listar();
            List<ListarPeticionDto> peticion = listaP.stream().map( p -> new ListarPeticionDto (
                p.getFecha(), p.getCostoComida(), p.getIdentificacion(), p.getDniPagador())).collect(Collectors.toList());
            return new ListarRespuestaDto(peticion);
        } catch (Exception e) {
             String msj = "Error al listar los pagos";
            throw new Exception(msj);
        }
        
    }
}
