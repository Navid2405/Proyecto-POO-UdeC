/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino;

/**
 *
 * @author Navid Lobato
 */
public class ListarPeticionDto {
             private final String Dni;
    private final String Nombre;
    private  final String Direccion;
    private final String Telefono;
    private final String Relacion;

    public ListarPeticionDto(String Dni, String Nombre, String Direccion, String Telefono, String Relacion) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Relacion = Relacion;
    }

    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getRelacion() {
        return Relacion;
    }

    
}
