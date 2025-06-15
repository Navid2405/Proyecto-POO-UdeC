/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.MostrarTodosCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.MostrarTodosRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class MostrarTodosControlador {
    
    private final MostrarTodosCasoDeUso casoDeUso;

    public MostrarTodosControlador(MostrarTodosCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public MostrarTodosRespuestaDto ejecutarAccion() throws Exception{
        return casoDeUso.procesar();
        
    }
    
}
