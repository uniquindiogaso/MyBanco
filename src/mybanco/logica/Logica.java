/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.logica;

import java.util.ArrayList;
import java.util.Date;
import mybanco.clases.Cdt;
import mybanco.clases.Cliente;
import mybanco.clases.Cuenta;
import mybanco.clases.CuentaAhorros;
import mybanco.clases.CuentaCorriente;
import mybanco.clases.CuentaNomina;
import mybanco.clases.Empresa;
import mybanco.clases.Tercero;
import mybanco.utilidades.Archivos;
import mybanco.utilidades.General;

/**
 * Esta clase contiene la logica del proyecto
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
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

    /**
     * Metodo que permite a un tercero iniciar sesion
     *
     * @param user usuario
     * @param clave clave del usuario
     * @return usuario
     */
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

    /**
     * Metodo que perite recuperar la clave
     *
     * @param identif cedula del usuario
     * @param respuesta clave
     * @return Cliente
     */
    public Cliente recuperarClave(String identif, String respuesta) {
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getIdentificacion().equals(identif) && c.getResSeguridad().toLowerCase().equals(respuesta.toLowerCase())) {
                cliente = c;
            }
        }

        return cliente;
    }

    /**
     * Metodo que permite modificar un cliente
     *
     * @param c cliente
     * @return boleano
     */
    public boolean modificarCliente(Cliente c) {
        int pos = -1;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdentificacion().equals(c.getIdentificacion())) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            clientes.get(pos).setNombre(c.getNombre());
            clientes.get(pos).setApellido(c.getApellido());
            clientes.get(pos).setCorreo(c.getCorreo());
            clientes.get(pos).setSexo(c.getSexo());
            clientes.get(pos).setfNacimiento(c.getfNacimiento());
            clientes.get(pos).setUsuario(c.getUsuario());
            clientes.get(pos).setClave(c.getClave());
            clientes.get(pos).setResSeguridad(c.getResSeguridad());
        }

        return true;
    }

    /**
     * Metodo que contiene un arreglo de cuentas de ahorro del usuario
     *
     * @param t tercero
     * @return un resultado con las cuentas disponibles
     */
    public ArrayList<Cuenta> cuentasAhorrosUsuario(Tercero t) {
        ArrayList<Cuenta> res = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorros && cuenta.getTercero().getIdentificacion().equals(t.getIdentificacion())) {
                res.add(cuenta);
            }
        }
        System.out.println("Cuentas Ahorros para Usuario: " + res.size());
        return res;
    }

    /**
     * Metodo que contiene un arreglo de cuentas nomina del usuario
     *
     * @param t tercero
     * @return resultado total de cuentas
     */
    public ArrayList<Cuenta> cuentasNominaUsuario(Tercero t) {
        ArrayList<Cuenta> res = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaNomina && cuenta.getTercero().getIdentificacion().equals(t.getIdentificacion())) {
                res.add(cuenta);
            }
        }
        System.out.println("Cuentas Nomina para Usuario: " + res.size());
        return res;
    }

    /**
     * Metodo que contiene un arreglo de cuentas corrientes del usuario
     *
     * @param t tercero
     * @return resultado con las cuentas corrientes del usuario
     */
    public ArrayList<Cuenta> cuentasCorrientesUsuario(Tercero t) {
        ArrayList<Cuenta> res = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaCorriente && cuenta.getTercero().getIdentificacion().equals(t.getIdentificacion())) {
                res.add(cuenta);
            }
        }
        System.out.println("Cuentas corrientes para Usuario: " + res.size());
        return res;
    }

    public ArrayList<Cdt> cdtsUsuario(Tercero t) {
        ArrayList<Cdt> res = new ArrayList<>();
        for (Cdt cdt : cdts) {
            if (cdt.getCliente().getIdentificacion().equals(t.getIdentificacion())) {
                res.add(cdt);
            }
        }
        return res;
    }

    /**
     * Metodo que permite actualizar el monto de la cuenta de ahorros
     *
     * @param cuentaAct cuenta de ahorros activa
     * @param monto monto de la cuenta de ahorros
     * @param fRetiro fecha de retiro de la cuenta de ahorros
     * @return boleano
     */
    public boolean actualizarMontoCuentaAhorros(Cuenta cuentaAct, Double monto, Date fRetiro) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(cuentaAct.getNumero())) {

//                if (fRetiro != null) {
//                    ((CuentaAhorros) cuenta).setfRetiro(fRetiro);
//                }
                cuenta.setMonto(monto + cuenta.getMonto());
                //actualizar en archivo
                archivos.guardarCuentas(cuentas);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para actualizar la fecha monto de cuenta corriente
     *
     * @param cuentaAct cueta corriente del usuario
     * @param monto monto actual de la cuenta corriente
     * @return booleano
     */
    public boolean actualizarMontoCuentaCorriente(Cuenta cuentaAct, Double monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(cuentaAct.getNumero())) {

                cuenta.setMonto(monto + cuenta.getMonto());
                //actualizar en archivo
                archivos.guardarCuentas(cuentas);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que permite actualizar monto de cuenta nomina
     *
     * @param numCuenta numero de cuenta
     * @param monto monto disponible
     * @return boleano
     */
    public boolean actualizarMontoCuentaNomina(String numCuenta, Double monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(numCuenta)) {
                cuenta.setMonto(monto + cuenta.getMonto());
                //actualizar en archivo
                archivos.guardarCuentas(cuentas);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que permite la creacion de una cuenta de ahorros
     *
     * @param tercero
     * @return numero de cuenta
     */
    public String crearCuentaAhorros(Tercero tercero) {
        String numCuenta = General.numCuenta(tercero);
        boolean ok = cuentas.add(new CuentaAhorros(numCuenta, 0, tercero));
        if (ok) {
            return numCuenta;
        }
        return null;
    }

    /**
     * Metodo que permite la creacion de la cuenta corriente
     *
     * @param tercero
     * @return numero de la cuenta
     */
    public String crearCuentaCorriente(Tercero tercero) {
        String numCuenta = General.numCuenta(tercero);
        boolean ok = cuentas.add(new CuentaCorriente(0, numCuenta, 0, tercero));
        if (ok) {
            return numCuenta;
        }
        return null;
    }

    /**
     * Metodo que permite la cracion de la cuenta de nomina
     *
     * @param empresa empresa
     * @param tercero a quien se le va a asiganar la cuenta
     * @return numero de cuenta
     */
    public String crearCuentaNomina(Empresa empresa, Tercero tercero) {
        String numCuenta = General.numCuenta(tercero);
        boolean ok = cuentas.add(new CuentaNomina(empresa, numCuenta, 0, tercero));
        if (ok) {
            return numCuenta;
        }
        return null;
    }

    /**
     * Metodo que permite obtener el numero de la cuenta nomina
     *
     * @param c cliente
     * @return numero de cuenta
     */
    public String obtenerNumCuentaNomina(Cliente c) {
        for (Cuenta cuenta : cuentas) {
            if (c.getIdentificacion().equals(cuenta.getTercero().getIdentificacion()) && cuenta instanceof CuentaNomina) {
                return cuenta.getNumero();
            }
        }
        return null;
    }

    /**
     * MEtodo que permite conocer la existencua de la cuenta nomina
     *
     * @param empresa empresa
     * @param empleado empleado
     * @return booleano
     */
    public boolean existeCuentaNomina(Empresa empresa, Tercero empleado) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaNomina) {
                System.out.println("cuenta nomina! " + cuenta.getTercero().getNombre());
                CuentaNomina nomina = (CuentaNomina) cuenta;
                if (nomina.getEmpresa().getIdentificacion().equals(empresa.getIdentificacion()) && nomina.getTercero().getIdentificacion().equals(empleado.getIdentificacion())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * MEtodo que permite la existencia de la cuenta nomina a un tercero
     *
     * @param tercero tercero
     * @return boleano
     */
    public boolean existeCuentaNomina(Tercero tercero) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaNomina && cuenta.getTercero().getIdentificacion().equals(tercero.getIdentificacion())) {
                return true;
            }
        }
        return false;
    }

    /**
     * MEtodo que permite validar si la cuenta si existe
     *
     * @param identificacion identificacion del usuario
     * @return boleano
     */
    public boolean validarSiExisteCliente(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que contienen un arreglo para obtener las cuentas
     *
     * @param empresa empresa
     * @return nominas de la empresa
     */
    public ArrayList<CuentaNomina> obtenerCuentasNominaEmpresa(Tercero empresa) {
        ArrayList<CuentaNomina> nominas = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaNomina) {
                CuentaNomina nomina = (CuentaNomina) cuenta;
                if (nomina.getEmpresa().getIdentificacion().equals(empresa.getIdentificacion())) {
                    nominas.add(nomina);
                }
            }
        }
        return nominas;
    }

    public Cliente obtenerCliente(String identificacion) {
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getIdentificacion().equals(identificacion)) {
                return c;
            }
        }
        return cliente;
    }

    
    public boolean eliminarCliente(Cliente c){
        return clientes.remove(c);
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
