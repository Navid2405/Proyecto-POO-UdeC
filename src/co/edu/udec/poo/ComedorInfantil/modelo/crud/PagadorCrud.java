/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;
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
public class PagadorCrud {

    private final EntityManagerFactory conexion;

    public PagadorCrud() {
        this.conexion = ConexionBd.conectar();

    }

    public void registrar(Pagador pagador) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(pagador);
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al guardar al pagador con identificacion:" + pagador.getDni();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }

    }

    public void asignarPagador(String Dni, String IdentificacionNino) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            Pagador paga = entityManager.find(Pagador.class, Dni);
            if (paga == null) {
                throw new Exception("EL pagador no se encuentra registrado en el sistema");
            }
            NinosCrud ninosCrud = new NinosCrud();
            Ninos nino = ninosCrud.Buscar(IdentificacionNino);

            if (nino == null) {
                throw new Exception(" El nino no se encuentra registrado en el sistema");
            }

            paga.setNino_pagadores(nino);
            entityManager.merge(paga);
            transaction.commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new Exception("Error al asignar pagador: " + e.getMessage());
        } finally {

            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public void cambiarNumCuenta(String nuevoNumCuenta, String Dni) throws Exception {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;

        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            Pagador paga= entityManager.find(Pagador.class, Dni);
            if (paga == null) {
                throw new Exception("EL pagador no se encuentra registrado en el sistema");
            }
            
            paga.setNumeroCuenta(nuevoNumCuenta);
            entityManager.merge(paga);
            transaction.commit();
            

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new Exception("Error al asignar pagador: " + e.getMessage());
        } finally {

            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public Pagador buscarPorDni(String Dni) throws Exception {
        EntityManager entityManager = null;
        
        try {
             entityManager = conexion.createEntityManager();
            Pagador paga=entityManager.find(Pagador.class, Dni);
             if (paga == null) {
                throw new Exception("EL pagador no se encuentra registrado en el sistema");
            }
             return paga;
            
            
        } catch (Exception e) {
            throw new Exception("Error al buscar el pagadot "+ Dni +". "+ e.getMessage());
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
        

    }

    public List<Pagador> listar() throws Exception {
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            var consulta = "SELECT p FROM Pagadores p";
            var listaPagadores = entityManager.createQuery(consulta, Pagador.class).getResultList();
            return listaPagadores;

        } catch (Exception e) {
            String msj = "No hay pagadores registrados en el sistema";
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }

        }


    }
}
