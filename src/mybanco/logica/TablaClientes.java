
/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.logica;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import mybanco.clases.Cliente;
import mybanco.clases.CuentaNomina;

/**
 * Esta clase contiene las tablas de la cuentas nomina
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class TablaClientes extends AbstractTableModel {

    private final ArrayList<Cliente> clientes;

    private final String[] columnNames = new String[]{
        "Identificacion", "Nombre", "Apellidos", "Email"};

    public TablaClientes(ArrayList<Cliente> Cliente) {
        this.clientes = Cliente;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);

        if (columnIndex == 0) {
            return cliente.getIdentificacion();
        }

        if (columnIndex == 1) {
            return cliente.getNombre();
        }

        if (columnIndex == 2) {
            return cliente.getApellido();
        }

        if (columnIndex == 3) {
            return cliente.getCorreo();
        }

        return null;

    }

}
