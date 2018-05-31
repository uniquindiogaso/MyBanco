package mybanco.logica;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import mybanco.clases.CuentaNomina;

/**
 *
 * @author sori
 */
public class TablaCuentasNomina extends AbstractTableModel {

    private final ArrayList<CuentaNomina> nominas;

    private final String[] columnNames = new String[]{
        "Empleado", "$ Saldo", "Fecha Creacion", "Numero"};

    public TablaCuentasNomina(ArrayList<CuentaNomina> nominas) {
        this.nominas = nominas;
    }

    @Override
    public int getRowCount() {
        return nominas.size();
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
        CuentaNomina cuenta = nominas.get(rowIndex);

        if (columnIndex == 0) {
            return cuenta.getTercero();
        }

        if (columnIndex == 1) {
            return cuenta.getMonto();
        }

        if (columnIndex == 2) {
            return cuenta.getfCreacion();
        }

        if (columnIndex == 3) {
            return cuenta.getNumero();
        }

        return null;

    }

}
