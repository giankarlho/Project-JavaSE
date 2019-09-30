package panels;

public class Cuadrado extends javax.swing.JPanel {

    public Cuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLado = new javax.swing.JTextField();
        lblPerimetro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 102));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtLado.setForeground(new java.awt.Color(255, 0, 51));
        txtLado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });
        add(txtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        lblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPerimetro.setForeground(new java.awt.Color(0, 51, 255));
        lblPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(lblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Perimetro");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        lblArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 51, 255));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 80, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Area");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Lado");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuadrado.png"))); // NOI18N
        lblImagen.setAlignmentY(0.0F);
        add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        try {
            double lado = Double.parseDouble(txtLado.getText());
            lblArea.setText(String.valueOf(lado * lado));
            lblPerimetro.setText(String.valueOf(lado * 4));
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_txtLadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JTextField txtLado;
    // End of variables declaration//GEN-END:variables
}
