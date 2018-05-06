
package mybanco.clases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gusta
 */
public class Tercero implements Serializable{
    
    private String nombre;
    private String identificacion;
    private String clave;
    private Date fRegistro;

    public Tercero(String nombre, String identificacion, String clave) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.clave = clave;
        this.fRegistro = new Date();
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(Date fRegistro) {
        this.fRegistro = fRegistro;
    }
    
    
    
}
