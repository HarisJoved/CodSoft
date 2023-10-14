
package codsoft.task3;

import static java.time.Clock.system;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {
    BankAccount acc;

    public Interface() {
    }
    
    
    public Interface(BankAccount acc) {
        this.acc= acc;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBalance = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        setLocationByPlatform(true);

        lblTitle.setBackground(new java.awt.Color(204, 204, 204));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setText("ATM MACHINE");

        btnBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBalance.setText("CURRENT BALANCE");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        btnDeposit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeposit.setText("DEPOSIT");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnWithdraw.setText("WITHDRAW");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnExit)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(99, 99, 99)
                .addComponent(btnBalance)
                .addGap(68, 68, 68)
                .addComponent(btnDeposit)
                .addGap(89, 89, 89)
                .addComponent(btnWithdraw)
                .addGap(64, 64, 64)
                .addComponent(btnExit)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        JOptionPane.showMessageDialog(null, "You have " +acc.getBalance()+"Rs in your Balance.");
        
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        String depAmount = javax.swing.JOptionPane.showInputDialog(" Enter Amount ");
        double x = Double.parseDouble(depAmount);
        if (acc.deposit(x)){
            JOptionPane.showMessageDialog(null, "Now your balance is "+acc.getBalance()+"Rs");
        }
        else{
        JOptionPane.showMessageDialog(null, "Invalid Amount");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        String drawAmount = javax.swing.JOptionPane.showInputDialog(" Enter Amount ");
        double y = Double.parseDouble(drawAmount);
        if (acc.withdraw(y)){
            JOptionPane.showMessageDialog(null, "Now your balance is "+acc.getBalance()+"Rs");
        }
        else{
        JOptionPane.showMessageDialog(null, "Invalid Amount");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.setVisible(false);
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
