/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Menu;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Platos;
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
public class MenuCrud {
     
     private EntityManagerFactory conexion;
     public MenuCrud(){
         this.conexion=ConexionBd.conectar();
     }
    
  
     public void aggMenu(Menu menu) throws Exception{
           EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(menu);
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al guardar el plato: " + menu.getNombre();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
         
     }
     
     
    public void AggPlato(String nombrePlato,String nombreMenu)throws Exception{
      EntityTransaction transaction = null;
        EntityManager entityManager = null;

        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            System.out.println("Buscando plato con nombre: '" + nombrePlato + "'");


            Platos p = entityManager.find(Platos.class, nombrePlato);
            Menu m = entityManager.find(Menu.class, nombreMenu);

            if (p == null) {
                String msj = "El plato: " + nombrePlato + "no esta registrado en el sistema";
                throw new Exception(msj);

            }
             if (m == null) {
                String msj = "El Menu: " + nombreMenu + "no esta registrado en el sistema";
                throw new Exception(msj);

            }
             
             
             System.out.println("Plato: " + p.getNombre() + ", Menu: " + m.getNombre());

            p.setMenu(m);
            
            if(m.getPlatos()== null){
                m.setPlatos(new ArrayList<>()); 
            }
            m.getPlatos().add(p);
            
            entityManager.merge(p);
            entityManager.merge(m);
            transaction.commit();

        } catch (Exception e) {
             if (transaction != null && transaction.isActive()) transaction.rollback();
            throw new Exception("Error al integrar plato a menu: " + e.getMessage(), e);

        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }

        }
        
        
    }
    
    public List<Menu> Listar() throws Exception{
        EntityManager entityManager = null;

        try {
            entityManager = conexion.createEntityManager();
            var consulta = "SELECT m FROM Menus m";
            var listaMenu = entityManager.createQuery(consulta, Menu.class).getResultList();
            return listaMenu;

        } catch (Exception e) {
            String msj = "No hay menus registrados en el sistema";
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }
}
