/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase permite el Manejo de Fechas
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class Fechas {

    public static Date StringAFecha(String fechaString) {
        Date fecha = new Date();
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            fecha = formato.parse(fechaString);
        } catch (ParseException ex) {
            Logger.getLogger(Fechas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }

    /**
     * Mètodo que permite tener los meses entre fechas
     *
     * @param fInicial
     * @param fFinal
     * @return meses
     */
    public static int mesesEntreFechas(Date fInicial, Date fFinal) {

        int meses = 1;

        Calendar inicio = new GregorianCalendar();
        Calendar fin = new GregorianCalendar();

        inicio.setTime(fInicial);
        fin.setTime(fFinal);

        int diffAnios = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
        int diffMeses = diffAnios * 12 + (fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH));

        if (diffMeses > 0) {
            meses = diffMeses;
        }

        return meses;
    }

    /**
     * Sumar a determinada Fecha determinados dias
     *
     * @param fecha Fecha a la que se le va a sumar los dias
     * @param dias dias a sumar
     * @return fecha con los dias ya sumados
     * @see http://developando.com/blog/java-sumar-restar-horas-dias-fecha/
     */
    public static Date sumarDiasFecha(Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }

}
