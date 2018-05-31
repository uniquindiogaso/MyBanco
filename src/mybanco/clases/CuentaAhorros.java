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
 * Esta clase permite el manejo de Cuentas de Ahorro
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */

public class CuentaAhorros extends Cuenta implements Serializable {

    private Date fRetiro;
    public final double INTERES_0_A_5 = 0.01;
    public double INTERES_5_A_20 = 0.02;
    public double INTERES_MAS_20 = 0.03;

    public CuentaAhorros(String numero, double monto, Tercero tercero) {
        super(numero, monto, tercero);
    }

    public Date getfRetiro() {
        return fRetiro;
    }

    public void setfRetiro(Date fRetiro) {
        this.fRetiro = fRetiro;
    }

}
