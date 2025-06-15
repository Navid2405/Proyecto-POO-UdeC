/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Pagos;


import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagos.RegistrarCasoDeUsoPagos;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarControladorPagos {
    
     private final RegistrarCasoDeUsoPagos casoDeUso;

    public RegistrarControladorPagos(RegistrarCasoDeUsoPagos casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public RegistrarRespuestaDto ejecutarAccion (RegistrarPeticionDto peticion) throws Exception{
        
        return casoDeUso.procesar(peticion);
        
    }
}
