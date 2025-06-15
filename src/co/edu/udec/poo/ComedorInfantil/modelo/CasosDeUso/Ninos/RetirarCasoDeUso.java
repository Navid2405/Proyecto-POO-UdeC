/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RetirarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RetirarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;

/**
 *
 * @author Navid Lobato
 */
public class RetirarCasoDeUso {
    
    private final NinosCrud ninosCrud;

    public RetirarCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }
    
    public RetirarRespuestaDto procesar (RetirarPeticionDto peticion) throws Exception{
        
        try {
            ninosCrud.Retirar(peticion.getIdentificacion());
            return new RetirarRespuestaDto (peticion.getIdentificacion());
            
        } catch (Exception e) {
            String msj="No se pudo retirar el nino" + e.getMessage();
            throw new Exception (msj);
        }
        
        
    }
    
    
}
