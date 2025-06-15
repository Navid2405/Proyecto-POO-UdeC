/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil;
import co.edu.udec.poo.ComedorInfantil.Infraestructura.Configuracion.Bd.ConexionBd;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.BuscaNinoCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.ComerCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.MenuCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.NinosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagadorCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PagosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.crud.PlatosCrud;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Ninos;
import java.util.Date;
    import co.edu.udec.poo.ComedorInfantil.modelo.entidades.BuscaNino;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Comer;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Menu;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagador;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Pagos;
import co.edu.udec.poo.ComedorInfantil.modelo.entidades.Platos;

import co.edu.udec.poo.ComedorInfantil.vistas.gui.VentanaPrincipal;

/**
 *
 *
 * @author Navid Lobato
 */
public class Principal {
  public static void main (String [] args) throws Exception{
     
      VentanaPrincipal ventana= new VentanaPrincipal();
      //ventana.setExtendedState(ventana.MAXIMIZED_BOTH);
      ventana.setLocationRelativeTo(null);
      ventana.setVisible(true);
     
     
    
  }
}