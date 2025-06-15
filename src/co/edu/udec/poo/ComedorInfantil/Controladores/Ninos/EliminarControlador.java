/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.EliminarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EliminarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EliminarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class EliminarControlador {
    
    private final EliminarCasoDeUso casoDeUso;

    public EliminarControlador(EliminarCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public EliminarRespuestaDto ejecutarAccion(EliminarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
        
    }
    
}
