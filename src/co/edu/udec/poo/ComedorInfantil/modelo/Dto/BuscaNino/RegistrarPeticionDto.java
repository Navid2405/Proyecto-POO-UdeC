/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.BuscaNino;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarPeticionDto {
     private final String Dni;
    private final String Nombre;
    private  final String Direccion;
    private final String Telefono;
    private final String Relacion;

    public RegistrarPeticionDto(String Dni, String Nombre, String Direccion, String Telefono, String Relacion) throws Exception {
        
        if(Nombre.trim().isEmpty() || Nombre == null){
            String msj="El campo nombre no puede estar vacio";
            throw new Exception (msj);
            
        }
        if(Dni.trim().isEmpty() || Dni == null){
            String msj="El campo Dni no puede estar vacio";
            throw new Exception (msj);
            
        }
        if(Direccion.trim().isEmpty() || Direccion == null){
            String msj="El campo Direccion no puede estar vacio";
            throw new Exception (msj);
            
        }
        if(Telefono.trim().isEmpty() || Telefono == null){
            String msj="El campo Telefono no puede estar vacio";
            throw new Exception (msj);
            
        }
        if(Relacion.trim().isEmpty() || Relacion == null){
            String msj="El campo Relacion no puede estar vacio";
            throw new Exception (msj);
            
        }
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
