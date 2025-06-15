/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Navid Lobato
 */
public class PagosCrud {
    
    private EntityManagerFactory conexion;
    
    
    
    public PagosCrud(){
        this.conexion= ConexionBd.conectar();
              
        
    }
     public void registrarPago(Pagos pago) throws Exception{
     
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            
            entityManager.persist(pago);
            
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al guardar el pago : " + pago.getId();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
     }
     
     public void generarPago(String idPago) throws Exception{
         EntityTransaction transaction = null;
         EntityManager entityManager = null;
         
         try{
             entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            
         Pagos pago = entityManager.find(Pagos.class, idPago);
         
         if(pago == null){
             throw new Exception("El pago con id:" + pago.getId() + " no existe.");
         }
         
         Ninos nino= entityManager.find(Ninos.class, pago.getIdentificacion());
         if(nino == null){
             throw new Exception("El nino con identificacion:" + nino.getIdentificacion() + " no existe.");
         }
         
          ComerCrud cCrud = new ComerCrud();
          double totalComida= cCrud.contarComidas(nino.getIdentificacion());
          double costoComida= (totalComida*pago.getCostoComida()) + pago.getCostoFijo();
          pago.setCostoTotal(costoComida);
           
         PagadorCrud pCrud = new PagadorCrud();
         Pagador pagador= pCrud.buscarPorDni(pago.getDniPagador());
         
         if(pagador.getNino_pagadores() == null ||
                 !pagador.getNino_pagadores().getIdentificacion().equals(nino.getIdentificacion())){
               throw new Exception("Este pagador no le corresponde a este niño.");
         }
         
         
         
         pago.setNino_pago(nino);
         pago.setPagador(pagador);
         
         entityManager.merge(pago);
         transaction.commit();
         
       
         }catch(Exception e){
              if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al generar el pago: " + e.getMessage();
            throw new Exception(msj);
         }finally{
             if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
         }
     }
    
     

     public List<Pagos> Listar()throws Exception{
         
         EntityManager entityManager = null;
         
         try {
             entityManager = conexion.createEntityManager();
             String consulta= "SELECT p FROM Pagos p";
             List<Pagos> lista = entityManager.createQuery(consulta, Pagos.class).getResultList();
             return lista;
         } catch (Exception e) {
             throw new Exception ("Error al listar los pagos");
         } finally {
             if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
         }
          
         
     }
}
