/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.EmployeeHistory;
import model.Person;

/**
 *
 * @author Sonureddy
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory employeeHistory;
    Person person;
    public CreateJPanel(EmployeeHistory employeeHistory) {
        initComponents();
        this.person=person;
        this.employeeHistory=employeeHistory;
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        numemployeeid = new javax.swing.JTextField();
        numage = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        startdate = new javax.swing.JTextField();
        leveltxt = new javax.swing.JTextField();
        txtteaminfo = new javax.swing.JTextField();
        txtpositiontitle = new javax.swing.JTextField();
        numcontact = new javax.swing.JTextField();
        txtmailaddress = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        imagebtn = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel3.setText("Employee ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel7.setText("Level:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel8.setText("Team Info:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel9.setText("Position title:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel6.setText("Start date:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel10.setText("Cell Phone number");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel11.setText("Contact info");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel12.setText("Email address:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        numemployeeid.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        numemployeeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numemployeeidActionPerformed(evt);
            }
        });

        numage.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        numage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numageActionPerformed(evt);
            }
        });

        txtgender.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });

        startdate.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        startdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startdateActionPerformed(evt);
            }
        });

        leveltxt.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        leveltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leveltxtActionPerformed(evt);
            }
        });

        txtteaminfo.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtteaminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteaminfoActionPerformed(evt);
            }
        });

        txtpositiontitle.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtpositiontitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpositiontitleActionPerformed(evt);
            }
        });

        numcontact.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        numcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numcontactActionPerformed(evt);
            }
        });

        txtmailaddress.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtmailaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailaddressActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        imagebtn.setText("Upload");
        imagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(leveltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numemployeeid))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numage))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtgender))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtteaminfo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpositiontitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(7, 7, 7)
                                .addComponent(numcontact))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(7, 7, 7)
                                .addComponent(txtmailaddress)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagebtn)
                .addGap(62, 62, 62))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(numemployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(numage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(leveltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(txtpositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(numcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(txtmailaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagebtn))
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtpositiontitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpositiontitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpositiontitleActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       /*
        person.setAge(numage.getText());
        person.setCellphonenumber(numcontact.getText());
        person.setEmailaddress(txtmailaddress.getText());
        person.setEmployeeid(numemployeeid.getText());
        person.setGender(txtgender.getText());
        person.setLevel(leveltxt.getText());
        person.setName(txtName.getText());
        person.setPositiontitle(txtpositiontitle.getText());
        person.setStartdate(startdate.getText());
        person.setTeaminfo(txtteaminfo.getText());
*/
        
        String age=numage.getText();
        String  mobilenumber=numcontact.getText();
        String email=txtmailaddress.getText();
        String employid=numemployeeid.getText();
        String gender=txtgender.getText();
        String level=leveltxt.getText();
        String name=txtName.getText();
        String posittiontitle=txtpositiontitle.getText();
        //String startdate=startdate.getText()
        String teaminfo=txtteaminfo.getText();
        
        Person ppl=employeeHistory.addnewemployee();
        
        ppl.setAge(age);
        ppl.setCellphonenumber(mobilenumber);
        ppl.setEmailaddress(email);
        ppl.setEmployeeid(employid);
        ppl.setGender(gender);
        ppl.setLevel(level);
        ppl.setName(name);
        ppl.setPositiontitle(posittiontitle);
        ppl.setStartdate(name);
        ppl.setTeaminfo(teaminfo);
        
        numage.setText(" ");
        numcontact.setText("");
        txtmailaddress.setText("");
        numemployeeid.setText("");
        txtgender.setText("");
        leveltxt.setText("");
        txtName.setText("");
        txtpositiontitle.setText("");
        txtteaminfo.setText("");
        
        
        
        
        
        
        
        
        
        
        
        JOptionPane.showMessageDialog(this, "Employee Information Saved");
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtmailaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailaddressActionPerformed

    private void numageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numageActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    private void numcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numcontactActionPerformed

    private void numemployeeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numemployeeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numemployeeidActionPerformed

    private void leveltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leveltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leveltxtActionPerformed

    private void startdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startdateActionPerformed

    private void txtteaminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteaminfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteaminfoActionPerformed

    private void imagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagebtnActionPerformed
       
        //input datatype asfile
        
        // TODO add your handling code here:
    }//GEN-LAST:event_imagebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imagebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField leveltxt;
    private javax.swing.JTextField numage;
    private javax.swing.JTextField numcontact;
    private javax.swing.JTextField numemployeeid;
    private javax.swing.JButton save;
    private javax.swing.JTextField startdate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtmailaddress;
    private javax.swing.JTextField txtpositiontitle;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables
}
