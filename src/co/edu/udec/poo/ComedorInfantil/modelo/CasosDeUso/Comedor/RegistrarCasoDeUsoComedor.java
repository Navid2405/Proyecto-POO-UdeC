/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.ComerCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Comer;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarCasoDeUsoComedor {
    private final ComerCrud cCrud;

    public RegistrarCasoDeUsoComedor(ComerCrud cCrud) {
        this.cCrud = cCrud;
    }

   public RegistrarRespuestaDto procesar(RegistrarPeticionDto peticion) throws Exception{
       
       try {
           Comer com= new Comer(peticion.getFecha(), peticion.getIdentificacionNino(), peticion.getNumeroMenu(), peticion.getCantComidas());
           cCrud.registrarComida(com);
           return new RegistrarRespuestaDto (peticion.getFecha(), peticion.getIdentificacionNino(), peticion.getNumeroMenu(), peticion.getCantComidas());

       } catch (Exception e) {
           throw new Exception ("Error al registrar en el sistema" + e.getMessage());
       }
       
   }
    
    
    
    
}
