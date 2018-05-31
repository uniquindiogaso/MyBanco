
/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.logica;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import mybanco.clases.Cuenta;
import mybanco.clases.CuentaAhorros;

/**
 * Esta clase contiene las tablas de la cuentas ahorros
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class TablaCAhorrosCliente extends AbstractTableModel {

    private final ArrayList<Cuenta> ahorrosUsuario;

    private final String[] columnNames = new String[]{
        "Numero", "$ Saldo", "Fecha Creacion"};

    public TablaCAhorrosCliente(ArrayList<Cuenta> cuentas) {
        this.ahorrosUsuario = cuentas;
    }

    @Override
    public int getRowCount() {
        return ahorrosUsuario.size();
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
        CuentaAhorros cuenta = (CuentaAhorros)ahorrosUsuario.get(rowIndex);

        if (columnIndex == 0) {
            return cuenta.getNumero();
        }

        if (columnIndex == 1) {
            return cuenta.getMonto();
        }

        if (columnIndex == 2) {
            return cuenta.getfCreacion();
        }
        return null;
    }

}
