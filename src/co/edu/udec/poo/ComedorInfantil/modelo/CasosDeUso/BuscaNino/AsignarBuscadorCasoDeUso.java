/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.AsignarBuscadorPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.AsignarBuscadorRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.BuscaNinoCrud;



/**
 *
 * @author Navid Lobato
 */
public class AsignarBuscadorCasoDeUso {
    private final BuscaNinoCrud buscaCrud;

    public AsignarBuscadorCasoDeUso(BuscaNinoCrud buscaCrud) {
        this.buscaCrud = buscaCrud;
    }
    
    public AsignarBuscadorRespuestaDto procesar (AsignarBuscadorPeticionDto peticion) throws Exception{
        
        try {
            buscaCrud.asignarBuscador(peticion.getDni(), peticion.getIdentificacion());
            return new AsignarBuscadorRespuestaDto(peticion.getDni(), peticion.getIdentificacion());
        } catch (Exception e) {
            String msj="No se pudo asignar el buscado al nino";
            throw new Exception (msj);
        }
        
    }
    
}
