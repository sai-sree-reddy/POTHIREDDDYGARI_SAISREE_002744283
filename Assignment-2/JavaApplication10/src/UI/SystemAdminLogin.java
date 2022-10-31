/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.MedSystem;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonur
 */
public class SystemAdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminLogin
     */
    SystemAdminLogin sa;
    public SystemAdminLogin() {
        initComponents();
        sa=new SystemAdminLogin();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SystemadminID = new javax.swing.JLabel();
        SystadminIDtxt = new javax.swing.JTextField();
        sysadminemasil = new javax.swing.JLabel();
        SysemailIdtxt = new javax.swing.JTextField();
        sysadminpwd = new javax.swing.JLabel();
        Pwdsysadtxt = new javax.swing.JPasswordField();
        sysclear = new javax.swing.JButton();
        loginbutn = new javax.swing.JButton();
        backtomainpage = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("SystemAdminLogin");

        SystemadminID.setText("ID :");

        SystadminIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystadminIDtxtActionPerformed(evt);
            }
        });

        sysadminemasil.setText("Email ID :");

        SysemailIdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SysemailIdtxtActionPerformed(evt);
            }
        });

        sysadminpwd.setText("Password :");

        sysclear.setText("Clear");
        sysclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysclearActionPerformed(evt);
            }
        });

        loginbutn.setText("Login");
        loginbutn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutnActionPerformed(evt);
            }
        });

        backtomainpage.setText("Back");
        backtomainpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtomainpageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sysadminpwd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SystemadminID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sysadminemasil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SysemailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SystadminIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pwdsysadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(backtomainpage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(loginbutn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(sysclear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SystemadminID)
                    .addComponent(SystadminIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysadminemasil)
                    .addComponent(SysemailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysadminpwd)
                    .addComponent(Pwdsysadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbutn)
                    .addComponent(sysclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(backtomainpage)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SystadminIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystadminIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SystadminIDtxtActionPerformed

    private void SysemailIdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SysemailIdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SysemailIdtxtActionPerformed

    private void sysclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysclearActionPerformed
        clearFieldsofform();        // TODO add your handling code here:
    }//GEN-LAST:event_sysclearActionPerformed

    private void loginbutnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutnActionPerformed

        String email = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String adminPreEmail = "Systemadmin@gmail.com";
        String adminPrePassword = "Sys@123Admin";
        int adminPreID= 7;
        int aid=Integer.parseInt(SystadminIDtxt.getText());
        String user = SysemailIdtxt.getText();
        String password = new String(Pwdsysadtxt.getPassword());

        if ( SystadminIDtxt.getText().isEmpty() || SysemailIdtxt.getText().isEmpty() || Pwdsysadtxt.getPassword().length == 0){
            JOptionPane.showMessageDialog(this,"Enter All Details to login");
        }else if(!SysemailIdtxt.getText().matches(email)){
            JOptionPane.showMessageDialog(this,"Enter a valid Email-ID");
        }else if(aid==adminPreID && user.equals(adminPreEmail) && password.equals(adminPrePassword)){
            JOptionPane.showMessageDialog(this, "Login Successful", "Warning", JOptionPane.ERROR_MESSAGE);
            
            SystemMainScreen sm = new SystemMainScreen();
            SystemAdminLogin sl = new SystemAdminLogin();
            sl.setVisible(false);
            sm.setVisible(true);
            //super.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter valid ID / Email or Password", "Warning", JOptionPane.ERROR_MESSAGE);
            clearFieldsofform();
        }
    }//GEN-LAST:event_loginbutnActionPerformed

    private void backtomainpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtomainpageActionPerformed
        // TODO add your handling code here:
        SystemAdminLogin al = new SystemAdminLogin();
        MainFrameForm mff = new MainFrameForm();
        mff.setVisible(true);
        al.setVisible(false);
        //super.dispose();
      
    }//GEN-LAST:event_backtomainpageActionPerformed

private void clearFieldsofform() {
        SysemailIdtxt.setText("");
        SystadminIDtxt.setText("");
        Pwdsysadtxt.setText("");
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pwdsysadtxt;
    private javax.swing.JTextField SysemailIdtxt;
    private javax.swing.JTextField SystadminIDtxt;
    private javax.swing.JLabel SystemadminID;
    private javax.swing.JButton backtomainpage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginbutn;
    private javax.swing.JLabel sysadminemasil;
    private javax.swing.JLabel sysadminpwd;
    private javax.swing.JButton sysclear;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int MAXIMIZED_BOTH) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
