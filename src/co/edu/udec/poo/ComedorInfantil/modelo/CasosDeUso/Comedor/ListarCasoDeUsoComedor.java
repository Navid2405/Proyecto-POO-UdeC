/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Comedor;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.ComerCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Comer;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ListarCasoDeUsoComedor {
    private final ComerCrud cCrud;

    public ListarCasoDeUsoComedor(ComerCrud cCrud) {
        this.cCrud = cCrud;
    }
    
     public ListarRespuestaDto procesar () throws Exception{
         
         try {
             List<Comer> lista= cCrud.listarComidas();
             List<ListarPeticionDto> peticion = lista.stream().map( p -> new ListarPeticionDto (
                p.getFecha(), p.getIdentificacionNino(), p.getnumeroMenu(), p.getCantComidas()) ).collect(Collectors.toList());
             return new ListarRespuestaDto(peticion);
         } catch (Exception e) {
            throw new Exception ("Error al listar los que han comido");
         }
         
     }
    
    
}
