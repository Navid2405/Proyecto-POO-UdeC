/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Menus;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.MenuCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Menu;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ListarCasoDeUso {

    private final MenuCrud mCrud;

    public ListarCasoDeUso(MenuCrud mCrud) {
        this.mCrud = mCrud;
    }

    public ListarRespuestaDto procesar() throws Exception {
        try {

            List<Menu> menus = mCrud.Listar();
            List<ListarPeticionDto> peticion = menus.stream().map(menu
                    -> new ListarPeticionDto(
                            menu.getNombre(),
                            menu.getNumMenu(),
                            menu.getPlatos().stream()
                                    .map(p -> p.getNombre())
                                    .collect(Collectors.toList())
                    )
            ).collect(Collectors.toList());

            return new ListarRespuestaDto(peticion);
        } catch (Exception e) {
            String msj = "Error al registrar menu en el sistema.";
            throw new Exception(msj);
        }
    }

}
