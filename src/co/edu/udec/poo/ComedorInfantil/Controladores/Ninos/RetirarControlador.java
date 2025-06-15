/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.RetirarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RetirarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.RetirarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RetirarControlador {
    
    private final RetirarCasoDeUso casoDeUso;

    public RetirarControlador(RetirarCasoDeUso casoDeUso) {
      this.casoDeUso=casoDeUso;
    }
    
    public RetirarRespuestaDto ejecutarAccion(RetirarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
    
   
    
   
    
   
    
}
