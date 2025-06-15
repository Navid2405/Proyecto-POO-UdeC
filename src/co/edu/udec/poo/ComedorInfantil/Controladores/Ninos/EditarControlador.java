/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos.EditarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EditarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.EditarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class EditarControlador {
    
    private final EditarCasoDeUso casoDeUso;

    public EditarControlador(EditarCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public EditarRespuestaDto ejecutarAccion(EditarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
        
    }
    
}
