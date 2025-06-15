/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.BuscaNino;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino.RegistrarCasoDeUsoBuscadores;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarControladorBuscadores {
    
    private final RegistrarCasoDeUsoBuscadores casoDeUso;

    public RegistrarControladorBuscadores(RegistrarCasoDeUsoBuscadores casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public RegistrarRespuestaDto ejecutarAccion (RegistrarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
    
}
