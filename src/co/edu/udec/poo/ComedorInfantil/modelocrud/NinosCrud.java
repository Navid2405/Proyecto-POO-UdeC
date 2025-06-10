/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagador;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagos;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.BuscaNino;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Navid Lobato
 */
public class NinosCrud{
    
    public static HashMap<String, Ninos> ninos;
    HashMap<String, List<Pagador>> pagadoresAutorizados;
    HashMap<String, List<Pagos>> registroPagos;
    HashMap<String, List<BuscaNino>> buscaNino;
    List<String> Alergias;
    public static List<Ninos> Retirados; 
    private EntityManagerFactory conexion;
    
    
    public NinosCrud(){
        ninos= new HashMap<>();
        pagadoresAutorizados = new HashMap<>();
        registroPagos = new HashMap<>();
        buscaNino = new HashMap<>();
        Alergias = new ArrayList<>();
        Retirados = new ArrayList<>();
        conexion= ConexionBd.conectar();
    }
    
    
    
    public  void Agregar(Ninos nino)throws Exception{
        
        EntityTransaction transaction= null;
        EntityManager entityManager= null;
      try{
           entityManager  = conexion.createEntityManager();
           transaction = entityManager.getTransaction();
           transaction.begin();
           entityManager.persist(nino);
           transaction.commit();
      }catch(Exception err){
          if(transaction != null){
              transaction.rollback();
          }
          String msj= "Error al guardar al niño con identificacion:" + nino.getIdentificacion() ;
          throw new Exception(msj); 
      }finally{
          if(entityManager != null && entityManager.isOpen()){
              entityManager.close();
              
          }
      }
    }
    
    
    public Ninos Buscar (String Identificacion)throws Exception{
        EntityManager entityManager= null;
        try {
              entityManager  = conexion.createEntityManager();
              Ninos nino= entityManager.find(Ninos.class, Identificacion);
              if(nino == null){
                String msj= "Error Nino:" +Identificacion + "no existe.";
                throw new Exception(msj);
              }
              return nino; 
        } catch (Exception e) {
            throw e;
            
        } finally {
              if(entityManager != null && entityManager.isOpen()){
              entityManager.close();
        }
    }
    }
        
    
    
    
    public void editar(String Identificacion, String nombre)throws Exception{
        if(ninos.containsKey(Identificacion)){
            Ninos niño= ninos.get(Identificacion);
            niño.setNombre(nombre);
            ninos.put(Identificacion, niño);
            
        }else{
            throw new Exception ("El niño con identificacion:" + Identificacion + "no se encuentra.");
        }
       
        
    }
    public void eliminar(String Identificacion)throws Exception{
        if(ninos.containsKey(Identificacion)){
            ninos.remove(Identificacion);
        }else{
            throw new Exception ("El niño no se encontro, vuelva a intentarlo");
        }
    }
    
    public void Retirar(String Identificacion)throws Exception{
            if(ninos.containsKey(Identificacion)){
                Ninos niño= ninos.get(Identificacion);
                Date Fecha= new Date();
                ninos.remove(Identificacion);
                System.out.println("El niño: " + niño.toString() + "fue eliminado con exito en la fecha:" + Fecha);
                Retirados.add(niño);
                
            }else{
                throw new Exception("El Niño con este numero de identificacion no se encuentra en el sistema.");
                
            }
            
            
        }
        
    


    public void ConsultarBajas(String Identificacion)throws Exception {
        boolean encontrar= false;
        for(Ninos niño:Retirados){
            if(niño.getIdentificacion().equals(Identificacion)){
                System.out.println(niño );
                encontrar=true;
                break;
            }else{
                throw new Exception("El niño no se encuentra en la lista de bajas");
            }
        }
    }
    

    
    public Collection<Ninos> Listar(){
        
      return ninos.values();
    }
    
    public int Contar(){     
        return ninos.size();
        
    }
    
    
    public void registrar(Ninos nino) throws Exception{
        
         if(!ninos.containsKey(nino.getIdentificacion())){
             ninos.put(nino.getIdentificacion(), nino);
            
        } else {
           throw new Exception ("El niño con la identificacion:" + nino.getIdentificacion()+ "ya se encuentra registrado");
        }
          
       
    }
    


    public void RegistroAlergias(String identificacion) throws Exception{
        
        Scanner sc= new Scanner(System.in);
         for(Ninos niño: ninos.values()){
            if(niño.getIdentificacion().equals(identificacion)){
                System.out.println("Digite las alegias que presenta el niño");
                String alergias= sc.nextLine();
                ArrayList<String> Alergias= new ArrayList<String>();
                Alergias.add(alergias);
                
                System.out.println("Alergias agregadas con exito");
                break;                
            }else{
                throw new Exception("El Niño con este numero de matricula no se encuentra en el sistema.");   
            }   
         }   
    }
    
    
    
     public void registrarPago (Pagos pago, String Identificacion)throws Exception{
        if(ninos.containsKey(Identificacion)){
            registroPagos.putIfAbsent(Identificacion, new ArrayList<>());
            registroPagos.get(Identificacion).add(pago);
            
        }else{
            throw new Exception ("No se encontro el niño identificado con: "+ Identificacion +"para registrar el pago");
        }       
    }    
}
    
    

