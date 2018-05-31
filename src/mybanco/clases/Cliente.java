/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.clases;

import mybanco.enums.Sexo;
import java.io.Serializable;
import java.util.Date;

/**
 * Esta clase permite el manejo de clientes
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class Cliente extends Tercero implements Serializable {

    private String apellido;
    private int edad;
    private Sexo sexo;
    private String usuario;

    private Date fNacimiento;
    private String correo;
    private String resSeguridad;

    public Cliente(String nombre, String identificacion, String clave) {
        super(nombre, identificacion, clave);
    }

    public Cliente(String apellido, int edad, Sexo sexo, String usuario, Date fNacimiento, String correo, String resSeguridad, String nombre, String identificacion, String clave) {
        super(nombre, identificacion, clave);
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.usuario = usuario;
        this.fNacimiento = fNacimiento;
        this.correo = correo;
        this.resSeguridad = resSeguridad;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getResSeguridad() {
        return resSeguridad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setResSeguridad(String resSeguridad) {
        this.resSeguridad = resSeguridad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return getNombre() + " " + apellido;
    }

}
