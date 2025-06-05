/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Navid Lobato
 */
public class Ninos {

    
    private String Nombre;
    private String NumeroMatricula;
    private String Estado;
    private String Identificacion;
    private Date Nacimiento;
    private Date FechaIngreso;
    private Date FechaBaja;
    private List<String> Alergias;
    private List<Ninos> Retirados;
    private List <Ninos> Ninos;
    
    //METODOS
    public Ninos(String Nombre, String NumeroMatricula, Date Nacimiento, String Identificacion){
        this.Nombre=Nombre;
        this.NumeroMatricula=NumeroMatricula;
        this.Nacimiento=Nacimiento;
        this.Estado="Activo";
        this.FechaIngreso= new Date();
        this.Identificacion=Identificacion;
    }
    
    public void Agregar(Ninos Niño){
        Ninos.add(Niño);
    }
    
    public void Retirar(String NumeroMatricula)throws Exception{
       
        for(Ninos niño: Ninos){
            if(niño.getNumeroMatricula().equals(NumeroMatricula)){
                Date Fecha= new Date();
                Ninos.remove(niño);
                System.out.println("El niño: " + niño + "fue eliminado con exito en la fecha:" + Fecha);
                Retirados.add(niño);
                break;
                
            }else{
                throw new Exception("El Niño con este numero de matricula no se encuentra en el sistema.");
                
            }
            
            
        }
        
    }
    public void RegistroAlergias(String NumeroMatricula) throws Exception{
        
        Scanner sc= new Scanner(System.in);
         for(Ninos niño: Ninos){
            if(niño.getNumeroMatricula().equals(NumeroMatricula)){
                System.out.println("Digite las alegias que presenta el niño");
                String alergias= sc.nextLine();
                ArrayList<String> Alergias= new ArrayList<String>();
                Alergias.add(alergias);
                
                niño.setAlergias(Alergias);
                System.out.println("Alergias agregadas con exito");
                break;
                
                
                
            }else{
                throw new Exception("El Niño con este numero de matricula no se encuentra en el sistema.");
                
            }
            
            
         }
         sc.close();
        
        
    }
    public void ConsultarBajas(String NumMatricula)throws Exception {

        for(Ninos niño: Retirados){
            if(niño.getNumeroMatricula().equals(NumMatricula)){
                System.out.println(niño );
                
            }else{
                throw new Exception("El niño no se encuentra en la lista de bajas");
            }
        }
    }
    
    
        
    
    
    //GETTERS
     public String getNombre() {
        return Nombre;
    }

    public String getNumeroMatricula() {
        return NumeroMatricula;
    }

    public String getEstado() {
        return Estado;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public Date getFechaBaja() {
        return FechaBaja;
    }

    public List<String> getAlergias() {
        return Alergias;
    }

    public List<Ninos> getNinos() {
        return Ninos;
    }
    
    public String getIdentificacion(){
        return Identificacion;
    }
    
    //SETTERS
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
     public void setAlergias(List<String> Alergias) {
        this.Alergias = Alergias;
    }
     
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
        
    }
     
     
    @Override
    public String toString(){
        return "NOMBRE:" + this.Nombre + " MATRICULA:" + this.NumeroMatricula + " NACIMIENTO:" + this.Nacimiento + " ESTADO:" + this.Estado  +" ALERGIAS:" + this.Alergias; 
    }
    
}
