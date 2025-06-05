/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil;
import co.edu.udec.poo.ComedorInfantil.modelocrud.BuscaNinoCrud;
import co.edu.udec.poo.ComedorInfantil.modelocrud.ComerCrud;
import co.edu.udec.poo.ComedorInfantil.modelocrud.MenuCrud;
import co.edu.udec.poo.ComedorInfantil.modelocrud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelocrud.PagadorCrud;
import co.edu.udec.poo.ComedorInfantil.modelocrud.PagosCrud;
import co.edu.udec.poo.ComedorInfantil.modelocrud.PlatosCrud;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import java.util.Date;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.BuscaNino;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Comer;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Menu;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagador;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagos;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Platos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 *
 * @author Navid Lobato
 */
public class Principal {
  public static void main (String [] args) throws Exception{
      
      ComerCrud comerCrud= new  ComerCrud();
      NinosCrud ninosCrud= new NinosCrud();
      MenuCrud menuCrud= new MenuCrud();
      BuscaNinoCrud buscaCrud= new BuscaNinoCrud(ninosCrud);
      PagadorCrud pagadorCrud= new PagadorCrud(ninosCrud);
      PlatosCrud platosCrud= new PlatosCrud();
      PagosCrud pagosCrud=new PagosCrud(ninosCrud, comerCrud, pagadorCrud);
      
      
      Platos plato1= new Platos("Bandeja paisa", Arrays.asList("Ahuacate", "Arroz","Frijoles", "Chicharron", "Platano amarillo", "chorizo"));
      Menu menu1= new Menu("Comida tipica colombiana", "1");
      Ninos niño1= new Ninos("Naset", "A00001", new Date(), "1121532246");
      Comer comida1= new Comer(new Date(), niño1, menu1, 1 );
      BuscaNino buscador1= new BuscaNino("112158578598", "JOse Gregorio Lobato", "El pozon", "3011986685", "Padre");
      Pagador pagador1= new Pagador("22809952", "Marta alvcarez", "El pozon", "3011986685", "225756813312968216");
      Pagos pago1 = new Pagos("0001", new Date(), 500, "1121532246", "22809952");
      
      // prueba de NinosCrud
      ninosCrud.Agregar(niño1);
      ninosCrud.Listar();
      ninosCrud.Buscar(niño1.getIdentificacion());
      
       System.out.println();
        System.out.println();
        
      //prueba de PlatosCrud
      platosCrud.agregarPlato(plato1);
      platosCrud.mostrarPlatos();
      
       System.out.println();
        System.out.println();
       
      
      //prueba de MenuCrud
      menuCrud.aggMenu(menu1);
      menuCrud.AggPlato(plato1, "Comida tipica colombiana");
      menuCrud.Listar();
       System.out.println();
        System.out.println();
      
      
      //prueba ComerCrud
      
      comerCrud.registrarComida(comida1);
      comerCrud.listarComidas("1121532246");
      comerCrud.contarComidas("1121532246");
      
       System.out.println();
        System.out.println();
      
      //prueba BuscaNinoCrud
      buscaCrud.registrarse(buscador1);
      buscaCrud.asignarBuscador(buscador1.getDni(), "1121532246");
      buscaCrud.listar();
      
       System.out.println(); 
       System.out.println();
       
      
      //prueba Pagador Crud
      pagadorCrud.registrar(pagador1);
      pagadorCrud.asignarPagador("22809952", "1121532246");
      pagadorCrud.buscar(pagador1);
      pagadorCrud.cambiarNumCuenta("546156265", "22809952");
      pagadorCrud.listar();
      
      
      System.out.println();
       System.out.println();
      
      //prueba PagosCrud
      pagosCrud.registrarPago(pago1);
      pagosCrud.generarPago(pago1);
      pagosCrud.Listar();
      
      
      
      
      
      
     
      
   
      
      
  }
}