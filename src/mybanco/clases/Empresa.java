package mybanco.clases;

import java.io.Serializable;

public class Empresa extends Tercero implements Serializable{

    public Empresa(String nombre, String identificacion, String clave) {
        super(nombre, identificacion, clave);
    } 
    
}
