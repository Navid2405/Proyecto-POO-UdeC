/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores.ListarCasoDeUsoPagadores;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ListarControladorPagadores {
    
    private final ListarCasoDeUsoPagadores casoDeUso;

    public ListarControladorPagadores(ListarCasoDeUsoPagadores casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ListarRespuestaDto ejecutarAccion () throws Exception{
        return casoDeUso.procesar();
        
    }
}
