/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos.GenerarPagoCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos.ListarCasoDeUsoPagos;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.GenerarPagoPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.GenerarPagoRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.ListarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class GenerarPagoControlador {
     private final GenerarPagoCasoDeUso casoDeUso;

    public GenerarPagoControlador(GenerarPagoCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public GenerarPagoRespuestaDto ejecutarAccion (GenerarPagoPeticionDto peticion) throws Exception{
        
        return casoDeUso.procesar(peticion);
        
    }
}
