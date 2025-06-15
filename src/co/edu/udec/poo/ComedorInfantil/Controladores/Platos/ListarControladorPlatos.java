/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Platos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino.ListarCasoDeUsoBuscadores;
import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Platos.ListarCasoDeUsoPlatos;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ListarControladorPlatos {
    private final ListarCasoDeUsoPlatos casoDeUso;

    public ListarControladorPlatos(ListarCasoDeUsoPlatos casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ListarRespuestaDto ejecutarAccion() throws Exception{
        return casoDeUso.procesar();
    }
}
