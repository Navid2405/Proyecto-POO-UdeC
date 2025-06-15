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
import javax.persistence.Table;

/**
 *
 * @author Navid Lobato
 */
@Entity(name="Pagos")
public class Pagos implements Serializable {
    @Id
    private String Id;
    private String Fecha;
    private double CostoTotal;
    private double CostoFijo;
    private double CostoComida;
    private String identificacion;
    private String DniPagador;
    
    
    //relaciones
    @ManyToOne
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion")
    private Ninos nino_pago;
    @ManyToOne
    @JoinColumn (name= "Identificacion_pagador")
    private Pagador pagador;

    //METODOS

    public Pagos() {
    }
    
    
    
    
    public Pagos( String id, String Fecha,double CostoComida, String identificacion, String DniPagador) {
        this.Fecha = Fecha;
        this.identificacion = identificacion;
        this.DniPagador = DniPagador;
        this.CostoComida=CostoComida;
        this.CostoFijo=5000;
        this.CostoTotal=CostoTotal + this.CostoFijo;
        this.Id=id;
    }
    
//GETTERS
    
    
    public  String getIdentificacion(){
        return identificacion;
    }
    
    
     public String getId() {
        return Id;
    }

    public String getFecha() {
        return Fecha;
    }

    public double getCostoTotal() {
        return CostoTotal;
    }

    public double getCostoFijo() {
        return CostoFijo;
    }

    public double getCostoComida() {
        return CostoComida;
    }



    public String getDniPagador() {
        return DniPagador;
    }

    public Ninos getNino_pago() {
        return nino_pago;
    }

    public Pagador getPagador() {
        return pagador;
    }
    
    

   

    //SETTERS
    
   
    
    public void setCostoComida(double CostoComida) {
        this.CostoComida = CostoComida;
    }
       public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }

    public void setNino_pago(Ninos nino_pago) {
        this.nino_pago = nino_pago;
    }

    public void setPagador(Pagador pagador) {
        this.pagador = pagador;
    }
    
    
    
@Override
public String toString() {
    return "Pago ID: " + this.Id +
           ", Niño ID: "+ this.identificacion+
           ", Pagador DNI: " + this.DniPagador+
           ", Costo comida: " + this.CostoComida +
           ", Costo fijo: " + this.CostoFijo+
           ", Total: " + this.CostoTotal;
}

}
