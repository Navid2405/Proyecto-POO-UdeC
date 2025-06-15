/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class ConsultarBajasPeticionDto {
    
     private final String nombre;
    private final String identificacion;
    private final String matricula;
    private final String estado;
    private final String nacimiento;
    private final String fechaIngreso;
    private final String fechaBajas;

    public ConsultarBajasPeticionDto(String nombre, String identificacion, String matricula, String estado, String nacimiento, String fechaIngreso, String fechaBajas) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.matricula = matricula;
        this.estado = estado;
        this.nacimiento = nacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaBajas = fechaBajas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEstado() {
        return estado;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaBajas() {
        return fechaBajas;
    }
    
    

 
    
    
}
