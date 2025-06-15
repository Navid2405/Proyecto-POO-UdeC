/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Platos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PlatosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Platos;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ListarCasoDeUsoPlatos {
    private final PlatosCrud pCrud;

    public ListarCasoDeUsoPlatos(PlatosCrud pCrud) {
        this.pCrud = pCrud;
    }
    
    public ListarRespuestaDto procesar() throws Exception{
        try {
            List<Platos> platos = pCrud.mostrarPlatos();
            List<ListarPeticionDto> peticion = platos.stream().map(p -> new ListarPeticionDto(p.getNombre(), p.getIngredientes())).collect(Collectors.toList());
            return new ListarRespuestaDto (peticion);
        } catch (Exception e) {
            String msj="Error al listar";
            throw new Exception (msj);
        }
 
    }
    
}
