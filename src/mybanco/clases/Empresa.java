/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.clases;

import java.io.Serializable;

/**
 * Esta clase permite el manejo de Empresas
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class Empresa extends Tercero implements Serializable {

    public Empresa(String nombre, String identificacion, String clave) {
        super(nombre, identificacion, clave);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    
}
