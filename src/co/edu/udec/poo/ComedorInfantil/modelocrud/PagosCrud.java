/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelocrud;

import co.edu.udec.poo.ComedorInfantil.modeloentidades.Ninos;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagador;
import co.edu.udec.poo.ComedorInfantil.modeloentidades.Pagos;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Navid Lobato
 */
public class PagosCrud {
    
    private Map<String, Pagos> generarPagos;
    private NinosCrud ninosCrud;
    private ComerCrud comerCrud;
    private PagadorCrud pagadorCrud;
    
    
    
    public PagosCrud(NinosCrud ninosCrud,ComerCrud comerCrud, PagadorCrud pagadorCrud){
        this.ninosCrud=ninosCrud;
        this.comerCrud= comerCrud;
        this.pagadorCrud=pagadorCrud;
        generarPagos= new HashMap<>();
              
        
    }
     public void registrarPago(Pagos pago){
     
         generarPagos.put(pago.getId(), pago);
     }
     
     public void generarPago(Pagos pago) throws Exception{
         Ninos nino= ninosCrud.Buscar(pago.getIdentificacion());
         double totalComida= comerCrud.contarComidas(nino.getIdentificacion());
         
         double costoComida= (totalComida*pago.getCostoComida()) + pago.getCostoFijo();
         pago.setCostoTotal(costoComida);
         
         Pagador pagador=pagadorCrud.buscarPorDni(pago.getDniPagador());
         Map<Pagador, java.util.List<Ninos>> map= pagadorCrud.buscar(pagador);
         java.util.List <Ninos> ninosDelPagador = map.get(pagador);
         
         boolean encontrar= false;
         for (Ninos nino1: ninosDelPagador){
             if(nino1.getIdentificacion().equals(nino.getIdentificacion())){
                 encontrar = true;
                 break;
                 
                 
                 
             }
             
             if(!encontrar){
                 throw new Exception ("Este pagador no le corresponde a este Niño");
             }
         }
         generarPagos.put(pago.getId(), pago);
     }
    
     
     
     public void Listar(){
          if (generarPagos.isEmpty()) {
        System.out.println("No hay pagos registrados.");
        return;
    }
          
          for(Pagos pago: generarPagos.values()){
              System.out.println(pago.toString());
              
          }
         
     }
}
