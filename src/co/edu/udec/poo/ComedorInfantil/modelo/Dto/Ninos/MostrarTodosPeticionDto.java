/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class MostrarTodosPeticionDto {
    
    private final String nombre;
    private final String identificacion;
    private final String matricula;
    private final String estado;
    private final String fechaIngreso;
    private final String fechaBaja;
    private final String nacimiento ;

    public MostrarTodosPeticionDto(String nombre, String identificacion, String matricula, String estado, String fechaIngreso, String fechaBaja, String nacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.matricula = matricula;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
        this.nacimiento = nacimiento;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public String getNacimiento() {
        return nacimiento;
    }
    
    
    
    
    
    
}
