package aplicaciones;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Medida extends javax.swing.JFrame {


    public Medida() {
        initComponents();        
        this.setResizable(false); //codigo para bloquear la opcion de maximizar
        setLocationRelativeTo(null);//codigo para hacer que nuestro programa aparesca en el centro.    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combomedida = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        unidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        res = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combomedida2 = new javax.swing.JComboBox<>();
        res2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo3 = new javax.swing.JComboBox<>();
        res3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEDIDAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 35));

        combomedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combomedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimetros", "Metros", "Kilometros" }));
        combomedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomedidaActionPerformed(evt);
            }
        });
        getContentPane().add(combomedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 243, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Calcula lo que sea xD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 244, 67));

        unidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadActionPerformed(evt);
            }
        });
        getContentPane().add(unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Ingrese la cantidad a convertir:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 46));

        res.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Longitud:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 103, 43));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Peso:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 40));

        combomedida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combomedida2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gramos", "Kilos", "Mg" }));
        combomedida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomedida2ActionPerformed(evt);
            }
        });
        getContentPane().add(combomedida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 243, -1));

        res2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        res2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res2ActionPerformed(evt);
            }
        });
        getContentPane().add(res2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Volumen");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 36));

        combo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litros", "Mililitros", "Kilolitros" }));
        combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo3ActionPerformed(evt);
            }
        });
        getContentPane().add(combo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 243, 30));

        res3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        res3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res3ActionPerformed(evt);
            }
        });
        getContentPane().add(res3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 220, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/medida.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 510));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combomedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomedidaActionPerformed
    double dato1, resultado;
       dato1=Double.parseDouble(unidad.getText());
       String option =(String)combomedida.getSelectedItem();
       
       if(option.equals("Centimetros")){
           resultado=dato1*100;
           res.setText(""+ resultado +" cm");
       }
       if(option.equals("Metros")){
           resultado=dato1;
           res.setText(""+resultado+" m");
       }
       if(option.equals("Kilometros")){
           resultado=dato1/1000;
           res.setText(""+resultado+" km");
       }

    }//GEN-LAST:event_combomedidaActionPerformed

    private void unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resActionPerformed

    private void res2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res2ActionPerformed

    private void combomedida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomedida2ActionPerformed
   double dato1, resultado;
       dato1=Double.parseDouble(unidad.getText());
       String option =(String)combomedida2.getSelectedItem();
       
       if(option.equals("Gramos")){
           resultado=dato1*100;
           res2.setText(""+ resultado +" gr");
       }
       if(option.equals("Kilos")){
           resultado=dato1;
           res2.setText(""+resultado+" kg");
       }
       if(option.equals("Mg")){
           resultado=dato1/1000;
           res2.setText(""+resultado+" Mg");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_combomedida2ActionPerformed

    private void res3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res3ActionPerformed

    private void combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo3ActionPerformed
   double dato1, resultado;
       dato1=Double.parseDouble(unidad.getText());
       String option =(String)combo3.getSelectedItem();
       
       if(option.equals("Mililitros")){
           resultado=dato1*100;
           res3.setText(""+ resultado +" Ml");
       }
       if(option.equals("Litros")){
           resultado=dato1;
           res3.setText(""+resultado+" L");
       }
       if(option.equals("Kilolitros")){
           resultado=dato1/1000;
           res3.setText(""+resultado+" kl");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_combo3ActionPerformed

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
            java.util.logging.Logger.getLogger(Medida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> combomedida;
    private javax.swing.JComboBox<String> combomedida2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField res;
    private javax.swing.JTextField res2;
    private javax.swing.JTextField res3;
    private javax.swing.JTextField unidad;
    // End of variables declaration//GEN-END:variables
}
