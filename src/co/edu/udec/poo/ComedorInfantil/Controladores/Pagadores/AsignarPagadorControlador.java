/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores.AsignarPagadorCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.AsignarPagadorPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.AsignarPagadorRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class AsignarPagadorControlador {
    private final AsignarPagadorCasoDeUso casoDeUso;

    public AsignarPagadorControlador(AsignarPagadorCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public AsignarPagadorRespuestaDto ejecutarAccion(AsignarPagadorPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
        
    }
}
