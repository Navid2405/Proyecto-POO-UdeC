/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Controladores.Platos;

import co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Platos.AgregarIngredientesCasoDeUsoPlatos;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.AgregarIngredientePeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.AgregarIngredienteRespuestaDto;

/**
 *
 * @author Navid Lobato
 */
public class AgregarIngredienteControladorPlatos {
    
    private final AgregarIngredientesCasoDeUsoPlatos casoDeUso;

    public AgregarIngredienteControladorPlatos(AgregarIngredientesCasoDeUsoPlatos casoDeUso) {
        this.casoDeUso = casoDeUso;
    }
    
    public AgregarIngredienteRespuestaDto ejecutarAccion (AgregarIngredientePeticionDto peticion) throws Exception{
        
        return casoDeUso.ejecutar(peticion);
        
    }
}
