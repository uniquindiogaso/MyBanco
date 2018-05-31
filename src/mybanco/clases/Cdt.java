/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.clases;

import java.io.Serializable;
import java.util.Date;
import mybanco.enums.PagoInteres;

/**
 * Esta clase permite el Manejo de CDTS
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class Cdt implements Serializable {

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

    @Override
    public String toString() {
        return cliente + " - $" + inversion + " - Duración :" + duracion;
    }

    
    
    
}
