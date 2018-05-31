
/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.logica;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import mybanco.clases.Cdt;

/**
 * Esta clase contiene las tablas de CDTs Cliente
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class TablaCCdtCliente extends AbstractTableModel {

    private final ArrayList<Cdt> cdtsUsuario;

    private final String[] columnNames = new String[]{
        "Inversion", "Fecha Creacion", "Duracion"};

    public TablaCCdtCliente(ArrayList<Cdt> cdtsUsuarios) {
        this.cdtsUsuario = cdtsUsuarios;
    }

    @Override
    public int getRowCount() {
        return cdtsUsuario.size();
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
        Cdt cdt = cdtsUsuario.get(rowIndex);

        if (columnIndex == 0) {
            return cdt.getInversion();
        }

        if (columnIndex == 1) {
            return cdt.getfCreacion();
        }

        if (columnIndex == 2) {
            return cdt.getDuracion();
        }
        return null;
    }

}
