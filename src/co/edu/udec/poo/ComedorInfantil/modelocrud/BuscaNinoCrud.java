/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;

import co.edu.udec.poo.ComedorInfantil.modeloentidades.BuscaNino;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class BuscaNinoCrud {
    
    private Map<BuscaNino, List<Ninos>> autorizados;
    private Map<String, BuscaNino> buscadores;
    private NinosCrud ninosCrud;

    public BuscaNinoCrud() {
    }
    
    
    
    public BuscaNinoCrud(NinosCrud ninosCrud){
        this.ninosCrud= ninosCrud;
        autorizados= new HashMap<>();
        buscadores= new HashMap<>();
    }
    
    
    public void registrarse(BuscaNino busca){
        buscadores.put(busca.getDni(), busca);
        
    }
    
    
    public void asignarBuscador(String Dni, String identificacionNino) throws Exception{
        BuscaNino busca= buscadores.get(Dni);
        if(busca==null){
            throw new Exception ("No se encuentra registrado en el sistema");
            
        }
        Ninos nino= ninosCrud.Buscar(identificacionNino);
        
        if(nino != null){
        autorizados.putIfAbsent(busca, new ArrayList<>());
        autorizados.get(busca).add(nino);
        }
        
        
    }
    
    
    public void listar(){
       for (BuscaNino busca: autorizados.keySet()){
            System.out.println(busca.getNombre());
            List<Ninos> ninos= autorizados.get(busca);
            for (Ninos nino: ninos){
                System.out.println("Busca a:" + nino.getNombre());
                
            }
           
           
           
       } 
    }
    
    
}
