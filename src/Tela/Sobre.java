/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

/**
 *
 * @author Henrick
 */
public class Sobre extends javax.swing.JFrame {

    /**
     * Creates new form Sobre
     */
    public Sobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        lblfutstore = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 80, 30));

        lblEndereco.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblEndereco.setText("Endereço :");
        getContentPane().add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 570, 30));

        lblfutstore.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblfutstore.setText("FutStore é a loja de materiais esportivos em Varejo desde 2018.");
        getContentPane().add(lblfutstore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 440, 30));

        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblEmail.setText("Futstore@gmail.com");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 570, 30));

        lblRua.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblRua.setText("Rua Ana Targino N:05 - Caaporã - PB;");
        getContentPane().add(lblRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 570, 30));

        lblCep.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblCep.setText("Cep : 58326-000");
        getContentPane().add(lblCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 570, 30));

        lblTelefone.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblTelefone.setText("Telefone : (83) 3286-2347");
        getContentPane().add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 570, 30));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.jpg"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 590, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblfutstore;
    // End of variables declaration//GEN-END:variables
}