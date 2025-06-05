/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;

import co.edu.udec.poo.ComedorInfantil.modeloentidades.Menu;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Platos;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class MenuCrud {
     Map<String, Menu> menus;
     
     public MenuCrud(){
         menus= new HashMap<>();
     }
    
  
     public void aggMenu(Menu menu){
         menus.put(menu.getNombre(), menu);
         
     }
     
     
    public void AggPlato(Platos plato,String nombreMenu)throws Exception{
        if(menus.containsKey(nombreMenu)){
            menus.get(nombreMenu).agregarPlato(plato);
            
        }else{
            throw new Exception ("No se encontro este emnu para agregar plato");
        }
        
        
    }
    
    public void Listar(){
       for(Menu menu: menus.values()){
          System.out.println("#" + menu.getNumMenu() + " " + menu.getNombre());
          System.out.println("Contiene:");
          for(Platos platos : menu.getPlatos()){
              System.out.println("* "  + platos.getNombre() );
              
          }
           
       }
    }
}
