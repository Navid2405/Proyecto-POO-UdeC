/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author Navid Lobato
 */
@Entity(name="Pagadores")

public class Pagador implements Serializable {
    @Id
    private String Dni;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String NumeroCuenta;
    
    
    @ManyToOne
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion")
    private Ninos nino_pagadores;
   
    
    //METODOS

    public Pagador() {
    }
    
    
    
    public Pagador(String Dni, String Nombre, String Direccion, String Telefono, String NumeroCuenta){
        this.Direccion=Direccion;
        this.Nombre=Nombre;
        this.Dni=Dni;
        this.Telefono=Telefono;
        this.NumeroCuenta=NumeroCuenta;
        
        
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

    
    public Ninos getNino_pagadores() {
        return nino_pagadores;
    }

    public void setNino_pagadores(Ninos nino_pagadores) {
        this.nino_pagadores = nino_pagadores;
    }
    
    
}
