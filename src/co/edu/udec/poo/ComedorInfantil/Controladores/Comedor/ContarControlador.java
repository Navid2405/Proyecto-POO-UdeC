/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Comedor;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor.ContarCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor.RegistrarCasoDeUsoComedor;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ContarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ContarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ContarControlador {
           private final ContarCasoDeUso casoDeUso;

    public ContarControlador(ContarCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ContarRespuestaDto ejecutarAccion (ContarPeticionDto peticion) throws Exception{
        
        return casoDeUso.procesar(peticion);
        
    }
}
