/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author pavel
 */
public class Login extends javax.swing.JFrame {

    private Object loggedInUser;

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        one = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(613, 485));
        setPreferredSize(new java.awt.Dimension(623, 461));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 34));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 34));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hello!!!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 130, 40));

        one.setPreferredSize(new java.awt.Dimension(80, 34));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 180, -1));

        jPasswordField1.setMinimumSize(new java.awt.Dimension(80, 34));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(80, 34));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 180, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/1_1_700x700.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(5, 5));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 
        
        
         String username = one.getText(); // assuming you have a JTextField called jTextField1 for username input
    char[] passwordChars = jPasswordField1.getPassword(); // retrieve password as a character array
    String password = new String(passwordChars); // assuming you have a JPasswordField called jPasswordField1 for password input
    
    // perform your login authentication logic here, e.g.
    if (username.equals("admin") && password.equals("password")) {
        // login successful, close the current JFrame and open the second one
        dispose(); // close the current JFrame
        new Generel_Part().setVisible(true); // create and show the second JFrame
    } else {
        // login failed, display an error message
        JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField one;
    // End of variables declaration//GEN-END:variables

    public void addLoginListener(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtnLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isUserLoggedIn() {
        if (loggedInUser != null) {
        return true;
    } else {
        return false;
    }
    }
}
