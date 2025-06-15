/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RegistrarsePeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RegistrarseRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarseCasoDeUso {

    private final NinosCrud ninosCrud;

    public RegistrarseCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }

    public RegistrarseRespuestaDto procesar(RegistrarsePeticionDto peticion) throws Exception {
        try{
       
        Ninos nino = new Ninos(peticion.getNombre(),peticion.getNacimiento(), peticion.getIdentificacion(), peticion.getNumeroMatricula());
        ninosCrud.Agregar(nino);
        return new RegistrarseRespuestaDto(nino.getNombre(), nino.getIdentificacion(), nino.getNumeroMatricula(), nino.getNacimiento());
        }catch(Exception e){
            String msj="No se pudo registrar el nino" + e.getMessage();
            throw new Exception (msj);
            
             
        }
    }
}
