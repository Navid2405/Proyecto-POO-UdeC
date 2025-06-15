/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.ComedorInfantil.modelo.Dto.Pagos;

/**
 *
 * @author Navid Lobato
 */
public class ListarPeticionDto {
    private String Fecha;
    private double CostoComida;
    private String identificacion;
    private String DniPagador;

    public ListarPeticionDto(String Fecha, double CostoComida, String identificacion, String DniPagador) {
        this.Fecha = Fecha;
        this.CostoComida = CostoComida;
        this.identificacion = identificacion;
        this.DniPagador = DniPagador;
    }

    public String getFecha() {
        return Fecha;
    }

  

    public double getCostoComida() {
        return CostoComida;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getDniPagador() {
        return DniPagador;
    }
    
    
    
}
