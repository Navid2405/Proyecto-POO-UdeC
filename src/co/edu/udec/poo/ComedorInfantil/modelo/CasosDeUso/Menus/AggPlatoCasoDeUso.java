/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Menus;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.AggPlatoPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.AggPlatoRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.MenuCrud;

/**
 *
 * @author Navid Lobato
 */
public class AggPlatoCasoDeUso {
    
    private final MenuCrud mCrud;

    public AggPlatoCasoDeUso(MenuCrud mCrud) {
        this.mCrud = mCrud;
    }
    
    public AggPlatoRespuestaDto procesar(AggPlatoPeticionDto peticion) throws Exception{
        try {
            mCrud.AggPlato(peticion.getNombrePlato(), peticion.getNombreMenu());
            return new AggPlatoRespuestaDto(peticion.getNombrePlato(), peticion.getNombreMenu());
        } catch (Exception e) {
            String msj = "Error al Aggplato al menu" +e.getMessage();
            throw new Exception(msj);
        }
    }
}
