/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.entidades;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class Asesoria {

    private String Id;
    private String CodigoAsesor;
    private String NombreEmpresa;
    private String Area;
    private Date FechaInicio;

    //METODOS
    public void ConsultarAseoresEmpresa(String NombreEmpresa){
    }
    
    public void TiempoTrabajado( String Area){
        
    }
    
    //GETTERS
    public String getId() {
        return Id;
    }

    public String getCodigoAsesor() {
        return CodigoAsesor;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public String getArea() {
        return Area;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }
    
    //SETTERS
    public void setArea(String Area) {
        this.Area = Area;
    }
   
    
}
