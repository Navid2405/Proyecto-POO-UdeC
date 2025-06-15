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
public class Asesores {
    private String Codigo;
    private String Nombre;
    private String Direccion;
    private String TitualcionProfessional;
    private List<String> AreadeAsesoria;
    private Date FechaInicio;
    private List<Asesores> Asesores;

    //Metodos
    public Asesores(String Codigo ,String Nombre,String Direccion,String TitualcionProfessional, List<String> AreadeAsesoria, Date FechaInicio){
       this.Nombre=Nombre;
       this.Codigo=Codigo;
       this.Direccion=Direccion;
       this.TitualcionProfessional=TitualcionProfessional;
       this.AreadeAsesoria=AreadeAsesoria;
       this.FechaInicio=FechaInicio;
       
    }
    public List<Asesores> Listar(){
        return Asesores ;
    }
    
    public List<Asesores> MasTiempo(){
        return Asesores;
    }

    //GaETTERS
      public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTitulacionProfesional() {
        return TitualcionProfessional;
    }

    public List<String> getAreaDeAsesoria() {
        return AreadeAsesoria;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public List<Asesores> getAsesores() {
        return Asesores;
    }
    
    //SETTERS
     public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTitulacionProfesional(String TitulacionProfessional) {
        this.TitualcionProfessional = TitualcionProfessional;
    }

    public void setAreaDeAsesoria(List<String> AreadeAsesoria) {
        this.AreadeAsesoria = AreadeAsesoria;
    }
      public void setAsesores(List<Asesores> Asesores) {
        this.Asesores = Asesores;
    }
    
}
