/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.crud;

import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagos;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.BuscaNino;
import java.util.ArrayList;
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
public class NinosCrud {

    public static HashMap<String, Ninos> ninos;
    HashMap<String, List<Pagador>> pagadoresAutorizados;
    HashMap<String, List<Pagos>> registroPagos;
    HashMap<String, List<BuscaNino>> buscaNino;
    List<String> Alergias;
    public static List<Ninos> Retirados;
    private EntityManagerFactory conexion;

    public NinosCrud() {
        ninos = new HashMap<>();
        pagadoresAutorizados = new HashMap<>();
        registroPagos = new HashMap<>();
        buscaNino = new HashMap<>();
        Alergias = new ArrayList<>();
        Retirados = new ArrayList<>();
        conexion = ConexionBd.conectar();
    }

    public void Agregar(Ninos nino) throws Exception {

        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(nino);
            transaction.commit();
        } catch (Exception err) {
            if (transaction != null) {
                transaction.rollback();
            }
            String msj = "Error al guardar al niño con identificacion:" + nino.getIdentificacion();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public Ninos Buscar(String Identificacion) throws Exception {
        EntityManager entityManager = null;
        try {
            entityManager = conexion.createEntityManager();
            Ninos nino = entityManager.find(Ninos.class, Identificacion);
            if (nino == null) {
                String msj = "Error Nino:" + Identificacion + " no existe.";
                throw new Exception(msj);
            }
            return nino;
        } catch (Exception e) {
            throw e;

        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void editar(Ninos nino) throws Exception {
        this.Buscar(nino.getIdentificacion());
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(nino);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            String msj = "Error al editar el niño : " + nino.getIdentificacion();
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }

    }

    public void eliminar(String Identificacion) throws Exception {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            Ninos nino = entityManager.find(Ninos.class, Identificacion);
            if (nino == null) {
                String msj = "El niño: " + Identificacion + "no se ha encontrado en el sistema";

            }
            entityManager.remove(nino);
            transaction.commit();
            System.out.println("El niño fue eliminado con exito");
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            String msj = "Error al eliminar el niño : " + Identificacion;
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }

    }

    public void Retirar(String Identificacion) throws Exception {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = conexion.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            Ninos nino = entityManager.find(Ninos.class, Identificacion);
            if (nino == null) {
                String msj = "El niño: " + Identificacion + "no se ha encontrado en el sistema";
                throw new Exception(msj);
            }

            String fecha = new Date().toString().trim();
            nino.setEstado("BAJA");
            nino.setFechaBaja(fecha);
            entityManager.merge(nino);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            String msj = "Error al retirar el niño : " + Identificacion;
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }
    }

    public List<Ninos> ConsultarBajas() throws Exception {
        EntityManager entityManager = null;

        try {

            entityManager = conexion.createEntityManager();

            String consulta = "SELECT n FROM NinosT n WHERE n.estado = :estado ";
            List<Ninos> bajas = entityManager.createQuery(consulta, Ninos.class)
                    .setParameter("estado", "BAJA")
                    .getResultList();
            return bajas;
        } catch (Exception e) {
            throw new Exception("Error al consultar los niños con estado BAJA" + e.getMessage());
        } finally {
            if (entityManager.isOpen() && entityManager != null) {
                entityManager.close();
            }
        }
    }

    public List<Ninos> Listar() throws Exception {
        EntityManager entityManager = null;

        try {
            entityManager = conexion.createEntityManager();
            var consulta = "SELECT n FROM NinosT n";
            var listaNinos = entityManager.createQuery(consulta, Ninos.class).getResultList();
            return listaNinos;

        } catch (Exception e) {
            String msj = "No hay nadie registrado en el sistema";
            throw new Exception(msj);
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();

            }
        }

    }

    public int Contar() {
        return ninos.size();

    }

    public void RegistroAlergias(String identificacion) throws Exception {

        Scanner sc = new Scanner(System.in);
        for (Ninos niño : ninos.values()) {
            if (niño.getIdentificacion().equals(identificacion)) {
                System.out.println("Digite las alegias que presenta el niño");
                String alergias = sc.nextLine();
                ArrayList<String> Alergias = new ArrayList<String>();
                Alergias.add(alergias);

                System.out.println("Alergias agregadas con exito");
                break;
            } else {
                throw new Exception("El Niño con este numero de matricula no se encuentra en el sistema.");
            }
        }
    }

    public void registrarPago(Pagos pago, String Identificacion) throws Exception {
        if (ninos.containsKey(Identificacion)) {
            registroPagos.putIfAbsent(Identificacion, new ArrayList<>());
            registroPagos.get(Identificacion).add(pago);

        } else {
            throw new Exception("No se encontro el niño identificado con: " + Identificacion + "para registrar el pago");
        }
    }
}
