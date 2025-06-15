/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.BuscaNinoCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.BuscaNino;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarCasoDeUsoBuscadores {
    
    private final BuscaNinoCrud buscaCrud;

    public RegistrarCasoDeUsoBuscadores(BuscaNinoCrud buscaCrud) {
        this.buscaCrud = buscaCrud;
    }
    
    public RegistrarRespuestaDto procesar (RegistrarPeticionDto peticion) throws Exception{
        try {
            
            BuscaNino busca= new BuscaNino(peticion.getDni(),peticion.getNombre(), peticion.getDireccion(), peticion.getTelefono(), peticion.getRelacion());
            buscaCrud.registrarse(busca);
            return new RegistrarRespuestaDto(peticion.getDni(),peticion.getNombre(), peticion.getDireccion(), peticion.getTelefono(), peticion.getRelacion());
        } catch (Exception e) {
            String msj="No se pudo registrar el buscador" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
    
    
    
}
