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
 * @author gusta
 */
public class CuentaCorriente extends Cuenta implements Serializable{
    
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
