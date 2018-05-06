/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybanco.clases;

import java.io.Serializable;
import java.util.Date;
import mybanco.enums.PagoInteres;

/**
 *
 * @author sori
 */
public class Cdt implements Serializable{
    private Cliente cliente;
    private double inversion;
    private Date fCreacion;
    private int duracion;
    //Porcentaje de Interes Pagado
    private double porInteres;
    private PagoInteres modoPago;

    public Cdt(Cliente cliente, double inversion, Date fCreacion, int duracion, double porInteres, PagoInteres modoPago) {
        this.cliente = cliente;
        this.inversion = inversion;
        this.fCreacion = fCreacion;
        this.duracion = duracion;
        this.porInteres = porInteres;
        this.modoPago = modoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public Date getfCreacion() {
        return fCreacion;
    }

    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPorInteres() {
        return porInteres;
    }

    public void setPorInteres(double porInteres) {
        this.porInteres = porInteres;
    }

    public PagoInteres getModoPago() {
        return modoPago;
    }

    public void setModoPago(PagoInteres modoPago) {
        this.modoPago = modoPago;
    }
    
    
    
}
