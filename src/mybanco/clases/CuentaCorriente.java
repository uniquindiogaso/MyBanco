/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.clases;

import java.io.Serializable;
import java.util.Date;

/**
 * Esta clase permite el manejo de Cuentas de Corriente
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class CuentaCorriente extends Cuenta implements Serializable {

    private double valorManejo;

    public CuentaCorriente(double valorManejo, String numero, double monto, Tercero tercero) {
        super(numero, monto, tercero);
        this.valorManejo = valorManejo;
    }

    public double getValorManejo() {
        return valorManejo;
    }

    public void setValorManejo(double valorManejo) {
        this.valorManejo = valorManejo;
    }

}
