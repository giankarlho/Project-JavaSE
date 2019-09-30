package frames;

public class Principal extends javax.swing.JFrame {

    public Principal() { //este es Bob el constructor
 
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmJuegos = new javax.swing.JMenu();
        jmBingo = new javax.swing.JMenuItem();
        jmTombola = new javax.swing.JMenuItem();
        jmRifa = new javax.swing.JMenuItem();
        jmJPanel = new javax.swing.JMenu();
        jmFiguras = new javax.swing.JMenuItem();
        jmTools = new javax.swing.JMenu();
        jmCalculadora = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmJuegos.setText("Juegos");

        jmBingo.setText("Bingo");
        jmBingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBingoActionPerformed(evt);
            }
        });
        jmJuegos.add(jmBingo);

        jmTombola.setText("Tómbola");
        jmJuegos.add(jmTombola);

        jmRifa.setText("Rifa");
        jmJuegos.add(jmRifa);

        jMenuBar1.add(jmJuegos);

        jmJPanel.setText("JPanel");

        jmFiguras.setText("Figuras");
        jmFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFigurasActionPerformed(evt);
            }
        });
        jmJPanel.add(jmFiguras);

        jMenuBar1.add(jmJPanel);

        jmTools.setText("Tools");

        jmCalculadora.setText("Calculadora");
        jmTools.add(jmCalculadora);

        jMenuBar1.add(jmTools);

        jmAyuda.setText("Ayuda");

        jMenuItem4.setText("Quién soy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmAyuda.add(jMenuItem4);

        jMenuBar1.add(jmAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmBingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBingoActionPerformed
        jrBingo bingo = new jrBingo();
        bingo.setVisible(true);
    }//GEN-LAST:event_jmBingoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFigurasActionPerformed
        Figuras figuras = new Figuras();
        figuras.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jmFigurasActionPerformed

   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenuItem jmBingo;
    private javax.swing.JMenuItem jmCalculadora;
    private javax.swing.JMenuItem jmFiguras;
    private javax.swing.JMenu jmJPanel;
    private javax.swing.JMenu jmJuegos;
    private javax.swing.JMenuItem jmRifa;
    private javax.swing.JMenuItem jmTombola;
    private javax.swing.JMenu jmTools;
    // End of variables declaration//GEN-END:variables
}
