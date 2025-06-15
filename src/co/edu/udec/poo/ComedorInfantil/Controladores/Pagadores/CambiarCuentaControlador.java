/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores.CambiarCuentaCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.CambiarCuentaRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class CambiarCuentaControlador {
    private final CambiarCuentaCasoDeUso casoDeUso;

    public CambiarCuentaControlador(CambiarCuentaCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    
    public CambiarCuentaRespuestaDto ejecutarAccion (CambiarCuentaPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
    
}
