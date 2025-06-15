/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Menus;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Menus.ListarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ListarControlador {
    
    private final ListarCasoDeUso casoDeUso;

    public ListarControlador(ListarCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ListarRespuestaDto ejecutarAccion() throws Exception{
        return casoDeUso.procesar();
    }
}
