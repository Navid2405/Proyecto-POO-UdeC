/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modeloentidades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class AdminAlergias {
    
   
    public Map<Ninos, List<String>> BuscarNinosConAlergias(){
        
        
       Map<Ninos, List<String>> Alergias = new HashMap<>();
      return Alergias;
     }
     public void Mostrar(){
         System.out.println(BuscarNinosConAlergias());
        
    }
}
