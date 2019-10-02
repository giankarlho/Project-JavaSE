/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import servicio.Servicios;

/**
 *
 * @author Admin
 */
public class jpCuadrado extends javax.swing.JPanel {

    public jpCuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblPerímetro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Área");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Perimetro");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        lblArea.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 30));

        lblPerímetro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPerímetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerímetro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 2, true));
        add(lblPerímetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Lado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        txtLado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtLado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtLadoCaretUpdate(evt);
            }
        });
        add(txtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 100, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cuadrado.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtLadoCaretUpdate
        try {
            if (txtLado.getText().equals("")) {
                lblArea.setText("");
                lblPerímetro.setText("");
            } else {
                double lado = Double.parseDouble(txtLado.getText());                
                lblArea.setText(Servicios.redondear(lado*lado));
                lblPerímetro.setText(Servicios.redondear(lado * 4));
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_txtLadoCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPerímetro;
    private javax.swing.JTextField txtLado;
    // End of variables declaration//GEN-END:variables
}
