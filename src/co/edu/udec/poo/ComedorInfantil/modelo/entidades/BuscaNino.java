/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Navid Lobato
 */
@Entity(name="Buscadores")
public class BuscaNino implements Serializable {
    @Id
    private String Dni;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Relacion;
    
    //relaciones
    @ManyToOne
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion")
    private Ninos nino_buscadores;
   

    //METODOS
    
    
    public BuscaNino(){
    }

    public BuscaNino(String Dni, String Nombre, String Direccion, String Telefono, String Relacion) {
        this.Direccion=Direccion;
        this.Dni=Dni;
        this.Nombre=Nombre;
        this.Relacion=Relacion;
        this.Telefono=Telefono;
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

    public Ninos getNino_buscadores() {
        return nino_buscadores;
    }
    

    
    
    //SETTERS
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setNino_buscadores(Ninos nino_buscadores) {
        this.nino_buscadores = nino_buscadores;
    }
    
    
    
    @Override
    public String toString() {
        return "Nombre:" + this.Nombre + " Dni" + this.Dni + " Telefono:" +this.Telefono + " Relacion:" + this.Relacion + "  Direccion:" +this.Direccion;
    }

}
