/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Menus;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Menus.AggPlatoCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.AggPlatoPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.AggPlatoRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class AggPlatoControlador {
    
    private final AggPlatoCasoDeUso casoDeUso;

    public AggPlatoControlador(AggPlatoCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public AggPlatoRespuestaDto ejecutarAccion (AggPlatoPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
    
}
