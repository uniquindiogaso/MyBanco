/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import mybanco.clases.Cliente;
import mybanco.enums.Sexo;
import mybanco.utilidades.Fechas;

/**
 * Esta clase permite cargar lo hilos co los clintes
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class HiloCargaCliente extends Thread {

    private File archivoClientes;
    private Logica logica;
    private ArrayList<Cliente> clientes;
    private int cantidad;
    private boolean finalizado = false;

    public HiloCargaCliente(File archivoClientes, Logica logica, int cantidad) {
        this.archivoClientes = archivoClientes;
        this.logica = logica;
        this.cantidad = cantidad;
        clientes = new ArrayList<>();
    }

    @Override
    public void run() {
        cargarClientes();
        if (finalizado) {
            logica.getClientes().addAll(clientes);
            logica.persistencia().guardarCliente(logica.getClientes());
        }
    }

    /**
     * Mètodo para cargar los Clientes de 10 en 10 los Clientes
     *
     */
    public void cargarClientes() {
        String linea = "";
        int numLineaFinal = cantidad - 1;
        int numLineaInicio = numLineaFinal - 9;
        int numLineaActual = 0;
        try {
            FileReader fr = new FileReader(new File(archivoClientes.getAbsolutePath()));
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                if (numLineaActual >= numLineaInicio && numLineaActual <= numLineaFinal) {
                    String[] registro = linea.split(";");
                    Cliente c = new Cliente(registro[0], registro[4], registro[5]);
                    c.setApellido(registro[1]);
                    if (null != registro[2]) {
                        switch (registro[2]) {
                            case "F":
                                c.setSexo(Sexo.FEMENINO);
                                break;
                            case "M":
                                c.setSexo(Sexo.MASCULINO);
                                break;
                        }
                    }
                    c.setCorreo(registro[3]);
                    c.setResSeguridad(registro[6]);
                    c.setfNacimiento(Fechas.StringAFecha(registro[7]));
                    c.setUsuario(registro[8]);
                    clientes.add(c);
                }
                numLineaActual++;
            }

            if (!clientes.isEmpty()) {
                finalizado = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
