/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.BuscaNino;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino.AsignarBuscadorCasoDeUso;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.AsignarBuscadorPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.AsignarBuscadorRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class AsignarBuscadorControlador {
    
    private final AsignarBuscadorCasoDeUso casoDeUso;

    public AsignarBuscadorControlador(AsignarBuscadorCasoDeUso casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public AsignarBuscadorRespuestaDto ejecutarAccion (AsignarBuscadorPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
}
