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
public class Pagos {
    
    private String Id;
    private Date Fecha;
    private double CostoTotal;
    private double CostoFijo;
    private double CostoComida;
    private String identificacion;
    private String DniPagador;
    private List<Pagos> ListaPagos;

    //METODOS
    public Pagos(String Id, Date Fecha,double CostoComida, String identificacion, String DniPagador) {
        this.Id = Id;
        this.Fecha = Fecha;
        this.identificacion = identificacion;
        this.DniPagador = DniPagador;
        this.CostoComida=CostoComida;
        this.CostoFijo=5000;
        this.CostoTotal=CostoTotal + this.CostoFijo;
    }

    public void RegistrarPago(Pagos pago) {
        ListaPagos.add(pago);
    }
    
//GETTERS
    public List<Pagos> getObtenerPagos() {
        return ListaPagos;
    }
    
    public  String getIdentificacion(){
        return identificacion;
    }
    
    
     public String getId() {
        return Id;
    }

    public Date getFecha() {
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

    public List<Pagos> getListaPagos() {
        return ListaPagos;
    }

    //SETTERS
    
    public void setListaPagos(List<Pagos> listaPagos) {
        this.ListaPagos = listaPagos;
    }
    
    public void setCostoComida(double CostoComida) {
        this.CostoComida = CostoComida;
    }
       public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
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
