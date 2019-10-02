package panels;


public class Circulo extends javax.swing.JPanel {

   
    public Circulo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Radio");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        txtRadio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtRadio.setForeground(new java.awt.Color(255, 0, 51));
        txtRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRadio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioActionPerformed(evt);
            }
        });
        add(txtRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Area");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        lblArea.setBackground(new java.awt.Color(255, 255, 255));
        lblArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 80, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 242, 42));
        jLabel6.setText("Circunferencia");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        lblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        lblPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(lblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circulo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioActionPerformed
        double radio = Double.parseDouble(txtRadio.getText());
        lblArea.setText(String.valueOf(Math.round(Math.pow(radio,2)*Math.PI)));        
        lblPerimetro.setText(String.valueOf(radio*2*Math.PI));        
    }//GEN-LAST:event_txtRadioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
