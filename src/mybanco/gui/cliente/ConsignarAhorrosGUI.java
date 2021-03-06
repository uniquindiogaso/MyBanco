
/*
 * Universidad del Quindio
 * Lenguaje de Programación
 * Docente: Orlando Herrera
 * Armenia Quindio - 2018
 */

package mybanco.gui.cliente;

import javax.swing.JOptionPane;
import mybanco.clases.Cuenta;
/**
 * Esta clase permite la interfaz de consiganar un ahorro
 *
 * @author Soraya Gonzalez
 * @author Andres Betancourt
 * @version 1.0
 */
public class ConsignarAhorrosGUI extends javax.swing.JFrame {

    /**
     * Creates new form CuentaAhorrosGUI
     */
    private PrincipalUsuarioGUI p;

    public ConsignarAhorrosGUI(PrincipalUsuarioGUI p) {
        this.p = p;
        initComponents();
        initOtherComponets();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bConsignar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbCuentasAhorros = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText(".:: Consignar a Ahorros ::.");

        bCancelar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bConsignar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        bConsignar.setText("Consignar");
        bConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsignarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Numero de Cuenta");

        cbCuentasAhorros.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cbCuentasAhorros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Valor a Consignar");

        cValor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(cbCuentasAhorros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cValor))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCuentasAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bConsignar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       atras();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsignarActionPerformed
        consignar();
    }//GEN-LAST:event_bConsignarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsignarAhorrosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsignarAhorrosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsignarAhorrosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsignarAhorrosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConsignar;
    private javax.swing.JTextField cValor;
    private javax.swing.JComboBox cbCuentasAhorros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que permite crear cuanta de ahorro
     */
    private void crearCuentaAhorros() {
        String res = p.getLogica().crearCuentaAhorros(p.getTercero());
        if (res != null) {
            //mostrar mensaje aca
            System.out.println("Su Num de Cuenta de Ahorros es " + res + " Por favor no la pierda!");
            JOptionPane.showMessageDialog(p.getContentPane(), "El numero de Cuenta de ahorros es " + res + ".\nPor favor anote este numero ya que sera fundamental para realizar transacciones.");
            
            //persistiendo informacion en archivos
            p.getLogica().persistencia().guardarCuentas(p.getLogica().getCuentas());
        }
    }

    private void atras() {
        this.setVisible(false);
        p.setVisible(true);
        p.cargarTablas();
    }

    private void initOtherComponets() {
        //centrar pantalla
        setLocationRelativeTo(null);       
        //borrar contenido combobox
        cbCuentasAhorros.removeAllItems();
        for( Cuenta c : p.getLogica().cuentasAhorrosUsuario(p.getTercero())){
            cbCuentasAhorros.addItem(c);
        }
    }
/**
 * MEtodo que permite consigar en cuenta de ahorros
 */
    private void consignar() {
        if( cbCuentasAhorros.getSelectedItem() == null || cValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe diligenciar los campos para registrar la consignacion", "Cambos Vacios", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double valorConsignar = Double.valueOf(cValor.getText());
        Cuenta cuenta = (Cuenta)cbCuentasAhorros.getSelectedItem();
        
       boolean ok = p.getLogica().actualizarMontoCuentaAhorros(cuenta, valorConsignar,null);
       
       if ( ok ){
           JOptionPane.showMessageDialog(this, "Transaccion Exitosa.", "Consignacion", JOptionPane.INFORMATION_MESSAGE);
           atras();
       }else{
           JOptionPane.showMessageDialog(this, "No se logro realizar consignacion. Consulte a su Banco", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }

}
