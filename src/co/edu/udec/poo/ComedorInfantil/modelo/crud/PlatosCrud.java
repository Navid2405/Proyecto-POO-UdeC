/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Platos;
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
public class PlatosCrud {

    private EntityManagerFactory conexion;
    private Map<String, Platos> platos;

    public PlatosCrud() {
        platos = new HashMap<>();
        conexion = ConexionBd.conectar();
    }

    public void agregarPlato(Platos plato) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(plato);
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al guardar el plato: " + plato.getNombre();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public void aggIngrediente(String nombre, String ingrediente) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;

        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            Platos p = entityManager.find(Platos.class, nombre);

            if (p == null) {
                String msj = "El plato: " + nombre + "no esta registrado en el sistema";
                throw new Exception(msj);

            }

            p.aggIngrediente(ingrediente);
            entityManager.merge(p);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al registrar ingrediente.";
            throw new Exception(msj);

        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }

        }

    }

    public Platos buscarPlatoPorNombre(String nombre) {
        EntityManager entityManager = conexion.createEntityManager();
        try {
            return entityManager.find(Platos.class, nombre);
        } finally {
            entityManager.close();
        }
    }

    public List<Platos> mostrarPlatos() throws Exception {
        EntityManager entityManager = null;

        try {
            entityManager = conexion.createEntityManager();
            var consulta = "SELECT p FROM Platos p";
            var listaPlatos = entityManager.createQuery(consulta, Platos.class).getResultList();
            return listaPlatos;

        } catch (Exception e) {
            String msj = "No hay platos registrados en el sistema";
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

}
