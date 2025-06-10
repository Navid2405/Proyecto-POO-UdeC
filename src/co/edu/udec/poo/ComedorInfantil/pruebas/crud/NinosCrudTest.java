/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.pruebas.crud;

import co.edu.udec.poo.ComedorInfantil.modelocrud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import java.util.Date;

/**
 *
 * @author Navid Lobato
 */
public class NinosCrudTest {
     public void Crear_y_GuardarNinoSinError(){
        Ninos nino= new Ninos("Navid jose", new Date(), "1121532246");
        
        
        try{
            NinosCrud ninocrud= new NinosCrud();
            ninocrud.Agregar(nino);
            System.out.println("Agregado con exito");
                 
        }catch(Exception err){
            System.out.println(err.getMessage());
        
        }
        
    }
}
