/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;

import co.edu.udec.poo.ComedorInfantil.modeloentidades.Comer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class ComerCrud {
    private Map<String, List<Comer>> registroComidasNinos;
    
    
    
    public ComerCrud(){
        registroComidasNinos= new HashMap<>();
    }
    
    public void registrarComida(Comer comida){
        String identificacion= comida.getIdentificacionNino();
        registroComidasNinos.putIfAbsent(identificacion, new ArrayList<>());
        registroComidasNinos.get(identificacion).add(comida);
    }
    
    
    public void listarComidas(String identificacion)throws Exception{
        List<Comer> Comidas= registroComidasNinos.get(identificacion);
        if(Comidas.isEmpty()){
            throw new Exception ("El niño no tiene comidas registradas aun ");             
        }
        
        System.out.println("Comidas del niño identificado con :" + identificacion + ":" );
        for(Comer comida: Comidas){
            System.out.println(" * " + comida);
        }
    }
    
    
    public int contarComidas(String identificacion){
        List <Comer> Comidas = registroComidasNinos.get(identificacion);
        if(Comidas.isEmpty()) return 0;
        
        int contarComidas=0;
        for(Comer comidas: Comidas){
            contarComidas += comidas.getCantCOmidas();
                  
        }
        return contarComidas;
        
    }
}
