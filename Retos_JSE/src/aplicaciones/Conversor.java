package aplicaciones;

import servicios.ConvService;
import java.awt.Color;
import java.math.BigInteger;

public class Conversor extends javax.swing.JFrame {

    private int baseNumero = 2;// esta es la base del numero ingrsado por teclado

    public Conversor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtABinario = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JScrollPane();
        jtACecimal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAOctal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAHexaDecimal = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        cboBase = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jtFNumConvertir = new javax.swing.JTextField();
        jbtnConvertir = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Solución "));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Binario :");
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentAdded(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 170, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Decímal : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Octal :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hexadecimal :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 100, 22);

        jtABinario.setColumns(20);
        jtABinario.setRows(5);
        jScrollPane1.setViewportView(jtABinario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 20, 520, 40);

        jtACecimal.setEditable(false);
        jtACecimal.setBackground(new java.awt.Color(203, 252, 203));
        jtACecimal.setColumns(20);
        jtACecimal.setRows(5);
        jTextField2.setViewportView(jtACecimal);

        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 70, 520, 40);

        jtAOctal.setEditable(false);
        jtAOctal.setBackground(new java.awt.Color(203, 252, 203));
        jtAOctal.setColumns(20);
        jtAOctal.setRows(5);
        jScrollPane2.setViewportView(jtAOctal);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(120, 130, 520, 40);

        jtAHexaDecimal.setEditable(false);
        jtAHexaDecimal.setBackground(new java.awt.Color(203, 252, 203));
        jtAHexaDecimal.setColumns(20);
        jtAHexaDecimal.setRows(5);
        jScrollPane3.setViewportView(jtAHexaDecimal);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(120, 180, 520, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 240));
        jPanel1.getAccessibleContext().setAccessibleName("Conversiones");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        cboBase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binario", "Decimal", "Octal", "Hexadecimal" }));
        cboBase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboBaseItemStateChanged(evt);
            }
        });
        cboBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBaseActionPerformed(evt);
            }
        });
        jPanel2.add(cboBase);
        cboBase.setBounds(540, 20, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Número a convertir :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 17, 160, 30);

        jtFNumConvertir.setBackground(new java.awt.Color(216, 241, 255));
        jtFNumConvertir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtFNumConvertirFocusGained(evt);
            }
        });
        jtFNumConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFNumConvertirActionPerformed(evt);
            }
        });
        jtFNumConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFNumConvertirKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtFNumConvertirKeyTyped(evt);
            }
        });
        jPanel2.add(jtFNumConvertir);
        jtFNumConvertir.setBounds(170, 20, 360, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 60));

        jbtnConvertir.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbtnConvertir.setText("Convertir CTRL+S");
        jbtnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 50));

        jbtnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbtnLimpiar.setText("Limpiar CTRL+Q");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 220, 50));

        jLabel6.setBackground(new java.awt.Color(0, 153, 204));
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 390));

        setSize(new java.awt.Dimension(697, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertirActionPerformed
        try {
            if (!jtFNumConvertir.getText().isEmpty()) {
                ConvService convertir = new ConvService();
                if (baseNumero == 10) {
                    convertir.convertirFormatoBiDeOcHex(new BigInteger(jtFNumConvertir.getText()), new BigInteger("2"), jtABinario);
                    convertir.convertirFormatoBiDeOcHex(new BigInteger(jtFNumConvertir.getText()), new BigInteger("8"), jtAOctal);
                    convertir.convertirFormatoBiDeOcHex(new BigInteger(jtFNumConvertir.getText()), new BigInteger("16"), jtAHexaDecimal);
                    jtACecimal.setText(jtFNumConvertir.getText());
                } else {
                    convertir.pasarNumeroLetraAentero(jtFNumConvertir.getText());
                    convertir.convertirAdecimal(new BigInteger("" + baseNumero));
                    convertir.convertirFormatoBiDeOcHex(convertir.getNumeroDecimal(), new BigInteger("2"), jtABinario);
                    convertir.convertirFormatoBiDeOcHex(convertir.getNumeroDecimal(), new BigInteger("8"), jtAOctal);
                    convertir.convertirFormatoBiDeOcHex(convertir.getNumeroDecimal(), new BigInteger("16"), jtAHexaDecimal);
                    jtACecimal.setText("" + convertir.getNumeroDecimal());
                }
            } else {

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jbtnConvertirActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jtFNumConvertir.setText(null);
        jtABinario.setText(null);
        jtACecimal.setText(null);
        jtAHexaDecimal.setText(null);
        jtAOctal.setText(null);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtFNumConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFNumConvertirKeyTyped
        char c = evt.getKeyChar();
        c = Character.toUpperCase(c); // CONVERTIR EN MAYUSCULA 

        if (cboBase.getSelectedIndex() == 0) {
            if (c != '1' && c != '0') {
                evt.consume();
            }
        } else if (cboBase.getSelectedIndex() == 1) {
            if (!Character.isDigit(c)) {
                evt.consume();
            }
        } else if (cboBase.getSelectedIndex() == 2) {
            int d = c - 48;
            System.out.println("" + d);
            System.out.println("");
            if (!Character.isDigit(c) || c > '7'/*codigo ascii*/) {
                evt.consume();
            }
        } else {
            if (!Character.isDigit(c)) {
                if (!letraAceptada(c)) {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_jtFNumConvertirKeyTyped

    private void jLabel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentAdded

    private void jtFNumConvertirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFNumConvertirFocusGained
        jtFNumConvertir.selectAll();

    }//GEN-LAST:event_jtFNumConvertirFocusGained

    private void jtFNumConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFNumConvertirActionPerformed

    }//GEN-LAST:event_jtFNumConvertirActionPerformed

    private void jtFNumConvertirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFNumConvertirKeyReleased
        jtFNumConvertir.setText(jtFNumConvertir.getText().toUpperCase()); // TODO add your handling code here:
    }//GEN-LAST:event_jtFNumConvertirKeyReleased

    private void cboBaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboBaseItemStateChanged
        if (cboBase.getSelectedIndex() == 0) {//binario
            baseNumero = 2;
            jtABinario.setBackground(new Color(152, 250, 177));
            jtACecimal.setBackground(new Color(203, 252, 203));
            jtAOctal.setBackground(new Color(203, 252, 203));
            jtAHexaDecimal.setBackground(new Color(203, 252, 203));
            jtFNumConvertir.setText(null);
        } else if (cboBase.getSelectedIndex() == 1) {//decimal
            baseNumero = 10;
            jtABinario.setBackground(new Color(203, 252, 203));
            jtACecimal.setBackground(new Color(152, 250, 177));
            jtAOctal.setBackground(new Color(203, 252, 203));
            jtAHexaDecimal.setBackground(new Color(203, 252, 203));
            jtFNumConvertir.setText(null);
        } else if (cboBase.getSelectedIndex() == 2) {// OCTAL
            baseNumero = 8;
            jtABinario.setBackground(new Color(203, 252, 203));
            jtACecimal.setBackground(new Color(203, 252, 203));
            jtAOctal.setBackground(new Color(152, 250, 177));
            jtAHexaDecimal.setBackground(new Color(203, 252, 203));
            jtFNumConvertir.setText(null);
        } else if (cboBase.getSelectedIndex() == 3) { //hexadecimal
            baseNumero = 16;
            jtABinario.setBackground(new Color(203, 252, 203));
            jtACecimal.setBackground(new Color(203, 252, 203));
            jtAOctal.setBackground(new Color(203, 252, 203));
            jtAHexaDecimal.setBackground(new Color(152, 250, 177));
            jtFNumConvertir.setText(null);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cboBaseItemStateChanged

    private void cboBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboBaseActionPerformed
    public boolean letraAceptada(char c) {
        if (c < 'A' || c > 'F') {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificarFormato(String cad) {
        if (cboBase.getSelectedIndex() == 0) {
            if (cad.matches("[0-1]+)")) {
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jTextField2;
    private javax.swing.JButton jbtnConvertir;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JTextArea jtABinario;
    private javax.swing.JTextArea jtACecimal;
    private javax.swing.JTextArea jtAHexaDecimal;
    private javax.swing.JTextArea jtAOctal;
    private javax.swing.JTextField jtFNumConvertir;
    // End of variables declaration//GEN-END:variables
}
