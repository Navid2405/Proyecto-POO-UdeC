/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Navid Lobato
 */

@Entity (name= "NinosT")
public class Ninos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="matricula", length=50)
    private int NumeroMatricula;
    @Id
    @Column(length=20, nullable=false)
    private String Identificacion;
    @Column(length=50, nullable=false)
    private String Nombre;
    @Column(length=50, nullable=false)
    private String Estado;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Nacimiento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date FechaIngreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date FechaBaja;
    
    // relaciones 
    @OneToMany(mappedBy="nino_alergias")
    private List<AdminAlergias> Alergias;
    @OneToMany(mappedBy="nino_pagadores")
    private List<Pagador> pagadores;
    @OneToMany(mappedBy="nino_pago")
    private List<Pagos> pago;
    @OneToMany(mappedBy="nino_buscadores")
    private List<BuscaNino> buscador;
    @OneToMany(mappedBy="nino_comer")
    private List<Comer> comer;
   

    public Ninos() {
        
    }
    
    //METODOS
    public Ninos(String Nombre, Date Nacimiento, String Identificacion){
        this.Nombre=Nombre;
        this.NumeroMatricula=2;
        this.Nacimiento=Nacimiento;
        this.Estado="Activo";
        this.FechaIngreso= new Date();
        this.Identificacion=Identificacion;
    }
    //GETTERS
     public String getNombre() {
        return Nombre;
    }

    public int getNumeroMatricula() {
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

    public List<AdminAlergias> getAlergias() {
        return Alergias;
    }

   
    
    public String getIdentificacion(){
        return Identificacion;
    }
    
    //SETTERS
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
     public void setAlergias(List<AdminAlergias> Alergias) {
        this.Alergias = Alergias;
    }
     
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
        
    }

    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public List<Pagador> getPagadores() {
        return pagadores;
    }

    public void setPagadores(List<Pagador> pagadores) {
        this.pagadores = pagadores;
    }

    public List<Pagos> getPago() {
        return pago;
    }

    public void setPago(List<Pagos> pago) {
        this.pago = pago;
    }

    public List<BuscaNino> getBuscador() {
        return buscador;
    }

    public void setBuscador(List<BuscaNino> buscador) {
        this.buscador = buscador;
    }

    public List<Comer> getComer() {
        return comer;
    }

    public void setComer(List<Comer> comer) {
        this.comer = comer;
    }
     
    
    
     
    @Override
    public String toString(){
        return "NOMBRE:" + this.Nombre + " MATRICULA:" + this.NumeroMatricula + " NACIMIENTO:" + this.Nacimiento + " ESTADO:" + this.Estado  +" ALERGIAS:" + this.Alergias; 
    }
    
}
