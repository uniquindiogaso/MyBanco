package mybanco.clases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sori
 */
public class Cuenta implements Serializable {

    public static int CUOTA_MANEJO = 8000;
    private String numero;
    private Date fCreacion;
    private double monto;
    private Tercero tercero;

    public Cuenta(String numero, double monto, Tercero tercero) {
        this.numero = numero;
        this.fCreacion = new Date();
        this.monto = monto;
        this.tercero = tercero;
    }

    public Tercero getTercero() {
        return tercero;
    }

    public void setTercero(Tercero tercero) {
        this.tercero = tercero;
    }

    public String getNumero() {
        return numero;
    }

    public Date getfCreacion() {
        return fCreacion;
    }

    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return numero + " - $" + monto;
    }

}
