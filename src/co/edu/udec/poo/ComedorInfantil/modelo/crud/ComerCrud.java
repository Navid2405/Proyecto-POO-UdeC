/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Comer;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
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
public class ComerCrud {

    private EntityManagerFactory conexion = null;

    public ComerCrud() {
        this.conexion = ConexionBd.conectar();
    }

    public void registrarComida(Comer comida) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            
            
            Ninos nino = entityManager.find(Ninos.class, comida.getIdentificacionNino());
            
            comida.setNino_comer(nino);
            entityManager.persist(comida);
            
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null)transaction.rollback();
            String msj = "Error al guardar al niño con identificacion:" + comida.getId();
            throw new Exception(msj + ". " + err.getMessage());
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public List<Comer> listarComidas() throws Exception {
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            var consulta = "SELECT co FROM Comedor co ";
            var listaComer = entityManager.createQuery(consulta, Comer.class).getResultList();
            return listaComer = entityManager.createQuery(consulta, Comer.class).getResultList();

        } catch (Exception e) {
            String msj = "No hay comedores registrados en el sistema";
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }

        }

    }

    public int contarComidas(String identificacion) throws Exception {
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            
              String consulta = "SELECT SUM(co.CantComidas) FROM Comedor co WHERE co.IdentificacionNino = :identificacion";
            Long cantidad = entityManager.createQuery(consulta, Long.class)
                    .setParameter("identificacion", identificacion)
                    .getSingleResult();
            return cantidad.intValue();
        } catch (Exception e) {
            throw new Exception ("No se pudo contar las comidas del nino" + e.getMessage());
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }

    }
}
