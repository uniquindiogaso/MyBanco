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
public class CuentaAhorros extends Cuenta implements Serializable{
    
    private Date fRetiro;
    public double INTERES_0_A_5 = 0.01;
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
