package jframe;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import jpanels.jpCirculo;
import jpanels.jpCuadrado;
import jpanels.jpPentagono;
import jpanels.jpTriangulo;

public class jfFiguras extends javax.swing.JFrame {

    public jfFiguras() { // este método es Bob el constructor
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(jrCirculo);
        buttonGroup1.add(jrCuadrado);
        buttonGroup1.add(jrPentagono);
        buttonGroup1.add(jrTriangulo);
        this.setSize(720, 600);
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 600));
        setMinimumSize(new java.awt.Dimension(720, 600));
        setPreferredSize(new java.awt.Dimension(720, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jcboFigura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcboFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "3", "4", "5" }));
        jcboFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboFiguraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione la cant. lados");

        jrCirculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrCirculo.setText("Circulo");
        jrCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCirculoActionPerformed(evt);
            }
        });

        jrCuadrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrCuadrado.setText("Cuadrado");
        jrCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCuadradoActionPerformed(evt);
            }
        });

        jrTriangulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrTriangulo.setText("Triángulo");
        jrTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTrianguloActionPerformed(evt);
            }
        });

        jrPentagono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrPentagono.setText("Pentágono");
        jrPentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPentagonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jcboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrCirculo)
                .addGap(18, 18, 18)
                .addComponent(jrCuadrado)
                .addGap(18, 18, 18)
                .addComponent(jrTriangulo)
                .addGap(18, 18, 18)
                .addComponent(jrPentagono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jpPrincipal.setBackground(new java.awt.Color(153, 204, 255));
        jpPrincipal.setMaximumSize(new java.awt.Dimension(700, 500));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(700, 500));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/area.jpg"))); // NOI18N

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcboFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboFiguraActionPerformed
        String ladoS = jcboFigura.getSelectedItem().toString();
        int lados = Integer.parseInt(ladoS);
        switch (lados) {
            case 1:
                jpCirculo circulo = new jpCirculo();
                circulo.setSize(700, 500);
                circulo.setLocation(0, 0);
//                jpPrincipal.removeAll();
//                jpPrincipal.add(circulo, BorderLayout.CENTER);
//                jpPrincipal.revalidate();
//                jpPrincipal.repaint();
                mostrar(circulo);
                break;
            case 3:
                jpTriangulo triangulo = new jpTriangulo();
                triangulo.setSize(700, 500);
                triangulo.setLocation(0, 0);
                mostrar(triangulo);
                break;
            case 4:
                jpCuadrado cuadrado = new jpCuadrado();
                cuadrado.setSize(700, 500);
                cuadrado.setLocation(0, 0);
                mostrar(cuadrado);
                break;
            case 5:
                jpPentagono pentagono = new jpPentagono();
                pentagono.setSize(700, 500);
                pentagono.setLocation(0, 0);
                mostrar(pentagono);
                break;
        }
    }//GEN-LAST:event_jcboFiguraActionPerformed

    private void jrCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCirculoActionPerformed
        //JOptionPane.showMessageDialog(null,jrCirculo.isSelected());
        if (jrCirculo.isSelected() == true) {
            jpCirculo circulo = new jpCirculo();
            circulo.setSize(700, 500);
            circulo.setLocation(0, 0);
            mostrar(circulo);
        }
    }//GEN-LAST:event_jrCirculoActionPerformed

    private void jrCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCuadradoActionPerformed
        if (jrCuadrado.isSelected() == true) {
            jpCuadrado cuadrado = new jpCuadrado();
            cuadrado.setSize(700, 500);
            cuadrado.setLocation(0, 0);
            mostrar(cuadrado);
        }
    }//GEN-LAST:event_jrCuadradoActionPerformed

    private void jrTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTrianguloActionPerformed
        if (jrTriangulo.isSelected() == true) {
            jpTriangulo triangulo = new jpTriangulo();
            triangulo.setSize(700, 500);
            triangulo.setLocation(0, 0);
            mostrar(triangulo);
        }       
    }//GEN-LAST:event_jrTrianguloActionPerformed

    private void jrPentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPentagonoActionPerformed
        if (jrPentagono.isSelected() == true) {
            jpPentagono pentagono = new jpPentagono();
            pentagono.setSize(700, 500);
            pentagono.setLocation(0, 0);
            mostrar(pentagono);
        }
    }//GEN-LAST:event_jrPentagonoActionPerformed

    private void mostrar(Object objeto) {
        jpPrincipal.removeAll();
        jpPrincipal.add((Component) objeto, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcboFigura;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JRadioButton jrCirculo;
    private javax.swing.JRadioButton jrCuadrado;
    private javax.swing.JRadioButton jrPentagono;
    private javax.swing.JRadioButton jrTriangulo;
    // End of variables declaration//GEN-END:variables
}
