/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.List;

/**
 *
 * @author Navid Lobato
 */
public class BuscaNino {
    private String Dni;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Relacion;
    private List<Ninos> Busca;

    //METODOS
    public BuscaNino(String Dni,String Nombre,String Direccion,String Telefono,String Relacion){
        this.Direccion=Direccion;
        this.Dni=Dni;
        this.Nombre=Nombre;
        this.Relacion=Relacion;
        this.Telefono=Telefono;
    }
    public List<Ninos> Listar(Ninos Niños){
        
        return Busca;
    }
    public void Recogen(){
        
    }


    //GETTERS
    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getRelacion() {
        return Relacion;
    }

    public List<Ninos> getBusca() {
        return Busca;
    }
    
    //SETTERS
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    @Override
    public String toString() {
        return "Nombre:" + this.Nombre + " Dni" + this.Dni + " Telefono:" +this.Telefono + " Relacion:" + this.Relacion + "  Direccion:" +this.Direccion;
    }
 
}
