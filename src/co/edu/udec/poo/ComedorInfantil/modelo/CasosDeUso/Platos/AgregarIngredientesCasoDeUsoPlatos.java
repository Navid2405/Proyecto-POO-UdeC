/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.CasosDeUso.Platos;

import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.AgregarIngredientePeticionDto;
import co.edu.udec.poo.ComedorInfantil.modelo.Dto.Platos.AgregarIngredienteRespuestaDto;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PlatosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Platos;

/**
 *
 * @author Navid Lobato
 */
public class AgregarIngredientesCasoDeUsoPlatos {

    private final PlatosCrud pCrud;

    public AgregarIngredientesCasoDeUsoPlatos(PlatosCrud pCrud) {
        this.pCrud = pCrud;
    }

    public AgregarIngredienteRespuestaDto ejecutar(AgregarIngredientePeticionDto peticion) throws Exception {
        try {
            pCrud.aggIngrediente(peticion.getNombrePlato(), peticion.getIngrediente());
            Platos p = pCrud.buscarPlatoPorNombre(peticion.getNombrePlato());
            return new AgregarIngredienteRespuestaDto(p.getNombre(), p.getIngredientes());

        } catch (Exception e) {
            String msj="Error al registrar ingrediente";
            throw new Exception (msj + e.getMessage());
        }

    }

}
