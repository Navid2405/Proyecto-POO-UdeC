/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;


import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EditarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EditarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class EditarCasoDeUso {
    private final NinosCrud ninosCrud;

    public EditarCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }
    
    public EditarRespuestaDto procesar(EditarPeticionDto peticion) throws Exception{
        
        try {
            Ninos nino= new Ninos(peticion.getNombre(), peticion.getNacimiento(), peticion.getIdentificacion(), peticion.getMatricula());
            ninosCrud.editar(nino);
            return new EditarRespuestaDto(nino.getNombre(), nino.getIdentificacion(), nino.getNumeroMatricula(), nino.getNacimiento());
            
            
        } catch (Exception e) {
            String msj="No se pudo editar el nino" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
    
}
