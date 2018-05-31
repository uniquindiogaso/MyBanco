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
import mybanco.clases.Cdt;
import mybanco.gui.admin.ListaConcurrenteGUI;

/**
 * Esta clase permite conocer los listados de cdts
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class ListadoCDTS extends Thread {

    private ListaConcurrenteGUI gui;
    private ArrayList<Cdt> cdts;

    public ListadoCDTS(ListaConcurrenteGUI gui) {
        this.gui = gui;
        cdts = gui.getP().getLogica().getCdts();
    }

    @Override
    public void run() {
        listar();
    }

    /**
     * Metodo que permite listar los elementos pasadole hilos
     */
    public void listar() {
        DefaultListModel<Cdt> model = new DefaultListModel<>();
        gui.getListadoCDTS().setModel(model);
        for (Cdt c : cdts) {
            try {
                model.addElement(c);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListadoCDTS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
