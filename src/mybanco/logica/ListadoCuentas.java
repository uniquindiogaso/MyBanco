
/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.logica;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import mybanco.clases.Cuenta;
import mybanco.clases.CuentaCorriente;
import mybanco.gui.admin.ListaConcurrenteGUI;
import mybanco.gui.admin.ListaConcurrenteGUI2;

/**
 * Esta clase permite cargar listado de los clienes del banco
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class ListadoCuentas extends Thread {

    private ListaConcurrenteGUI2 gui;
    private ArrayList<Cuenta> cuentas;

    public ListadoCuentas(ListaConcurrenteGUI2 gui) {
        this.gui = gui;
        cuentas = gui.getP().getLogica().getCuentas();
    }

    @Override
    public void run() {
        listar();
    }

    /**
     * Metodo que permite listar los clientes en hilos
     */
    public void listar() {
        DefaultListModel<CuentaCorriente> model = new DefaultListModel<>();
        gui.getListadoClientes().setModel(model);
        for (Cuenta c : cuentas) {
            try {
                if (c instanceof CuentaCorriente) {
                    model.addElement((CuentaCorriente) c);
                    Thread.sleep(1000);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(ListadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
