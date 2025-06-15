/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.BuscaNino;
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
public class BuscaNinoCrud {

    private EntityManagerFactory conexion;
    private NinosCrud ninosCrud = new NinosCrud();

    public BuscaNinoCrud() {
        conexion = ConexionBd.conectar();
    }

    

    public void registrarse(BuscaNino busca) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(busca);
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al guardar al buscador con identificacion:" + busca.getDni();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }

    }

    public void asignarBuscador(String Dni, String identificacionNino) throws Exception {

        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            BuscaNino busca = entityManager.find(BuscaNino.class, Dni);
            if (busca == null) {
                throw new Exception("No se encuentra registrado en el sistema");
            }
            Ninos nino = ninosCrud.Buscar(identificacionNino);

            if (nino == null) {
                throw new Exception("No se encuentra registrado en el sistema");
            }

            busca.setNino_buscadores(nino);
            entityManager.merge(busca);
            transaction.commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new Exception("Error al asignar buscador: " + e.getMessage());
        } finally {

            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public List<BuscaNino> Listar() throws Exception {
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            var consulta = "SELECT bn FROM Buscadores bn";
            var listaBuscadores = entityManager.createQuery(consulta, BuscaNino.class).getResultList();
            return listaBuscadores;

        } catch (Exception e) {
            String msj = "No hay buscadores registrados en el sistema";
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }

        }

    }
    

}
