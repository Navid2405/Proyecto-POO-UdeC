/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.BuscarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.BuscarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.BuscarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class BuscarControlador {
    private final BuscarCasoDeUso casoDeUso;

    public BuscarControlador(BuscarCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public BuscarRespuestaDto ejecutarAccion(BuscarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
        
    }
    
}
