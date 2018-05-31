/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.utilidades;

import java.util.ArrayList;
import java.util.Random;
import mybanco.clases.Cliente;
import mybanco.clases.Tercero;

/**
 * Esta clase utilitaria con proposito general
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class General {

    static int MIN = 1000;
    static int MAX = Integer.MAX_VALUE;

    public static String numCuenta(Tercero tercero) {
        //TODO aca puede haber una exception .. generar una personalziada

        Random rand = new Random();
        String identif = tercero.getIdentificacion();
        String p1 = tercero.getNombre().substring(0, 2).toUpperCase();
        int p2 = rand.nextInt((MAX - MIN) + 1) + MIN;
        String p3 = identif.substring(identif.length() - 2, identif.length());

        return String.format("%s%s%s", p1, p2, p3);
    }

    /**
     * Mètodo que imprime un arreglo de clientes
     *
     * @param clientes
     */
    public static void imprimirClientes(ArrayList<Cliente> clientes) {
        for (Cliente c : clientes) {
            System.out.println("" + c.toString() + " get clave " + c.getClave() + " usuario " + c.getUsuario());
        }
    }

}
