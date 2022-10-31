package UI;



import Model.Doctor;
import Model.Hospitals;
import hospitalmanagementsystem.CommunityDirectory;
import hospitalmanagementsystem.DoctorDirectory;
import hospitalmanagementsystem.HospitalDirectory;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*jjjjjjj*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class SystemDoctorForm extends javax.swing.JFrame {
    
   
    /**
     * Creates new form SystemDoctorScreen
     */
    public SystemDoctorForm() {
        initComponents();
        int tempId = DoctorDirectory.arrayListLength();
        doctorIDText.setText(String.valueOf(tempId));
        
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        for (Hospitals hospital : HospitalDirectory.arrayReturn()) {
            
            dml.addElement(hospital.name);
        }
      
        HospitalComboBox.setModel(dml);

    }
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoctorGenderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        AddDoctorButton = new javax.swing.JButton();
        DeleteDoctorButton = new javax.swing.JButton();
        ViewDoctorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CompletePanel = new javax.swing.JPanel();
        AddDoctor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        doctorIDText = new javax.swing.JTextField();
        doctorNameText = new javax.swing.JTextField();
        doctorEmailText = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        doctorContactText = new javax.swing.JTextField();
        HospitalComboBox = new javax.swing.JComboBox<>();
        AddNewDoctorButton = new javax.swing.JButton();
        doctorPasswordField = new javax.swing.JPasswordField();
        communityTextField = new javax.swing.JTextField();
        DeleteDoctor = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        DeleteComboBox = new javax.swing.JComboBox<>();
        deleteText = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        ViewDoctors = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayDoctorTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        AddDoctorButton.setText("Add");
        AddDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorButtonActionPerformed(evt);
            }
        });

        DeleteDoctorButton.setText("Delete");
        DeleteDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDoctorButtonActionPerformed(evt);
            }
        });

        ViewDoctorButton.setText("View");
        ViewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctors");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddDoctorButton)
                            .addComponent(DeleteDoctorButton)
                            .addComponent(ViewDoctorButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AddDoctorButton)
                .addGap(38, 38, 38)
                .addComponent(DeleteDoctorButton)
                .addGap(30, 30, 30)
                .addComponent(ViewDoctorButton)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CompletePanel.setBackground(new java.awt.Color(255, 255, 255));
        CompletePanel.setLayout(new java.awt.CardLayout());

        AddDoctor.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor Registration Form");

        jLabel3.setText("Doctor ID:");

        jLabel4.setText("Doctor Name:");

        jLabel5.setText(" Doctor Email:");

        jLabel6.setText("Gender:");

        jLabel7.setText("Contact:");

        jLabel8.setText("Hospital:");

        jLabel9.setText("Community:");

        jLabel10.setText("Password:");

        doctorIDText.setEditable(false);
        doctorIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIDTextActionPerformed(evt);
            }
        });

        doctorNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorNameTextActionPerformed(evt);
            }
        });

        DoctorGenderGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        DoctorGenderGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        HospitalComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HospitalComboBoxItemStateChanged(evt);
            }
        });
        HospitalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalComboBoxActionPerformed(evt);
            }
        });

        AddNewDoctorButton.setText("Submit");
        AddNewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewDoctorButtonActionPerformed(evt);
            }
        });

        doctorPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorPasswordFieldActionPerformed(evt);
            }
        });

        communityTextField.setEditable(false);
        communityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddDoctorLayout = new javax.swing.GroupLayout(AddDoctor);
        AddDoctor.setLayout(AddDoctorLayout);
        AddDoctorLayout.setHorizontalGroup(
            AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDoctorLayout.createSequentialGroup()
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDoctorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(AddDoctorLayout.createSequentialGroup()
                                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doctorIDText)
                                    .addComponent(doctorNameText)
                                    .addComponent(doctorEmailText)
                                    .addGroup(AddDoctorLayout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(femaleRadioButton))
                                    .addComponent(doctorContactText)
                                    .addComponent(HospitalComboBox, 0, 165, Short.MAX_VALUE)
                                    .addComponent(doctorPasswordField)
                                    .addComponent(communityTextField)))))
                    .addGroup(AddDoctorLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(AddNewDoctorButton)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        AddDoctorLayout.setVerticalGroup(
            AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(doctorIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(doctorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(doctorEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(doctorContactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(HospitalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(communityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(doctorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddNewDoctorButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        CompletePanel.add(AddDoctor, "card2");

        DeleteDoctor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Delete Doctor By:");

        DeleteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Email" }));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeleteDoctorLayout = new javax.swing.GroupLayout(DeleteDoctor);
        DeleteDoctor.setLayout(DeleteDoctorLayout);
        DeleteDoctorLayout.setHorizontalGroup(
            DeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteDoctorLayout.createSequentialGroup()
                .addGroup(DeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteDoctorLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeleteDoctorLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(DeleteButton)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        DeleteDoctorLayout.setVerticalGroup(
            DeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteDoctorLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(DeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(DeleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(DeleteButton)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        CompletePanel.add(DeleteDoctor, "card3");

        ViewDoctors.setBackground(new java.awt.Color(204, 255, 204));

        DisplayDoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Gender", "Contact", "Hospital", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DisplayDoctorTable);

        javax.swing.GroupLayout ViewDoctorsLayout = new javax.swing.GroupLayout(ViewDoctors);
        ViewDoctors.setLayout(ViewDoctorsLayout);
        ViewDoctorsLayout.setHorizontalGroup(
            ViewDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDoctorsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ViewDoctorsLayout.setVerticalGroup(
            ViewDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDoctorsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        CompletePanel.add(ViewDoctors, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CompletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorButtonActionPerformed
        // TODO add your handling code here:
        CompletePanel.removeAll();
        CompletePanel.add(AddDoctor);
        CompletePanel.repaint();
        CompletePanel.revalidate();
    }//GEN-LAST:event_AddDoctorButtonActionPerformed

    private void DeleteDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDoctorButtonActionPerformed
        // TODO add your handling code here:
        CompletePanel.removeAll();
        CompletePanel.add(DeleteDoctor);
        CompletePanel.repaint();
        CompletePanel.revalidate();
    }//GEN-LAST:event_DeleteDoctorButtonActionPerformed

    private void ViewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDoctorButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) DisplayDoctorTable.getModel();
        tableModel.setRowCount(0);
        ArrayList<Doctor> doctorinfo = DoctorDirectory.arrayReturn();
        for(int i=0 ; i<DoctorDirectory.arrayListLength();i++){
            Object[] rowData = new Object[]{
                doctorinfo.get(i).id,
                doctorinfo.get(i).name,
                doctorinfo.get(i).email,
                doctorinfo.get(i).gender,
                doctorinfo.get(i).contact,
                doctorinfo.get(i).hospital,
                doctorinfo.get(i).community,    
            };
            tableModel.addRow(rowData);
        }
        
        CompletePanel.removeAll();
        CompletePanel.add(ViewDoctors);
        CompletePanel.repaint();
        CompletePanel.revalidate();
    }//GEN-LAST:event_ViewDoctorButtonActionPerformed

    private void doctorIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIDTextActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void doctorNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorNameTextActionPerformed

    private void AddNewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewDoctorButtonActionPerformed
        // TODO add your handling code here:
        String doctorName = doctorNameText.getText();
        String doctorEmail = doctorEmailText.getText();
        String doctorContact = doctorContactText.getText();
        String doctorCommunity = communityTextField.getText();
        String doctorHospital = HospitalComboBox.getSelectedItem().toString();
        String doctorPassword = new String(doctorPasswordField.getPassword());
        String doctorGender = maleRadioButton.isSelected() ? (doctorGender = "Male") : (doctorGender = "Female");

        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        String phonePattern = "(0|91)?[6-9][0-9]{9}";

        String namePattern = "[a-zA-Z_ ]+";

        String passwordPattern = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        boolean doctorExists = false;
        //check if user exists
        for (Doctor doctor : DoctorDirectory.arrayReturn()){
            if(doctor.email.equals(doctorEmail)){
                doctorExists = true;
            }else{
                doctorExists = false;
            }
        }

        if(doctorExists){
            JOptionPane.showMessageDialog(this, "User already exists", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            if (doctorName.isEmpty() || doctorEmail.isEmpty() || doctorContact.isEmpty() || doctorHospital.isEmpty() || doctorCommunity.isEmpty() || doctorPassword.isEmpty() ||doctorGender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!doctorName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Enter correct details", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!doctorEmail.matches(emailPattern)) {
            JOptionPane.showMessageDialog(this, "Enter a Valid Email", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!doctorContact.matches(phonePattern)) {
            JOptionPane.showMessageDialog(this, "Enter a Valid Phone Number", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!doctorPassword.matches(passwordPattern)) {
            JOptionPane.showMessageDialog(this, "Password should contain atleast 1 special character and number", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int id = DoctorDirectory.arrayListLength();
            
            DoctorDirectory.addArrayListItem(id, doctorName, doctorEmail, doctorGender, doctorContact, doctorHospital, doctorCommunity, doctorPassword);
            JOptionPane.showMessageDialog(this, "Doctor Added Successfully", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            doctorIDText.setText(String.valueOf(DoctorDirectory.arrayListLength()));
            doctorNameText.setText("");
            doctorEmailText.setText("");
            doctorContactText.setText("");
            doctorPasswordField.setText("");
    
        }
        }
        

    }//GEN-LAST:event_AddNewDoctorButtonActionPerformed

    private void doctorPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorPasswordFieldActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String deleteby = DeleteComboBox.getSelectedItem().toString();
        String del = deleteText.getText();
        if(del.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
       
        //check if user exists
        if (deleteby == "ID"){
              for (Doctor doctor : DoctorDirectory.arrayReturn()){
                if(String.valueOf(doctor.id).equals(del)){
                    DoctorDirectory.arrayReturn().remove(doctor);
                    JOptionPane.showMessageDialog(this, "Doctor Deleted Successfully", "Warning",
                    JOptionPane.ERROR_MESSAGE);
                    doctorIDText.setText(String.valueOf(DoctorDirectory.arrayListLength()));
                    break;
                }
            }
        }else if(deleteby == "Email"){
            for (Doctor doctor : DoctorDirectory.arrayReturn()){
                if(doctor.email.equals(del)){
                    DoctorDirectory.arrayReturn().remove(doctor);
                    JOptionPane.showMessageDialog(this, "Doctor Deleted Successfully", "Warning",
                    JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }    
        }else{
            JOptionPane.showMessageDialog(this, "Doctor does not exists", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
        deleteText.setText("");
       
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SystemDoctorForm sd = new SystemDoctorForm();
        SystemMainScreen sm = new SystemMainScreen();
        sd.setVisible(false);
        sm.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HospitalComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HospitalComboBoxItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HospitalComboBoxItemStateChanged

    private void communityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityTextFieldActionPerformed

    private void HospitalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalComboBoxActionPerformed
        // TODO add your handling code here:
        String hospitalSelected = HospitalComboBox.getSelectedItem().toString();
        communityTextField.setText("");
        for(Hospitals hospital: HospitalDirectory.arrayReturn()){
            if(hospitalSelected.equals(hospital.name)){
                communityTextField.setText(hospital.community);
            }
            
        }
        
    }//GEN-LAST:event_HospitalComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SystemDoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemDoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemDoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemDoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemDoctorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDoctor;
    private javax.swing.JButton AddDoctorButton;
    private javax.swing.JButton AddNewDoctorButton;
    private javax.swing.JPanel CompletePanel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> DeleteComboBox;
    private javax.swing.JPanel DeleteDoctor;
    private javax.swing.JButton DeleteDoctorButton;
    private javax.swing.JTable DisplayDoctorTable;
    private javax.swing.ButtonGroup DoctorGenderGroup;
    private javax.swing.JComboBox<String> HospitalComboBox;
    private javax.swing.JButton ViewDoctorButton;
    private javax.swing.JPanel ViewDoctors;
    private javax.swing.JTextField communityTextField;
    private javax.swing.JTextField deleteText;
    private javax.swing.JTextField doctorContactText;
    private javax.swing.JTextField doctorEmailText;
    private javax.swing.JTextField doctorIDText;
    private javax.swing.JTextField doctorNameText;
    private javax.swing.JPasswordField doctorPasswordField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JRadioButton maleRadioButton;
    // End of variables declaration//GEN-END:variables
}
