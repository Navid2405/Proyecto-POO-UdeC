/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.AsignarPagadorPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.AsignarPagadorRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagadorCrud;

/**
 *
 * @author Navid Lobato
 */
public class AsignarPagadorCasoDeUso {
    private final PagadorCrud pCrud;

    public AsignarPagadorCasoDeUso(PagadorCrud pCrud) {
        this.pCrud = pCrud;
    }
     
     public AsignarPagadorRespuestaDto procesar(AsignarPagadorPeticionDto peticion) throws Exception{
        
        try {
            pCrud.asignarPagador(peticion.getDni(), peticion.getIdentificacion());
            return new AsignarPagadorRespuestaDto(peticion.getDni(), peticion.getIdentificacion());
        
        } catch (Exception e) {
            String msj="No se pudo cambiar numero de cuenta al pagador" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
}
