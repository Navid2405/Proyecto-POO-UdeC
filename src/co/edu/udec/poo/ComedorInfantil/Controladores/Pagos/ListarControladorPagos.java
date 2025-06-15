/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos.ListarCasoDeUsoPagos;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class ListarControladorPagos {
    private final ListarCasoDeUsoPagos casoDeUso;

    public ListarControladorPagos(ListarCasoDeUsoPagos casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public ListarRespuestaDto ejecutarAccion () throws Exception{
        
        return casoDeUso.procesar();
        
    }
    
}
