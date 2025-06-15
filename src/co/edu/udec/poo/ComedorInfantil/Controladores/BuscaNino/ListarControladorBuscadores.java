/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.BuscaNino;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino.ListarCasoDeUsoBuscadores;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ListarControladorBuscadores {
    
    private final ListarCasoDeUsoBuscadores casoDeUso;

    public ListarControladorBuscadores(ListarCasoDeUsoBuscadores casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ListarRespuestaDto ejecutarAccion() throws Exception{
        return casoDeUso.procesar();
    }
    
    
    
}
