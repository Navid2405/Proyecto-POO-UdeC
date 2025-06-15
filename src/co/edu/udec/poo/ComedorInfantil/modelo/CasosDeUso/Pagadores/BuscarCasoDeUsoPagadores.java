/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.BuscarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.BuscarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagadorCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;

/**
 *
 * @author Navid Lobato
 */
public class BuscarCasoDeUsoPagadores {
    private final PagadorCrud pCrud;

    public BuscarCasoDeUsoPagadores() {
        this.pCrud = null;
    }
     
     public BuscarRespuestaDto procesar(BuscarPeticionDto peticion) throws Exception{
        
        try {
            Pagador paga= pCrud.buscarPorDni(peticion.getDni());
            return new BuscarRespuestaDto(paga.getDni(), paga.getNombre(), paga.getDireccion(), paga.getTelefono(), paga.getNumeroCuenta());
        
        } catch (Exception e) {
            String msj="No se pudo relizar la busqueda de pagador" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
}
