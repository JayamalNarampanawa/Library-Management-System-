/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package library.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author ajnar
 */
public class Loging extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loging() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idLoging = new javax.swing.JTextField();
        pwLoging = new javax.swing.JPasswordField();
        btnLoging = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        regisBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("loging page");
        setForeground(java.awt.Color.white);
        setName("Loging"); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(1070, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0,0,100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        idLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idLogingActionPerformed(evt);
            }
        });
        jPanel1.add(idLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, -1));
        jPanel1.add(pwLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 170, -1));

        btnLoging.setBackground(new java.awt.Color(51, 51, 51));
        btnLoging.setForeground(new java.awt.Color(255, 255, 255));
        btnLoging.setLabel("Login");
        btnLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogingActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Don't Have an account??");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        regisBtn.setText("Register Now");
        regisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisBtnActionPerformed(evt);
            }
        });
        jPanel1.add(regisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 290, 350));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/loging.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        setSize(new java.awt.Dimension(717, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idLogingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idLogingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogingActionPerformed
        // TODO add your handling code here:
        String NIC, Passwrd, query, passDb = null;
        String SUser, SUrl, Spass;
        SUrl = "jdbc:mysql://localhost/e-library";
        SUser = "root";
        Spass = "";
        int notFound = 0;
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            Statement st = con.createStatement();
           if("".equals(idLoging.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"National Identity Card Number is required" , "Error", JOptionPane.ERROR_MESSAGE);
            
                    }else if("".equals(pwLoging.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Password is required" , "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        NIC = idLoging.getText();
                        Passwrd = pwLoging.getText();
                        
                        query = "SELECT * FROM student_log WHERE NIC ='"+NIC+"'";
                        ResultSet rs = st.executeQuery(query);
                        while(rs.next()){
                            passDb = rs.getString("Pass");
                            notFound = 1;
                        }
                        if(notFound == 1 && Passwrd.equals(passDb)){
                          Home hm = new Home();
                          hm.pack();
                          hm.setLocationRelativeTo(null);
                          showMessageDialog(null, "Welcome ");
                          hm.setVisible(true);
                          this.dispose();
                          
                          
                          
                          pwLoging.setText("");
                          showMessageDialog(null, "Login Successful!");
                        }
                        else{
                            JOptionPane.showMessageDialog(new JFrame(),"Incorrect Username or Password" , "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        
                    }
            }catch(Exception e){
            System.out.println("Error!"+e.getMessage());
            }
    }//GEN-LAST:event_btnLogingActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        // TODO add your handling code here:
        showPass.addActionListener(e -> {
            if (showPass.isSelected()) {
                pwLoging.setEchoChar((char) 0); // Show password
            } else {
                pwLoging.setEchoChar('•'); // Hide password
            }
        });
        
    }//GEN-LAST:event_showPassActionPerformed

    private void regisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisBtnActionPerformed
        // TODO add your handling code here:
        Register regi=new Register();
        regi.show();
            
        this.hide();
    }//GEN-LAST:event_regisBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoging;
    private javax.swing.JTextField idLoging;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwLoging;
    private javax.swing.JButton regisBtn;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
}
