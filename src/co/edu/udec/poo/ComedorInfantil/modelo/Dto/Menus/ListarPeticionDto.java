/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus;

import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class ListarPeticionDto {
    private final String nombre;
    private  final String numMenu;
    private final List<String> platos;

    public ListarPeticionDto(String nombre, String numMenu, List<String> platos) {
        this.nombre = nombre;
        this.numMenu = numMenu;
        this.platos = platos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumMenu() {
        return numMenu;
    }

    public List<String> getPlatos() {
        return platos;
    }
    
    
}
