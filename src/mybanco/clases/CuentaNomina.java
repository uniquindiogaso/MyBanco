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
 * Esta clase permite el manejo de Cuentas de Nomina
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class CuentaNomina extends Cuenta implements Serializable {

    private Empresa empresa;

    public CuentaNomina(Empresa empresa, String numero, double monto, Tercero tercero) {
        super(numero, monto, tercero);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
