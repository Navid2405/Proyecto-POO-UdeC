/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Menus;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.MenuCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Menu;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarCasoDeUso {
    private final MenuCrud mCrud;

    public RegistrarCasoDeUso(MenuCrud mCrud) {
        this.mCrud = mCrud;
    }
    
    public RegistrarRespuestaDto procesar (RegistrarPeticionDto peticion) throws Exception{
        try {
            Menu m= new Menu(peticion.getNombreMenu(), peticion.getNunMenu());
            mCrud.aggMenu(m);
            return new RegistrarRespuestaDto (peticion.getNombreMenu(), peticion.getNunMenu());
        } catch (Exception e) {
            String msj="Error al registrar menu en el sistema.";
            throw new Exception (msj);
        }
    }
}
