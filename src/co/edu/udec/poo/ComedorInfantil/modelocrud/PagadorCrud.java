/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;


import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class PagadorCrud {
    
    
    private Map<Pagador, List<Ninos>> responsablePagar;
    private Map<String, Pagador> pagadores;
    private NinosCrud ninosCrud;
    
    
    public PagadorCrud( NinosCrud ninosCrud){
        responsablePagar= new HashMap<>();
        pagadores= new HashMap<>();
        this.ninosCrud=ninosCrud;
        
    }
    
    
    public void registrar (Pagador pagador)throws Exception{
        if(!pagadores.containsKey(pagador.getDni())){
            pagadores.put(pagador.getDni(), pagador);
        }else {
            throw new Exception ("El pagador con cc: " +  pagador.getDni() + " ya se encuentra registrado");
        }
        
    }
    
    public void asignarPagador(String Dni, String Identificacion)throws Exception {
         Pagador pagador= pagadores.get(Dni);
        if(pagador==null){
            throw new Exception ("No se encuentra registrado en el sistema");
            
        }
        
        Ninos nino= ninosCrud.Buscar(Identificacion);
        if(nino != null){
        responsablePagar.putIfAbsent(pagador, new ArrayList<>());
        responsablePagar.get(pagador).add(nino);
        }
    }
    
    public void cambiarNumCuenta(String nuevoNumCuenta, String Dni)throws Exception{
        if(pagadores.containsKey(Dni)){
            Pagador pagador= pagadores.get(Dni);
            pagador.setNumeroCuenta(nuevoNumCuenta);
            
        }else{
            throw new Exception ("No se encontro al usuario con identificacion: " + Dni);
        }
        
        
    }
    public Pagador buscarPorDni(String Dni) throws Exception{
        if(!pagadores.containsKey(Dni)){
            throw new Exception ("El pagador no se encuentra en el sistema");
        }
        Pagador pagador= pagadores.get(Dni);
        return pagador;
        
    }
    
    public Map<Pagador, List<Ninos>> buscar(Pagador pagador) throws Exception{
        if(!responsablePagar.containsKey(pagador)){
            throw new Exception ("El pagador no tiene niños asignados");
            
        }
        
        return responsablePagar;
    }
    
    
    
    public void listar(){
        for(Pagador pagador: responsablePagar.keySet()){
            System.out.println(pagador.getNombre());
            List<Ninos> ninos = responsablePagar.get(pagador);
            System.out.println("Responsable de: ");
            for(Ninos nino :ninos ){
                System.out.println("* " + nino.getNombre());
            }
        }
    }
}
