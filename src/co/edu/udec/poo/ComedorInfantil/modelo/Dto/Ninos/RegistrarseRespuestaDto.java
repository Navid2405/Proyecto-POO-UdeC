/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

import java.util.Date;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarseRespuestaDto {
     private final String Nombre;
    private final String Identificacion;
    private final String NumeroMatricula;
    private final String Nacimiento;

    public RegistrarseRespuestaDto(String Nombre, String Identificacion, String NumeroMatricula, String Nacimiento) throws Exception {
       
       
        if(Nombre == null ||   Nombre.trim().isEmpty()){
            throw new Exception("El campo  nombre esta vacio");
            
        }
        if(Identificacion == null ||   Identificacion.trim().isEmpty()){
            throw new Exception("El campo identificacion esta vacio");
            
        }
        if(NumeroMatricula == null || NumeroMatricula.trim().isEmpty()){
            throw new Exception("El campo Matricula esta vacio");
            
        }
        if(Nacimiento == null ||   Nacimiento.trim().isEmpty()){
            throw new Exception("El campo nacimiento esta vacio");
        }
        
        
        
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.NumeroMatricula = NumeroMatricula;
        this.Nacimiento = Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getNumeroMatricula() {
        return NumeroMatricula;
    }

    public String getNacimiento() {
        return Nacimiento;
    }
    
}
