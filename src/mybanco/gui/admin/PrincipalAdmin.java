/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */
package mybanco.gui.admin;

import java.io.File;
import javax.print.attribute.standard.Chromaticity;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mybanco.clases.Cdt;
import mybanco.clases.Cliente;
import mybanco.clases.Cuenta;
import mybanco.clases.CuentaAhorros;
import mybanco.clases.Tercero;
import mybanco.logica.HiloCargaCliente;
import mybanco.logica.Logica;

/**
 * Esta clase esa la intefaz de Clista de cocurrentes
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class PrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalAdmin
     */
    private Logica logica;

    private boolean esAdmin;

    public PrincipalAdmin(Logica logica) {
        this.logica = logica;

        initComponents();
        msjBienvenida.setText("Hola! Usuario Admin");
        esAdmin = true;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msjBienvenida = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bCrudClientes = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        msjBienvenida1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msjBienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        msjBienvenida.setText("Hola");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Cargar Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setText("Registrar CDT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bCrudClientes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        bCrudClientes.setText("Clientes");
        bCrudClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrudClientesActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton4.setText("Listados Concurrentes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        msjBienvenida1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        msjBienvenida1.setText("Informes");

        jButton5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton5.setText("Intereses Pagados Mes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton6.setText("Cliente Fiel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton7.setText("Dinero Almacenado CDTS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton8.setText("Listados Concurrentes 2");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(msjBienvenida)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCrudClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjBienvenida1)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msjBienvenida)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(bCrudClientes)
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(msjBienvenida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarClientes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registrarCDT();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bCrudClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrudClientesActionPerformed
       crudClientes();
    }//GEN-LAST:event_bCrudClientesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        listadoClientes();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        interesMes();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clienteFiel();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dineroCdts();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        listadoConcurrente2();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrudClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel msjBienvenida;
    private javax.swing.JLabel msjBienvenida1;
    // End of variables declaration//GEN-END:variables

    public Logica getLogica() {
        return logica;
    }

    public void setLogica(Logica logica) {
        this.logica = logica;
    }

    public void guardarCdt() {
        logica.persistencia().guardarCDTS(logica.getCdts());
    }

    /**
     * Metodo que permite cargar las carpetas con los clientes
     */
    private void cargarClientes() {
        JFileChooser jfC = new JFileChooser();
        FileNameExtensionFilter soloTxt = new FileNameExtensionFilter("*.txt", "txt", "text");
        jfC.setFileFilter(soloTxt);
        jfC.showOpenDialog(this);
        File abre = jfC.getSelectedFile();
        if (abre != null) {
            HiloCargaCliente leer1 = new HiloCargaCliente(abre, logica, 10);
            HiloCargaCliente leer2 = new HiloCargaCliente(abre, logica, 20);
            HiloCargaCliente leer3 = new HiloCargaCliente(abre, logica, 30);
            HiloCargaCliente leer4 = new HiloCargaCliente(abre, logica, 40);
            HiloCargaCliente leer5 = new HiloCargaCliente(abre, logica, 50);

            leer1.start();
            leer2.start();
            leer3.start();
            leer4.start();
            leer5.start();
        }
    }

    private void registrarCDT() {
        this.setVisible(false);
        new CdtsUI(this).setVisible(true);
    }

    private void listadoClientes() {
        this.setVisible(false);
        new ListaConcurrenteGUI(this).setVisible(true);
    }

    /**
     * Buscar el Cliente con mayor cantidad de cuentas creadas
     */
    private void clienteFiel() {
        Cliente fiel = null;
        int maxCuentas = 0;

        for (Cliente c : logica.getClientes()) {
            Tercero cliente = (Tercero) c;
            int cuentasAhorros = logica.cuentasAhorrosUsuario(cliente).size();
            int cuentasCorriente = logica.cuentasCorrientesUsuario(cliente).size();
            int cuentasNomina = logica.cuentasNominaUsuario(cliente).size();
            int numCuentasCliente = cuentasAhorros + cuentasCorriente + cuentasNomina;

            if (numCuentasCliente > maxCuentas) {
                maxCuentas = numCuentasCliente;
                fiel = c;
            }
        }

        if (fiel != null) {
            String msj = "El cliente con mayor numero de cuentas es " + fiel.getNombre() + " con un total de " + maxCuentas + " cuentas.";
            JOptionPane.showMessageDialog(null, msj, "Cliente Fiel", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * MEtodo que permite ingrear dinero cdts
     */
    private void dineroCdts() {
        Double dinero = 0.0;
        for (Cdt cdt : logica.getCdts()) {
            dinero += cdt.getInversion();
        }
        String msj = "El dinero almacenado en los CDTS es $" + dinero;
        JOptionPane.showMessageDialog(null, msj, "Dinero en CDTs", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Metodo que permite conocer los intereces del mes
     */
    private void interesMes() {
        double interes = 0.0;
        for (Cuenta c : logica.getCuentas()) {
            if (c instanceof CuentaAhorros) {
                if (c.getMonto() >= 0.1 && c.getMonto() <= 5000000) {
                    double valorCuentaInteres = 0.01 * c.getMonto();
                    interes = interes + valorCuentaInteres;
                } else if (c.getMonto() > 5000000 && c.getMonto() <= 20000000) {
                    double valorCuentaInteres = 0.02 * c.getMonto();
                    interes = interes + valorCuentaInteres;
                } else if (c.getMonto() > 20000000) {
                    double valorCuentaInteres = 0.03 * c.getMonto();
                    interes = interes + valorCuentaInteres;
                }
            }
        }

        String msj = "El dinero que se debe pagar por Concepto de Interes a Cuentas Ahorros es $" + interes;
        JOptionPane.showMessageDialog(null, msj, "Interes Cuentas Ahorros", JOptionPane.INFORMATION_MESSAGE);
    }

    private void crudClientes() {
        this.setVisible(false);
        new ClientesUI(this).setVisible(true);
    }

    private void listadoConcurrente2() {
        this.setVisible(false);
        new ListaConcurrenteGUI2(this).setVisible(true);
    }
}
