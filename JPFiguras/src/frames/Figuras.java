package frames;

import java.awt.BorderLayout;
import panels.Circulo;
import panels.Cuadrado;

public class Figuras extends javax.swing.JFrame {

    public Figuras() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(jrCirculo);
        buttonGroup1.add(jrCuadrado);
        buttonGroup1.add(jrPentagono);
        buttonGroup1.add(jrTriangulo);
        this.setSize(800, 800);
        jpPrincipal.setLocation(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jcboFigura = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jrCirculo = new javax.swing.JRadioButton();
        jrCuadrado = new javax.swing.JRadioButton();
        jrTriangulo = new javax.swing.JRadioButton();
        jrPentagono = new javax.swing.JRadioButton();
        jpPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 600));
        setMinimumSize(new java.awt.Dimension(720, 600));
        setPreferredSize(new java.awt.Dimension(720, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 50));

        jcboFigura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcboFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "3", "4", "5" }));
        jcboFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboFiguraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione la cant. lados");

        jrCirculo.setBackground(new java.awt.Color(255, 255, 204));
        jrCirculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrCirculo.setText("Circulo");

        jrCuadrado.setBackground(new java.awt.Color(255, 255, 204));
        jrCuadrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrCuadrado.setText("Cuadrado");

        jrTriangulo.setBackground(new java.awt.Color(255, 255, 204));
        jrTriangulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrTriangulo.setText("Triángulo");

        jrPentagono.setBackground(new java.awt.Color(255, 255, 204));
        jrPentagono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrPentagono.setText("Pentágono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrCirculo)
                .addGap(18, 18, 18)
                .addComponent(jrCuadrado)
                .addGap(18, 18, 18)
                .addComponent(jrTriangulo)
                .addGap(18, 18, 18)
                .addComponent(jrPentagono)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrCirculo)
                    .addComponent(jrCuadrado)
                    .addComponent(jrTriangulo)
                    .addComponent(jrPentagono)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jpPrincipal.setMaximumSize(new java.awt.Dimension(700, 500));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcboFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboFiguraActionPerformed
        String ladoS = jcboFigura.getSelectedItem().toString();
        int lados = Integer.parseInt(ladoS);
        switch (lados) {
            case 1:
                Circulo circulo = new Circulo();
                circulo.setSize(700, 500);
                circulo.setLocation(0, 0);
                jpPrincipal.removeAll();
                jpPrincipal.add(circulo, BorderLayout.CENTER);
                jpPrincipal.revalidate();
                jpPrincipal.repaint();
                break;
            case 4:
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.setSize(700, 500);
                cuadrado.setLocation(0, 0);
                jpPrincipal.removeAll();
                jpPrincipal.add(cuadrado, BorderLayout.CENTER);
                jpPrincipal.revalidate();
                jpPrincipal.repaint();
                break;
        }
    }//GEN-LAST:event_jcboFiguraActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcboFigura;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JRadioButton jrCirculo;
    private javax.swing.JRadioButton jrCuadrado;
    private javax.swing.JRadioButton jrPentagono;
    private javax.swing.JRadioButton jrTriangulo;
    // End of variables declaration//GEN-END:variables
}
