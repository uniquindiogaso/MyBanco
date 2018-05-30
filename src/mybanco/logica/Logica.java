package mybanco.logica;

import java.util.ArrayList;
import mybanco.clases.Cdt;
import mybanco.clases.Cliente;
import mybanco.clases.Cuenta;
import mybanco.clases.CuentaAhorros;
import mybanco.clases.CuentaCorriente;
import mybanco.clases.Empresa;
import mybanco.clases.Tercero;
import mybanco.utilidades.Archivos;
import mybanco.utilidades.General;

/**
 *
 * @author sori
 */
public class Logica {

    private ArrayList<Cliente> clientes;
    private ArrayList<Empresa> empresas;
    private ArrayList<Cdt> cdts;
    private ArrayList<Cuenta> cuentas;

    private Archivos archivos;

    public Logica() {
        //manejador de archivos
        archivos = new Archivos();
        this.clientes = archivos.obtenerClientes();
        this.empresas = archivos.obtenerEmpresas();
        this.cdts = archivos.obtenerCdts();
        this.cuentas = archivos.obtenerCuentas();

        System.out.println("Cantidad de Clientes Sistema " + clientes.size());
        System.out.println("Cantidad de Empresas Sistema " + empresas.size());
        System.out.println("Cantidad de CDTS Sistema " + cdts.size());
        System.out.println("Cantidad de Cuentas Sistema " + cuentas.size());
    }

    public Tercero iniciarSesion(String user, String clave) {
        Tercero usuario = null;
        for (Cliente c : clientes) {
            if (user.equals(c.getUsuario()) && clave.equals(c.getClave())) {
                usuario = c;
            }
        }

        for (Empresa e : empresas) {
            if (user.equals(e.getIdentificacion()) && clave.equals(e.getClave())) {
                usuario = e;
            }
        }

        return usuario;
    }

    public void recuperarClave(String identif, String respuesta) {
        for (Cliente c : clientes) {
            if (c.getIdentificacion().equals(identif) && c.getResSeguridad().toLowerCase().equals(respuesta.toLowerCase())) {
                //imprimir msj con JOption
                System.out.println("Su clave es : " + c.getClave());
            }
        }
    }

    public String crearCuentaAhorros(Tercero tercero) {
        String numCuenta = General.numCuenta(tercero);
        boolean ok = cuentas.add(new CuentaAhorros(numCuenta, 0, tercero));
        if (ok) {
            return numCuenta;
        }
        return null;
    }
    
    public String crearCuentaCorriente(Tercero tercero) {
        String numCuenta = General.numCuenta(tercero);
        boolean ok = cuentas.add(new CuentaCorriente(0, numCuenta, 0, tercero) );
        if (ok) {
            return numCuenta;
        }
        return null;
    }    

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public ArrayList<Cdt> getCdts() {
        return cdts;
    }

    public void setCdts(ArrayList<Cdt> cdts) {
        this.cdts = cdts;
    }

    public Archivos persistencia() {
        return archivos;
    }

}