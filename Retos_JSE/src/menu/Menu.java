package menu;

import juegos.Bingo;
import aplicaciones.Calculadora;
import aplicaciones.Conversor;
import empresarial.Simulacion;
import aplicaciones.Medida;
import empresarial.Sueldos;
import juegos.Tombola;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        calc = new javax.swing.JMenuItem();
        conv = new javax.swing.JMenuItem();
        soyu = new javax.swing.JMenuItem();
        medi = new javax.swing.JMenuItem();
        elec = new javax.swing.JMenuItem();
        bing = new javax.swing.JMenuItem();
        tomb = new javax.swing.JMenuItem();
        SALIR = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Menu.jpg"))); // NOI18N

        jMenu1.setText("RETOS");

        calc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        calc.setText("CALCULADORA");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        jMenu1.add(calc);

        conv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, 0));
        conv.setText("CONVERSOR");
        conv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convActionPerformed(evt);
            }
        });
        jMenu1.add(conv);

        soyu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, 0));
        soyu.setText("SOYUS S.A.");
        soyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyuActionPerformed(evt);
            }
        });
        jMenu1.add(soyu);

        medi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, 0));
        medi.setText("MEDIDAS");
        medi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediActionPerformed(evt);
            }
        });
        jMenu1.add(medi);

        elec.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        elec.setText("ELECCIONES");
        elec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elecActionPerformed(evt);
            }
        });
        jMenu1.add(elec);

        bing.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
        bing.setText("BINGO");
        bing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingActionPerformed(evt);
            }
        });
        jMenu1.add(bing);

        tomb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        tomb.setText("TOMBOLA");
        tomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombActionPerformed(evt);
            }
        });
        jMenu1.add(tomb);

        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jMenu1.add(SALIR);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("AYUDA");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_calcActionPerformed

    private void bingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingActionPerformed
        Bingo bingo = new Bingo();
        bingo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bingActionPerformed

    private void convActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convActionPerformed
        Conversor conversor = new Conversor();
        conversor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_convActionPerformed

    private void soyuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyuActionPerformed
        Sueldos sueldo = new Sueldos();
        sueldo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_soyuActionPerformed

    private void tombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombActionPerformed
        Tombola tombola = new Tombola();
        tombola.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_tombActionPerformed

    private void elecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elecActionPerformed
        Simulacion simulacion = new Simulacion();
        simulacion.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_elecActionPerformed

    private void mediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediActionPerformed
        Medida medida = new Medida();
        medida.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_mediActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SALIR;
    private javax.swing.JMenuItem bing;
    private javax.swing.JMenuItem calc;
    private javax.swing.JMenuItem conv;
    private javax.swing.JMenuItem elec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem medi;
    private javax.swing.JMenuItem soyu;
    private javax.swing.JMenuItem tomb;
    // End of variables declaration//GEN-END:variables
}
