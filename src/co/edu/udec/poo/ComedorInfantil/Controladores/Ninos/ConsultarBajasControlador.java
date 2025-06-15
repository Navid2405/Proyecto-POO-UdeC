/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.ConsultarBajasCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.ConsultarBajasPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.ConsultarBajasRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ConsultarBajasControlador {
    private final ConsultarBajasCasoDeUso casoDeUso;

    public ConsultarBajasControlador(ConsultarBajasCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ConsultarBajasRespuestaDto ejecutarAccion() throws Exception{
        return casoDeUso.procesar();
    }
    
}
