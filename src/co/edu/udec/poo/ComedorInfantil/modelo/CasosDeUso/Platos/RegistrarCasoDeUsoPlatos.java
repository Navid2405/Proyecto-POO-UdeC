/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Platos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.RegistrarPeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.RegistrarRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PlatosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Platos;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarCasoDeUsoPlatos {
    
    private final PlatosCrud pCrud;

    public RegistrarCasoDeUsoPlatos(PlatosCrud pCrud) {
        this.pCrud = pCrud;
    }
    
    public RegistrarRespuestaDto procesar (RegistrarPeticionDto peticion) throws Exception{
        
        try {
            Platos p= new Platos(peticion.getNombre());
            pCrud.agregarPlato(p);
            return new RegistrarRespuestaDto(peticion.getNombre());
        } catch (Exception e) {
            String msj="Error al registrar el plato";
            throw new Exception (msj);
        }
        
    }
    
}
