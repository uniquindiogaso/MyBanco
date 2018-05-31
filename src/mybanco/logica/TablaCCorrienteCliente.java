
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
import mybanco.clases.CuentaCorriente;

/**
 * Esta clase contiene las tablas de la cuentas Corriente
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class TablaCCorrienteCliente extends AbstractTableModel {

    private final ArrayList<Cuenta> corrienteUsuario;

    private final String[] columnNames = new String[]{
        "Numero", "$ Saldo", "Fecha Creacion"};

    public TablaCCorrienteCliente(ArrayList<Cuenta> corrienteUsuario) {
        this.corrienteUsuario = corrienteUsuario;
    }

    @Override
    public int getRowCount() {
        return corrienteUsuario.size();
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
        CuentaCorriente cuenta = (CuentaCorriente) corrienteUsuario.get(rowIndex);

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
