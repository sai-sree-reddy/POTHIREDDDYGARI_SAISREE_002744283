package UI;


import Model.Community;
import Model.Hospitals;
import hospitalmanagementsystem.CommunityDirectory;
import hospitalmanagementsystem.HospitalDirectory;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Sonur
 */
public class SystemHospitalScreen extends javax.swing.JFrame {
    ArrayList<Community> comdetail = CommunityDirectory.arrayReturn();
    /**
     * Creates new form SystemHospitalScreen
     */
    public SystemHospitalScreen() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        idTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
        adminIdTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
        DefaultComboBoxModel dml2 = new DefaultComboBoxModel();
        for (Community community : comdetail) {
            dml2.addElement(community.community);
        }
        CommunityComboBox.setModel(dml2);
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
        AddHospitalButton = new javax.swing.JButton();
        DeleteHospitalButton = new javax.swing.JButton();
        ViewHospitalButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();
        DeleteHospital = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        DeleteComboBox = new javax.swing.JComboBox<>();
        Delete = new javax.swing.JButton();
        DeleteText = new javax.swing.JTextField();
        ViewHospital = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayHospitalTable = new javax.swing.JTable();
        AddHospital = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        hospitalNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        CommunityComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        adminIdTextField = new javax.swing.JTextField();
        adminNameTextField = new javax.swing.JTextField();
        adminEmailTextField = new javax.swing.JTextField();
        adminPasswordField = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hdtxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        AddHospitalButton.setText("Add");
        AddHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddHospitalButtonActionPerformed(evt);
            }
        });

        DeleteHospitalButton.setText("Delete");
        DeleteHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteHospitalButtonActionPerformed(evt);
            }
        });

        ViewHospitalButton.setText("View");
        ViewHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewHospitalButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewHospitalButton)
                    .addComponent(DeleteHospitalButton)
                    .addComponent(AddHospitalButton)
                    .addComponent(jButton1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(AddHospitalButton)
                .addGap(52, 52, 52)
                .addComponent(DeleteHospitalButton)
                .addGap(60, 60, 60)
                .addComponent(ViewHospitalButton)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ParentPanel.setLayout(new java.awt.CardLayout());

        DeleteHospital.setBackground(new java.awt.Color(102, 153, 255));

        jLabel8.setText("Delete Hospital By:");

        DeleteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Email" }));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        DeleteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeleteHospitalLayout = new javax.swing.GroupLayout(DeleteHospital);
        DeleteHospital.setLayout(DeleteHospitalLayout);
        DeleteHospitalLayout.setHorizontalGroup(
            DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteHospitalLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(DeleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Delete)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        DeleteHospitalLayout.setVerticalGroup(
            DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteHospitalLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(DeleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        ParentPanel.add(DeleteHospital, "card3");

        ViewHospital.setBackground(new java.awt.Color(255, 255, 255));

        DisplayHospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Contact", "Community", "CommunityHead", "H_AdminID", "H_AdminName", "H_AdminEmail"
            }
        ));
        jScrollPane1.setViewportView(DisplayHospitalTable);

        javax.swing.GroupLayout ViewHospitalLayout = new javax.swing.GroupLayout(ViewHospital);
        ViewHospital.setLayout(ViewHospitalLayout);
        ViewHospitalLayout.setHorizontalGroup(
            ViewHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(ViewHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewHospitalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ViewHospitalLayout.setVerticalGroup(
            ViewHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
            .addGroup(ViewHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewHospitalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        ParentPanel.add(ViewHospital, "card4");

        AddHospital.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setText("Hospital_ID:");

        jLabel3.setText("Name:");

        jLabel4.setText("Email:");

        jLabel5.setText("Contact:");

        jLabel6.setText("Community:");

        jLabel7.setText("Head:");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        CommunityComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CommunityComboBoxItemStateChanged(evt);
            }
        });
        CommunityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityComboBoxActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Admin_ID:");

        jLabel10.setText("Admin_Name:");

        jLabel11.setText("Admin_Email:");

        jLabel12.setText("Password:");

        adminEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEmailTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Hospital Details");

        jLabel14.setText("Hospital Admin");

        javax.swing.GroupLayout AddHospitalLayout = new javax.swing.GroupLayout(AddHospital);
        AddHospital.setLayout(AddHospitalLayout);
        AddHospitalLayout.setHorizontalGroup(
            AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddHospitalLayout.createSequentialGroup()
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddHospitalLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddHospitalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idTextField)
                                    .addComponent(hospitalNameTextField)
                                    .addComponent(emailTextField)
                                    .addComponent(contactTextField)
                                    .addComponent(CommunityComboBox, 0, 184, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddHospitalLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(hdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminIdTextField)
                            .addComponent(adminNameTextField)
                            .addComponent(adminEmailTextField)
                            .addComponent(adminPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                    .addGroup(AddHospitalLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel13)
                        .addGap(258, 258, 258)
                        .addComponent(jLabel14))
                    .addGroup(AddHospitalLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(submitButton)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        AddHospitalLayout.setVerticalGroup(
            AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddHospitalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(adminIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(adminEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(148, 148, 148))
        );

        ParentPanel.add(AddHospital, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddHospitalButtonActionPerformed
        // TODO add your handling code here

        ParentPanel.removeAll();
        ParentPanel.add(AddHospital);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_AddHospitalButtonActionPerformed

    private void DeleteHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteHospitalButtonActionPerformed
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(DeleteHospital);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_DeleteHospitalButtonActionPerformed

    private void ViewHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewHospitalButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) DisplayHospitalTable.getModel();
        tableModel.setRowCount(0);
        ArrayList<Hospitals> hospitalDirectory = HospitalDirectory.arrayReturn();
        for(int i=0 ; i<HospitalDirectory.arrayListLength();i++){
            Object[] rowData = new Object[]{
                hospitalDirectory.get(i).id,
                hospitalDirectory.get(i).name,
                hospitalDirectory.get(i).email,
                hospitalDirectory.get(i).contact,
                hospitalDirectory.get(i).community,
                hospitalDirectory.get(i).head,
                hospitalDirectory.get(i).adminId,
                hospitalDirectory.get(i).adminName,
                hospitalDirectory.get(i).adminEmail,
                
            };
            tableModel.addRow(rowData);
        }

        ParentPanel.removeAll();
        ParentPanel.add(ViewHospital);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_ViewHospitalButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String hospitalName = hospitalNameTextField.getText();
        String hospitalEmail = emailTextField.getText();
        String hospitalContact = contactTextField.getText();
        String hospitalCommunity = CommunityComboBox.getSelectedItem().toString();
        String communityHead = hdtxt.getText();
        String adminName = adminNameTextField.getText();
        String adminEmail = adminEmailTextField.getText();
        String adminPassword = new String(adminPasswordField.getPassword());
        

        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        String phonePattern = "(0|91)?[6-9][0-9]{9}";

        String namePattern = "[a-zA-Z_ ]+";
        
        String adminNamePattern ="[a-zA-Z_ ]+";
        String adminEmailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String adminPasswordPattern = "^(?=.*[0-9])"
        + "(?=.*[a-z])(?=.*[A-Z])"
        + "(?=.*[@#$%^&+=])"
        + "(?=\\S+$).{8,20}$";
        boolean hospitalExists = false;

        for (Hospitals hospital : HospitalDirectory.arrayReturn()) {
            if (hospital.email.equals(hospitalEmail)) {
                hospitalExists = true;
            } else {
                hospitalExists = false;
            }
        }

        if (hospitalExists) {
            JOptionPane.showMessageDialog(this, "Hospital already exists", "Warning",
                JOptionPane.ERROR_MESSAGE);
        } else {
            if (hospitalName.isEmpty() || hospitalEmail.isEmpty() || hospitalContact.isEmpty() || communityHead.isEmpty() || adminName.isEmpty() || adminEmail.isEmpty() || adminPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            } else if (!hospitalName.matches(namePattern) || !communityHead.matches(namePattern)) {
                JOptionPane.showMessageDialog(this, "Enter correct details", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            } else if (!hospitalEmail.matches(emailPattern)) {
                JOptionPane.showMessageDialog(this, "Enter a Valid Email", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            } else if (!hospitalContact.matches(phonePattern)) {
                JOptionPane.showMessageDialog(this, "Enter a Valid Phone Number", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            }else if(!adminName.matches(adminNamePattern)){
                JOptionPane.showMessageDialog(this, "Enter Valid Name", "Warning",
                        JOptionPane.ERROR_MESSAGE);
            }else if(!adminEmail.matches(adminEmailPattern)){
                JOptionPane.showMessageDialog(this, "Enter Valid Admin Email", "Warnig",
                        JOptionPane.ERROR_MESSAGE);
            }else if(!adminPassword.matches(adminPasswordPattern)){
                JOptionPane.showMessageDialog(this, "Enter Valid Passowrd", "Warning",
                        JOptionPane.ERROR_MESSAGE);
            } 
            else {
                //when all conditions are false
                HospitalDirectory.addArrayListItem(HospitalDirectory.arrayListLength(), hospitalName, hospitalEmail, hospitalContact, hospitalCommunity, communityHead,HospitalDirectory.arrayListLength(), adminName, adminEmail,adminPassword);
                idTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
                adminIdTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
                hospitalNameTextField.setText("");
                emailTextField.setText("");
                contactTextField.setText("");
                hdtxt.setText("");
                adminIdTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
                adminNameTextField.setText("");
                adminEmailTextField.setText("");
                adminPasswordField.setText("");
             
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void CommunityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommunityComboBoxActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void DeleteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteTextActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String deleteby = DeleteComboBox.getSelectedItem().toString();
        String del = DeleteText.getText();
        if(del.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
       
        //check if user exists
        if (deleteby == "ID"){
              for (Hospitals hospital : HospitalDirectory.arrayReturn()){
                if(String.valueOf(hospital.id).equals(del)){
                    HospitalDirectory.arrayReturn().remove(hospital);
                    JOptionPane.showMessageDialog(this, "Hospital Deleted Successfully", "Warning",
                    JOptionPane.ERROR_MESSAGE);
                    
                    break;
                }
            }
              
        }else if(deleteby == "Email"){
            for (Hospitals hospital : HospitalDirectory.arrayReturn()){
                if(hospital.email.equals(del)){
                    HospitalDirectory.arrayReturn().remove(hospital);
                    
                    JOptionPane.showMessageDialog(this, "Hospital Deleted Successfully", "Warning",
                    JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }    
        }else{
            JOptionPane.showMessageDialog(this, "Hospital does not exists", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
        idTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
                adminIdTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
        DeleteText.setText("");
       
                                                

    }//GEN-LAST:event_DeleteActionPerformed

    private void adminEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEmailTextFieldActionPerformed

    private void CommunityComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CommunityComboBoxItemStateChanged
        // TODO add your handling code here:
        String communityData = CommunityComboBox.getSelectedItem().toString();
        for(Community comm: CommunityDirectory.arrayReturn()){
            if(comm.community.equals(communityData)){
                hdtxt.setText(comm.name);
            }
        }
    }//GEN-LAST:event_CommunityComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SystemHospitalScreen sh = new SystemHospitalScreen();
        SystemMainScreen sm = new SystemMainScreen();
        sh.setVisible(false);
        sm.setVisible(true);
        super.dispose();
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
            java.util.logging.Logger.getLogger(SystemHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemHospitalScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddHospital;
    private javax.swing.JButton AddHospitalButton;
    private javax.swing.JComboBox<String> CommunityComboBox;
    private javax.swing.JButton Delete;
    private javax.swing.JComboBox<String> DeleteComboBox;
    private javax.swing.JPanel DeleteHospital;
    private javax.swing.JButton DeleteHospitalButton;
    private javax.swing.JTextField DeleteText;
    private javax.swing.JTable DisplayHospitalTable;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JPanel ViewHospital;
    private javax.swing.JButton ViewHospitalButton;
    private javax.swing.JTextField adminEmailTextField;
    private javax.swing.JTextField adminIdTextField;
    private javax.swing.JTextField adminNameTextField;
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField hdtxt;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
