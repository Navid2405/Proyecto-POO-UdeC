/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil;
import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
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
import co.edu.udec.poo.ComedorInfantil.pruebas.crud.NinosCrudTest;
import co.edu.udec.poo.ComedorInfantil.vistas.gui.VentanaPrincipal;

/**
 *
 *
 * @author Navid Lobato
 */
public class Principal {
  public static void main (String [] args) throws Exception{
     
     // VentanaPrincipal ventana= new VentanaPrincipal();
      //ventana.setExtendedState(ventana.MAXIMIZED_BOTH);
      //ventana.setLocationRelativeTo(null);
      //ventana.setVisible(true);
     
      NinosCrudTest NinosCrudTest = new  NinosCrudTest();
      NinosCrudTest.Crear_y_GuardarNinoSinError();
  }
}