/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class BuscarRespuestaDto {
    
    private final String nombre;
    private final String identificacion;
    private final String nacimiento;
    private final String numMatricula;

    public BuscarRespuestaDto(String nombre, String identificacion, String nacimiento, String numMatricula) throws Exception {
            if(nombre == null || nombre.isEmpty()){
            throw new Exception("El campo nombre esta vacio");
        }
        if(identificacion == null || identificacion.isEmpty()){
            throw new Exception("El campo identificacion esta vacio");
            
        }
        if(numMatricula == null || numMatricula.isEmpty()){
            throw new Exception("El campo matricula esta vacio");
            
        }
        if(nacimiento == null || nacimiento.isEmpty()){
            throw new Exception("El campo nacimiento esta vacio");
            
        }
        
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nacimiento = nacimiento;
        this.numMatricula = numMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getNumMatricula() {
        return numMatricula;
    }
    
    
    
}
