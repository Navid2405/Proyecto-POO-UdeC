/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.MostrarTodosPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.MostrarTodosRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class MostrarTodosCasoDeUso {

    private final NinosCrud ninosCrud;

    public MostrarTodosCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }

    public MostrarTodosRespuestaDto procesar() throws Exception {

        try {

            List<Ninos> lista = ninosCrud.Listar();
            List<MostrarTodosPeticionDto> peticion = lista.stream().map(n -> new MostrarTodosPeticionDto(n.getNombre(), n.getIdentificacion(),
                    n.getNumeroMatricula(), n.getEstado(), n.getFechaIngreso(), n.getFechaBaja(), n.getNacimiento())).collect(Collectors.toList());
            return new MostrarTodosRespuestaDto(peticion);
        } catch (Exception e) {
            String msj = "Error en el proceso de consulta" + e.getMessage();
            throw new Exception(msj);
        }

    }

}
