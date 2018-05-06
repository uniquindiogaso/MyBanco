/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybanco.clases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sori
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
