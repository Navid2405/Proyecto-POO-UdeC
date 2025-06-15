/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.BuscarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.BuscarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class BuscarCasoDeUso {
    private final NinosCrud ninosCrud;

    public BuscarCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }
    
    public BuscarRespuestaDto procesar(BuscarPeticionDto peticion) throws Exception{
        
        try{
        Ninos nino = ninosCrud.Buscar(peticion.getIdentificacion());
        BuscarRespuestaDto respuesta =  new BuscarRespuestaDto(nino.getNombre(), nino.getIdentificacion(), nino.getNacimiento(), nino.getNumeroMatricula());
        return respuesta;
        }catch(Exception e){
            String msj= "No se encontro el Nino\n" + e.getMessage();
            throw new Exception (msj);
        }
        
        
    }
    
}
