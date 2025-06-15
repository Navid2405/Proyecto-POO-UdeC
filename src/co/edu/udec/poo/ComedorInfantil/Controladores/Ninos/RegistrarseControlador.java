/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.RegistrarseCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RegistrarsePeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RegistrarseRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarseControlador {
    
    private final RegistrarseCasoDeUso casoDeUso;

    public RegistrarseControlador(RegistrarseCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }

   public RegistrarseRespuestaDto ejecutarAccion(RegistrarsePeticionDto peticion) throws Exception{
       return casoDeUso.procesar(peticion);
       
   }

    
    
    
}
