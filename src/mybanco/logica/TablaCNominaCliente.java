
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
import mybanco.clases.CuentaNomina;

/**
 * Esta clase contiene las tablas de la cuentas nomina
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class TablaCNominaCliente extends AbstractTableModel {

    private final ArrayList<Cuenta> nominasUsuario;

    private final String[] columnNames = new String[]{
        "Numero", "$ Saldo", "Fecha Creacion", "Empresa"};

    public TablaCNominaCliente(ArrayList<Cuenta> nominasUsuario) {
        this.nominasUsuario = nominasUsuario;
    }

    @Override
    public int getRowCount() {
        return nominasUsuario.size();
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
        CuentaNomina cuenta = (CuentaNomina)nominasUsuario.get(rowIndex);

        if (columnIndex == 0) {
            return cuenta.getNumero();
        }

        if (columnIndex == 1) {
            return cuenta.getMonto();
        }

        if (columnIndex == 2) {
            return cuenta.getfCreacion();
        }

        if (columnIndex == 3) {
            return cuenta.getEmpresa();
        }
        return null;
    }

}
