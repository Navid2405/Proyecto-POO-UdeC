/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Navid Lobato
 */
public class ConexionBd {
    private static EntityManagerFactory conexion;
    
    public static EntityManagerFactory conectar(){
        if(conexion == null){
            conexion= Persistence.createEntityManagerFactory("ComedorInfantil_22_ConfiguracionBD");
        }
        
        return conexion;
    }


    public static void desconectar(){
        if(conexion != null && conexion.isOpen()){
            conexion.close();
            
        }
        
        conexion = null;
    }



}

