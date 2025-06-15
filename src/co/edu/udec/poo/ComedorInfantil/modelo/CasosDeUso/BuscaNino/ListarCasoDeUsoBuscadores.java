/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.BuscaNino;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.BuscaNinoCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.BuscaNino;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ListarCasoDeUsoBuscadores {
    private final BuscaNinoCrud buscaCrud;

    public ListarCasoDeUsoBuscadores(BuscaNinoCrud buscaCrud) {
        this.buscaCrud = buscaCrud;
    }
    
    public ListarRespuestaDto procesar () throws Exception{
        try {
            List<BuscaNino> buscadores= buscaCrud.Listar();
            List<ListarPeticionDto> peticion = buscadores.stream().map( b -> new ListarPeticionDto(b.getDni(), b.getDireccion(),
                    b.getNombre(),b.getRelacion(), b.getTelefono()) ).collect(Collectors.toList());
            return new ListarRespuestaDto(peticion);
        } catch (Exception e) {
            String msj="Error al momneto de listar";
            throw new Exception (msj);
            
        }
    }
    
    
}
