/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Menus;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Menus.RegistrarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarControlador {
    
    private final RegistrarCasoDeUso casoDeUso;

    public RegistrarControlador(RegistrarCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public RegistrarRespuestaDto ejecutarAccion (RegistrarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
        
    }
    
}
