/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ContarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ContarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.ComerCrud;

/**
 *
 * @author Navid Lobato
 */
public class ContarCasoDeUso {
    
    private final ComerCrud cCrud;

    public ContarCasoDeUso(ComerCrud cCrud) {
        this.cCrud = cCrud;
    }
     public ContarRespuestaDto procesar (ContarPeticionDto peticion) throws Exception{
         
         try {
             cCrud.contarComidas(peticion.getIdentificacion());
             return new ContarRespuestaDto(peticion.getIdentificacion());
         } catch (Exception e) {
             throw new Exception ("Error al contar las comidas");
         }
         
     }
    
}
