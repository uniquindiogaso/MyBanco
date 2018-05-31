/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mybanco.clases.Cdt;
import mybanco.clases.Cliente;
import mybanco.clases.Cuenta;
import mybanco.clases.Empresa;
import mybanco.enums.Sexo;

/**
 * Esta clase permite el Manejo de Persistencia en Archivos
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class Archivos {

    /**
     * Ruta del Usuario
     */
    String rutaApp = System.getProperty("user.home") + System.getProperty("file.separator") + "MyBanco" + System.getProperty("file.separator");

    public final String CLIENTES = rutaApp + "clientes.sori";
    public final String EMPRESAS = rutaApp + "empresas.sori";
    public final String CUENTAS = rutaApp + "cuentas.sori";
    public final String CDT = rutaApp + "cdts.sori";

    public Archivos() {
        crearRutasSinoExiste();

    }

    /**
     * Mètodo Guardar Cliente
     *
     * @param clientes arreglo de clientes
     * @return boolean
     */
    public boolean guardarCliente(ArrayList<Cliente> clientes) {
        System.out.println("Archivo Clientes se guardara en:  " + CLIENTES);
        FileOutputStream ficheroSalida = null;
        try {
            ficheroSalida = new FileOutputStream(CLIENTES, false);
            //Escribir en archivo el objeto asignatura
            try (ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida)) {
                //Escribir en archivo el objeto asignatura
                objetoSalida.writeObject(clientes);
            }
            return true;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Archivo No econtrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en Escritura Archivo", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ficheroSalida.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Cerrando Archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    /**
     * Método para Guardar Empresa
     *
     * @param empresas arreglo de empresas
     * @return boolean
     */
    public boolean guardarEmpresa(ArrayList<Empresa> empresas) {
        System.out.println("Archivo empresas se guardara en:  " + EMPRESAS);
        FileOutputStream ficheroSalida = null;
        try {
            ficheroSalida = new FileOutputStream(EMPRESAS, false);
            //Escribir en archivo el objeto asignatura
            try (ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida)) {
                //Escribir en archivo el objeto asignatura
                objetoSalida.writeObject(empresas);
            }
            return true;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Archivo No econtrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en Escritura Archivo", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ficheroSalida.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Cerrando Archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    /**
     * Método para Guardar Cuentas
     *
     * @param cuentas arreglo de cuentas
     * @return boolean
     */
    public boolean guardarCuentas(ArrayList<Cuenta> cuentas) {
        System.out.println("Archivo cuentas se guardara en:  " + CUENTAS);
        FileOutputStream ficheroSalida = null;
        try {
            ficheroSalida = new FileOutputStream(CUENTAS, false);
            //Escribir en archivo el objeto asignatura
            try (ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida)) {
                //Escribir en archivo el objeto asignatura
                objetoSalida.writeObject(cuentas);
            }
            return true;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Archivo No econtrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en Escritura Archivo", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ficheroSalida.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Cerrando Archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    /**
     * Método para Guardar CDTS
     *
     * @param cdts arreglo de cdts
     * @return boolean
     */
    public boolean guardarCDTS(ArrayList<Cdt> cdts) {
        System.out.println("Archivo CDTS se guardara en:  " + CDT);
        FileOutputStream ficheroSalida = null;
        try {
            ficheroSalida = new FileOutputStream(CDT, false);
            //Escribir en archivo el objeto asignatura
            try (ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida)) {
                //Escribir en archivo el objeto asignatura
                objetoSalida.writeObject(cdts);
            }
            return true;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Archivo No econtrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en Escritura Archivo", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ficheroSalida.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Cerrando Archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    /**
     * Método Obtener Clientes
     *
     * @return Obtiene un arreglo de clientes
     */
    public ArrayList<Cliente> obtenerClientes() {
        System.out.println("Obtener de Clientes de " + CLIENTES);
        FileInputStream ficheroEntrada = null;
        ArrayList<Cliente> res = new ArrayList<>();
        try {
            ficheroEntrada = new FileInputStream(CLIENTES);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);

            res = (ArrayList<Cliente>) objetoEntrada.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("No se encontraron clientes ..");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ficheroEntrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("del archivo " + res.size());
        return res;
    }

    /**
     * Método Obtener Empresa
     *
     * @return Arreglo para obtener Empresas
     */
    public ArrayList<Empresa> obtenerEmpresas() {
        FileInputStream ficheroEntrada = null;
        ArrayList<Empresa> res = new ArrayList<>();
        try {
            ficheroEntrada = new FileInputStream(EMPRESAS);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);

            res = (ArrayList<Empresa>) objetoEntrada.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, "IOException", ex);
        } catch (IOException ex) {
            System.out.println("No se encontraron empresas ..");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, "ClassNotFoundException", ex);
        } finally {
            try {
                ficheroEntrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, "IOException", ex);
            }
        }
        return res;
    }

    /**
     * Metodo Obtener Cuentas
     *
     * @return Obtiene arreglo de cuentas
     */
    public ArrayList<Cuenta> obtenerCuentas() {
        FileInputStream ficheroEntrada = null;
        ArrayList<Cuenta> res = new ArrayList<>();
        try {
            ficheroEntrada = new FileInputStream(CUENTAS);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);

            res = (ArrayList<Cuenta>) objetoEntrada.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("No se encontraron clientes ..");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ficheroEntrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }

    /**
     * Mètodo para obtener cdts
     *
     * @return Arreglo para obtener CDTS
     */
    public ArrayList<Cdt> obtenerCdts() {
        FileInputStream ficheroEntrada
                = null;
        ArrayList<Cdt> res = new ArrayList<>();
        try {
            ficheroEntrada = new FileInputStream(CDT);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);

            res = (ArrayList<Cdt>) objetoEntrada.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("No se encontraron cdts ..");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ficheroEntrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }

    /**
     * Mètodo para cargar los Clientes
     *
     * @param ruta
     * @return clientes
     */
    public ArrayList<Cliente> cargarClientes(String ruta) {
        String linea = "";

        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File(ruta));
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
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
            return clientes;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Mètodo para comprobar la existencia de Archivos
     *
     * @param ruta
     * @return la ruta del archivo
     */
    private void comprobarExistenciaArchivos(String ruta) {
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            try {
                //Crear Carpeta si no existe
                archivo.getParentFile().mkdirs();
                //crear archivo si no existe
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Mètodo para comprobar la existencia de la Carpeta
     *
     * @param ruta
     */
    private void comprobarExistenciaCarpeta(String ruta) {
        File carpeta = new File(ruta);
        if (carpeta.isDirectory() && !carpeta.exists()) {
            carpeta.mkdirs();
        }
    }

    /**
     * Mètodo que permite crear rutas si no existen
     */
    private void crearRutasSinoExiste() {
        comprobarExistenciaCarpeta(rutaApp);
        comprobarExistenciaArchivos(CLIENTES);
        comprobarExistenciaArchivos(EMPRESAS);
        comprobarExistenciaArchivos(CUENTAS);
        comprobarExistenciaArchivos(CDT);
    }
}
