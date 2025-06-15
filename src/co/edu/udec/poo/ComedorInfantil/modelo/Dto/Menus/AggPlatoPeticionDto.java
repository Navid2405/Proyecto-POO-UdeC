/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus;

/**
 *
 * @author Navid Lobato
 */
public class AggPlatoPeticionDto {
    private final String nombrePlato;
    private final String nombreMenu;

    public AggPlatoPeticionDto(String nombrePlato, String nombreMenu) {
        this.nombrePlato = nombrePlato;
        this.nombreMenu = nombreMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    
    
    
    
}
