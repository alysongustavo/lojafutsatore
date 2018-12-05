/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import DAO.ProdutosDAO;
import Modelos.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrick
 */
public class Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
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

        lblcod = new javax.swing.JLabel();
        lblproduto = new javax.swing.JLabel();
        lblprecodevenda = new javax.swing.JLabel();
        lblquantidade = new javax.swing.JLabel();
        lblprecodecompra = new javax.swing.JLabel();
        lblfornecedor = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtproduto = new javax.swing.JTextField();
        txtfornecedor = new javax.swing.JTextField();
        txtprecodevenda = new javax.swing.JTextField();
        txtprecodecompra = new javax.swing.JTextField();
        txtquantidade = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btncadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcod.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblcod.setText("Cod");
        getContentPane().add(lblcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, 30));

        lblproduto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblproduto.setText("Produto :");
        getContentPane().add(lblproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));

        lblprecodevenda.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblprecodevenda.setText("Preço de Venda :");
        getContentPane().add(lblprecodevenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

        lblquantidade.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblquantidade.setText("Quantidade :");
        getContentPane().add(lblquantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 30));

        lblprecodecompra.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblprecodecompra.setText("Preço de Compra : ");
        getContentPane().add(lblprecodecompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 30));

        lblfornecedor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblfornecedor.setText("Fornecedor :");
        getContentPane().add(lblfornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 158, -1, 30));

        txtcod.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 30));

        txtproduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, 30));

        txtfornecedor.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtfornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 140, 30));

        txtprecodevenda.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtprecodevenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 60, 30));

        txtprecodecompra.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtprecodecompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 90, -1));

        txtquantidade.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtquantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 50, -1));

        btnsair.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 90, -1));

        btnlimpar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, -1));

        btncadastrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        // TODO add your handling code here:
        txtcod.setText("");
txtproduto.setText("");
txtfornecedor.setText("");
txtprecodevenda.setText("");
txtprecodecompra.setText("");
txtquantidade.setText("");
        
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // TODO add your handling code here:
        
        
           
        Produto produto = new Produto();
produto.setCod(txtcod.getText());
produto.setProduto(txtproduto.getText());
produto.setFornecedor(txtfornecedor.getText());
produto.setPrecodevenda(Float.parseFloat(txtprecodevenda.getText()));
produto.setPrecodecompra(Float.parseFloat(txtprecodecompra.getText()));
produto.setQuantidade(Integer.parseInt(txtquantidade.getText()));    
        
        


if ((txtcod.getText().isEmpty()) || (txtproduto.getText().isEmpty()) || (txtfornecedor.getText().isEmpty()) || (txtprecodevenda.getText().isEmpty())|| (txtprecodecompra.getText().isEmpty()) || (txtquantidade.getText().isEmpty())) {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    
    ProdutosDAO dao = new ProdutosDAO();
    dao.adiciona(produto);
    JOptionPane.showMessageDialog(null, " produto "+txtproduto.getText()+" inserido com sucesso! ");
}


txtcod.setText("");
txtproduto.setText("");
txtfornecedor.setText("");
txtprecodevenda.setText("");
txtprecodecompra.setText("");
txtquantidade.setText("");
        
        
    }//GEN-LAST:event_btncadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcod;
    private javax.swing.JLabel lblfornecedor;
    private javax.swing.JLabel lblprecodecompra;
    private javax.swing.JLabel lblprecodevenda;
    private javax.swing.JLabel lblproduto;
    private javax.swing.JLabel lblquantidade;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtfornecedor;
    private javax.swing.JTextField txtprecodecompra;
    private javax.swing.JTextField txtprecodevenda;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JTextField txtquantidade;
    // End of variables declaration//GEN-END:variables
}