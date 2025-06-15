/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores.RegistrarCasoDeUsoPagadores;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarControladorPagadores {
    private final RegistrarCasoDeUsoPagadores casoDeUso;

    public RegistrarControladorPagadores(RegistrarCasoDeUsoPagadores casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public RegistrarRespuestaDto ejecutarAccion (RegistrarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
}
