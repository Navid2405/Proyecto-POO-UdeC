/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores.BuscarCasoDeUsoPagadores;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.BuscarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.BuscarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class BuscarControladorPagadores {
        private final BuscarCasoDeUsoPagadores casoDeUso;

    public BuscarControladorPagadores(BuscarCasoDeUsoPagadores casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public BuscarRespuestaDto ejecutarAccion(BuscarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
        
    }
}
