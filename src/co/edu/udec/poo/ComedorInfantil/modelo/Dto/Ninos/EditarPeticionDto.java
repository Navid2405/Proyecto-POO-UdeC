/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Ninos;

/**
 *
 * @author Navid Lobato
 */
public class EditarPeticionDto {
    
    private final String nombre;
    private final String identificacion;
    private final String matricula;
    private final String nacimiento;

    public EditarPeticionDto(String nombre, String identificacion, String matricula, String nacimiento) throws Exception {
        
        if(nombre == null || nombre.isEmpty()){
            throw new Exception("El campo nombre esta vacio");
        }
        if(identificacion == null || identificacion.isEmpty()){
            throw new Exception("El campo identificacion esta vacio");
            
        }
        if(matricula == null || matricula.isEmpty()){
            throw new Exception("El campo matricula esta vacio");
            
        }
        if(nacimiento == null || nacimiento.isEmpty()){
            throw new Exception("El campo nacimiento esta vacio");
            
        }
        
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.matricula = matricula;
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

    public String getNacimiento() {
        return nacimiento;
    }
    
    
    
}
