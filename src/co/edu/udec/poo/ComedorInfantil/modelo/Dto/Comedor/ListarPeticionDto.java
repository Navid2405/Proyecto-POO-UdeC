/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Comedor;

/**
 *
 * @author Navid Lobato
 */
public class ListarPeticionDto {
    private String Fecha;
    private String IdentificacionNino;
    private String NumeroMenu;
    private int CantComidas;

    public ListarPeticionDto(String Fecha, String IdentificacionNino, String NumeroMenu, int CantComidas) {
        this.Fecha = Fecha;
        this.IdentificacionNino = IdentificacionNino;
        this.NumeroMenu = NumeroMenu;
        this.CantComidas = CantComidas;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getIdentificacionNino() {
        return IdentificacionNino;
    }

    public String getNumeroMenu() {
        return NumeroMenu;
    }

    public int getCantComidas() {
        return CantComidas;
    }
    
    
    
    
    
}
