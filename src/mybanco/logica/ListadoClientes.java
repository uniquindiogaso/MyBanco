
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
import mybanco.clases.Cliente;
import mybanco.gui.admin.ListaConcurrenteGUI;

/**
 * Esta clase permite cargar listado de los clienes del banco
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class ListadoClientes extends Thread{
    
    private ListaConcurrenteGUI gui;
    private ArrayList<Cliente> clientes;

    public ListadoClientes(ListaConcurrenteGUI gui) {
        this.gui = gui;
        clientes = gui.getP().getLogica().getClientes();
    }
   
    @Override
    public void run() {
        listar();
    }
    
    /**
     * Metodo que permite listar los clientes en hilos
     */
    public void listar(){
        DefaultListModel<Cliente> model = new DefaultListModel<>();
        gui.getListadoClientes().setModel(model);
        for(Cliente c: clientes){
            try {
                model.addElement(c);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListadoClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
