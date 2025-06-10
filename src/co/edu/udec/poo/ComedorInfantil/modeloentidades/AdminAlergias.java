/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Navid Lobato
 */
@Entity
@Table(name = "Alergias")
public class AdminAlergias implements Serializable {

    

    @Id
    private Long id;

    @ManyToOne
     @JoinColumns({
    @JoinColumn(name = "nino_identificacion", referencedColumnName = "Identificacion"),
    @JoinColumn(name = "nino_matricula", referencedColumnName = "matricula")
})
    private Ninos nino_alergias;

    
    
    public AdminAlergias() {
    }
    
    public Map<Ninos, List<String>> BuscarNinosConAlergias() {

        Map<Ninos, List<String>> Alergias = new HashMap<>();
        return Alergias;
    }

    public void Mostrar() {
        System.out.println(BuscarNinosConAlergias());

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ninos getNinos_alergias() {
        return nino_alergias;
    }

    public void setNinos_alergias(Ninos ninos_alergias) {
        this.nino_alergias = ninos_alergias;
    }

    
}
