/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Pagadores;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.ListarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.ListarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagadores.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagadorCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ListarCasoDeUsoPagadores {
    private final PagadorCrud pCrud;

    public ListarCasoDeUsoPagadores(PagadorCrud pCrud) {
        this.pCrud = pCrud;
    }
    
    
     public ListarRespuestaDto procesar() throws Exception{
        
        try {
            
            List<Pagador> pagadores=pCrud.listar();
            List<ListarPeticionDto> peticion = pagadores.stream().map(p -> new ListarPeticionDto (p.getDni(), p.getNombre(), p.getDireccion(), 
            p.getTelefono(), p.getNumeroCuenta())).collect(Collectors.toList());
            return new ListarRespuestaDto(peticion);
        
        } catch (Exception e) {
            String msj="Error al momento de listar" + e.getMessage();
            throw new Exception (msj);
        }
        
    }
}
