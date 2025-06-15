/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Comedor;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor.ListarCasoDeUsoComedor;
import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor.RegistrarCasoDeUsoComedor;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarControladorComedor {
        private final RegistrarCasoDeUsoComedor casoDeUso;

    public RegistrarControladorComedor(RegistrarCasoDeUsoComedor casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public RegistrarRespuestaDto ejecutarAccion (RegistrarPeticionDto peticion) throws Exception{
        
        return casoDeUso.procesar(peticion);
        
    }
}
