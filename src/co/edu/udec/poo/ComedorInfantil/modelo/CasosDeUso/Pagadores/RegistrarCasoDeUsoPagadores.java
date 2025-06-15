/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagadorCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarCasoDeUsoPagadores {
    
    private final PagadorCrud pCrud;

    public RegistrarCasoDeUsoPagadores(PagadorCrud pCrud) {
        this.pCrud = pCrud;
    }
    
    public RegistrarRespuestaDto procesar(RegistrarPeticionDto peticion) throws Exception{
        
        try {
            Pagador paga= new Pagador(peticion.getDni(),peticion.getNombre(),peticion.getDireccion(), peticion.getTelefono(), peticion.getNumeroCuenta() );
            pCrud.registrar(paga);
            return new RegistrarRespuestaDto(peticion.getDni(),peticion.getNombre(),peticion.getDireccion(), peticion.getTelefono(), peticion.getNumeroCuenta());
        
        } catch (Exception e) {
            String msj="No se pudo registrar el pagador" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
}
