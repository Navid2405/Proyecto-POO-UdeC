/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String Dni;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Relacion;
    
    //relaciones
    @ManyToOne
     @JoinColumns({
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion"),
    @JoinColumn(name = "nino_matricula", referencedColumnName = "matricula")
})
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
}
