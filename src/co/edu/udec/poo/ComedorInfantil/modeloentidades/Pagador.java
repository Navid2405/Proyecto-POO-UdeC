/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class Pagador {
    private String Dni;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String NumeroCuenta;
    private List<Pagador> Pagador;
    
    //METODOS
    public Pagador(String Dni, String Nombre, String Direccion, String Telefono, String NumeroCuenta){
        this.Direccion=Direccion;
        this.Nombre=Nombre;
        this.Dni=Dni;
        this.Telefono=Telefono;
        this.NumeroCuenta=NumeroCuenta;
        
        
    }
    
    public List<Pagador> Listar(){
        return Pagador;
    }
     public List<Pagador> CambioCuenta(Date FechaCambio){
        return Pagador;
    }
     
     //GETTERS
     
    public String getNombre(){
        return Nombre;
    }
    
    public String getTelefono(){
        return Telefono;
        
    }
    
    public String getDni(){
        return Dni;
    }
    
   
    public String getDireccion(){
        return Direccion;
    }
    public String getNumeroCuenta(){
        return NumeroCuenta;
    }
    
    
    public void setNumeroCuenta(String nuevo){
        this.NumeroCuenta=nuevo;
        
    }
    
    
}
