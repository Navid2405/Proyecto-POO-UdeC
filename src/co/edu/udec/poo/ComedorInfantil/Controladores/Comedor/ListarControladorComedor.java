/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Comedor;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor.ListarCasoDeUsoComedor;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ListarControladorComedor {
    private final ListarCasoDeUsoComedor casoDeUso;

    public ListarControladorComedor(ListarCasoDeUsoComedor casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ListarRespuestaDto ejecutarAccion () throws Exception{
        
        return casoDeUso.procesar();
        
    }
}
