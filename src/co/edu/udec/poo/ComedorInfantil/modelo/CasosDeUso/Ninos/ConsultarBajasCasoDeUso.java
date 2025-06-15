/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Ninos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.ConsultarBajasPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos.ConsultarBajasRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Navid Lobato
 */
public class ConsultarBajasCasoDeUso {
    private final NinosCrud ninosCrud;

    public ConsultarBajasCasoDeUso(NinosCrud ninosCrud) {
        this.ninosCrud = ninosCrud;
    }
    
    public ConsultarBajasRespuestaDto procesar() throws Exception{
        try {
            List<Ninos> bajas= ninosCrud.ConsultarBajas();
            List<ConsultarBajasPeticionDto> peticion = bajas.stream().map(n -> new ConsultarBajasPeticionDto(n.getNombre(), n.getIdentificacion(),
                    n.getEstado(),n.getNumeroMatricula(), n.getFechaIngreso(), n.getFechaBaja(), n.getFechaIngreso())).collect(Collectors.toList());
            
            return new ConsultarBajasRespuestaDto(peticion);
            
        } catch (Exception e) {
            String msj="Error en el proceso de consulta" + e.getMessage();
            throw new Exception(msj);
        }
        
    }
    
    
}
