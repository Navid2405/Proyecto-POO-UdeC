/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;

import co.edu.udec.poo.ComedorInfantil.modeloentidades.Platos;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class PlatosCrud {
    private Map<String, Platos> platos; 

    public PlatosCrud() {
        platos = new HashMap<>();
    }

    public void agregarPlato(Platos plato) {
        platos.put(plato.getNombre(), plato);
    }

    public void aggIngrediente(String nombrePlato, String ingrediente) throws Exception{
        Platos plato = platos.get(nombrePlato);
        if (plato!=null) {
            //plato.aggIngrediente(ingrediente);
            System.out.println("Ingrediente agregado a " + nombrePlato);
        } else {
            throw new Exception("No se encontro el plato para registrar ingredientes");
        }
    }

    public void mostrarPlatos() {
        for (Platos plato : platos.values()) {
            System.out.println(plato);
        }
    }
}
