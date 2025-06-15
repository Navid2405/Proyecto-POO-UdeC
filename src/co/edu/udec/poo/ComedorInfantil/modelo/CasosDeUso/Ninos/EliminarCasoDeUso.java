/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EliminarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EliminarRespuestaDto;

import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;



/**
 *
 * @author Navid Lobato
 */
public class EliminarCasoDeUso {
    
    private final NinosCrud ninosCrud;

    public EliminarCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }
    
    public EliminarRespuestaDto procesar(EliminarPeticionDto peticion) throws Exception{
        
        try {
            ninosCrud.eliminar(peticion.getIdentificacion());
            return new  EliminarRespuestaDto(peticion.getIdentificacion());
            
        } catch (Exception e) {
            String msj="No se pudo eliminar el nino" + e.getMessage();
            throw new Exception (msj);
        }
    }
    

}
        
    