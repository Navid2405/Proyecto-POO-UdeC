/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos;

import java.util.Date;

/**
 *
 * @author Navid Lobato
 */
public class RegistrarPeticionDto {
    private final String Fecha;
    private final double CostoComida;
    private final String Identificacion;
    private final String DniPagador;
    private final String id;

    public RegistrarPeticionDto(String id, String Fecha, double CostoComida, String identificacion, String DniPagador) {
        this.Fecha = Fecha;
        this.id=id;
        this.CostoComida = CostoComida;
        this.Identificacion = identificacion;
        this.DniPagador = DniPagador;
    }

    public String getFecha() {
        return Fecha;
    }

    public double getCostoComida() {
        return CostoComida;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getDniPagador() {
        return DniPagador;
    }

    public String getId() {
        return id;
    }
    
    
    
    
    
}
