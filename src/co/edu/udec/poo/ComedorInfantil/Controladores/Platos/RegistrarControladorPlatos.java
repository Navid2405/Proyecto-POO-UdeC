/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Platos;


import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Platos.RegistrarCasoDeUsoPlatos;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.RegistrarRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarControladorPlatos {
    
    
    private final RegistrarCasoDeUsoPlatos casoDeUso;

    public RegistrarControladorPlatos(RegistrarCasoDeUsoPlatos casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    public RegistrarRespuestaDto ejecutarAccion (RegistrarPeticionDto peticion) throws Exception{
        return casoDeUso.procesar(peticion);
    }
    
}
