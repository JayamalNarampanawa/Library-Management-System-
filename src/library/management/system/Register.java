/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package library.management.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;





public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jButton4 = new javax.swing.JButton();
        regPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        adrs = new javax.swing.JTextField();
        emailReg = new javax.swing.JTextField();
        idReg = new javax.swing.JTextField();
        pwReg = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        showPassR = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        RegLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Register"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library Management System/src/back.jpg"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        regPnl.setBackground(new java.awt.Color(0, 0, 0,100));
        regPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");
        regPnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        regPnl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address ");
        regPnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        regPnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name");
        regPnl.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        regPnl.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NIC");
        regPnl.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 30));

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        regPnl.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));
        regPnl.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, -1));
        regPnl.add(adrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, -1));
        regPnl.add(emailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, -1));
        regPnl.add(idReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, -1));

        pwReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwRegActionPerformed(evt);
            }
        });
        regPnl.add(pwReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, -1));

        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        regPnl.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 100, 30));

        showPassR.setForeground(new java.awt.Color(255, 255, 255));
        showPassR.setText("Show Password");
        showPassR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRActionPerformed(evt);
            }
        });
        regPnl.add(showPassR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        getContentPane().add(regPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 290, 350));

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

        RegLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loging.jpeg"))); // NOI18N
        getContentPane().add(RegLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        setSize(new java.awt.Dimension(717, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pwRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwRegActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String f_Name, l_Name,addr, email,NIC, pass, query;
        String SUser, SUrl, Spass;
        SUrl = "jdbc:mysql://localhost/e-library";
        SUser = "root";
        Spass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            Statement st = con.createStatement();
            if("".equals(fName.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"First Name is required" , "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(lName.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Last Name is required" , "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(adrs.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Adress is required" , "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(emailReg.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Email is required" , "Error", JOptionPane.ERROR_MESSAGE);
                    }
            else if ("".equals(idReg.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Student ID is required" , "Error", JOptionPane.ERROR_MESSAGE);
                    }else if("".equals(pwReg.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Password is required" , "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        f_Name = fName.getText();
                        l_Name = lName.getText();
                        addr  = adrs.getText();
                        email = emailReg.getText();
                        NIC = idReg.getText();
                        pass = pwReg.getText();
                        System.out.println(pass);
                        
                        query = "INSERT INTO student_log(fName, lName, Adress, Email, NIC, Pass)"+
                                "VALUES('"+f_Name+"', '"+l_Name+"', '"+addr+"', '"+email+"','"+NIC+"','"+pass+"')";
                                
                        st.execute(query);       
                        fName.setText("");
                        lName.setText("");
                        adrs.setText("");
                        emailReg.setText("");
                        idReg.setText("");
                        pwReg.setText("");
                        
                        Loging lg = new Loging();
                        showMessageDialog(null, "Account Has Been Created Successfully!");
                        this.dispose();
                        lg.show();
                        
                        Loading ld1 = new Loading();
                        ld1.hide();
 
                    }
            }catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        
       
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Loging l4=new Loging();
        l4.show();
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void showPassRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassRActionPerformed
        // TODO add your handling code here:
        showPassR.addActionListener(e -> {
            if (showPassR.isSelected()) {
                pwReg.setEchoChar((char) 0); // Show password
            } else {
                pwReg.setEchoChar('•'); // Hide password
            }
        });

    }//GEN-LAST:event_showPassRActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegLable;
    private javax.swing.JTextField adrs;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField emailReg;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField idReg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lName;
    private javax.swing.JPasswordField pwReg;
    private javax.swing.JPanel regPnl;
    private javax.swing.JCheckBox showPassR;
    // End of variables declaration//GEN-END:variables
}
