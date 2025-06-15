/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Menus;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarPeticionDto {
    private final String nombreMenu;
    private final String nunMenu;

    public RegistrarPeticionDto(String nombreMenu, String nunMenu) {
        this.nombreMenu = nombreMenu;
        this.nunMenu = nunMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public String getNunMenu() {
        return nunMenu;
    }
    
    
    
}
