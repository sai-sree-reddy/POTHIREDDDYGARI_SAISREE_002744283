package UI;



import Model.Appointments;
import Model.Doctor;
import Model.Patients;
import hospitalmanagementsystem.AppointmentDirectory;
import hospitalmanagementsystem.DoctorDirectory;
import hospitalmanagementsystem.PatientDirectory;
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
public class PatientAppointmentScreen extends javax.swing.JFrame {

    ArrayList<Doctor> docdetail = DoctorDirectory.arrayReturn();
    ArrayList<Patients> patientDirectory = PatientDirectory.arrayValueReturn();

    /**
     * Creates new form PatientAppointmentScreen
     */
    public PatientAppointmentScreen() {
        initComponents();
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        for (Doctor doctor : docdetail) {
            if (PatientLoginScreen.pcom.equals(doctor.community)) {
                dml.addElement(doctor.name);
            }
        }
        int tempId = PatientLoginScreen.pID;
        DoctorComboBox.setModel(dml);
        PatientIdField.setText(String.valueOf(PatientLoginScreen.pID));
        PatientEmailField.setText(PatientLoginScreen.pEmail);
        for (Patients patient : patientDirectory) {
            if (tempId == patient.id) {
                PatientNameField.setText(patient.name);
            }
        }
        int tempappId = AppointmentDirectory.arrayListLength();
        BookingIDText.setText(String.valueOf(tempappId));
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
        BookAppointmentButton = new javax.swing.JButton();
        CancelAppointmentButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();
        CancelAppointmentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayAppointmentsTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        deleteID = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BookAppointmentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BookingIDText = new javax.swing.JTextField();
        PatientNameField = new javax.swing.JTextField();
        PatientEmailField = new javax.swing.JTextField();
        DoctorComboBox = new javax.swing.JComboBox<>();
        AppointmentReasonText = new javax.swing.JTextField();
        AppointmentTimeText = new javax.swing.JFormattedTextField();
        BookButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PatientIdField = new javax.swing.JTextField();
        AppointmentDateText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        BookAppointmentButton.setText("Book");
        BookAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAppointmentButtonActionPerformed(evt);
            }
        });

        CancelAppointmentButton.setText("Cancel Appointment");
        CancelAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAppointmentButtonActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(BookAppointmentButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(CancelAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(BookAppointmentButton)
                .addGap(65, 65, 65)
                .addComponent(CancelAppointmentButton)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ParentPanel.setLayout(new java.awt.CardLayout());

        CancelAppointmentPanel.setBackground(new java.awt.Color(204, 204, 255));

        DisplayAppointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Patient ID", "Patient Name", "Pateint Email", "Doctor Name", "Appointment For", "Booking Date", "Booking Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DisplayAppointmentsTable);

        jLabel11.setText("Booking ID:");

        deleteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIDActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CancelAppointmentPanelLayout = new javax.swing.GroupLayout(CancelAppointmentPanel);
        CancelAppointmentPanel.setLayout(CancelAppointmentPanelLayout);
        CancelAppointmentPanelLayout.setHorizontalGroup(
            CancelAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelAppointmentPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addComponent(deleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(DeleteButton)
                .addGap(114, 114, 114)
                .addComponent(jButton2)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(CancelAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
        );
        CancelAppointmentPanelLayout.setVerticalGroup(
            CancelAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelAppointmentPanelLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(CancelAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(deleteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton)
                    .addComponent(jButton2))
                .addGap(71, 71, 71))
            .addGroup(CancelAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CancelAppointmentPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        ParentPanel.add(CancelAppointmentPanel, "card3");

        BookAppointmentPanel.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Appointment Booking");

        jLabel3.setText("Booking ID:");

        jLabel4.setText("Patient Name:");

        jLabel5.setText("Patient Email:");

        jLabel6.setText("Select Doctor:");

        jLabel7.setText("Appoinment For:");

        jLabel8.setText("Date:");

        jLabel9.setText("Time:");

        BookingIDText.setEditable(false);

        PatientNameField.setEditable(false);

        PatientEmailField.setEditable(false);

        DoctorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorComboBoxActionPerformed(evt);
            }
        });

        AppointmentTimeText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        BookButton.setText("Book Appointment");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Patient ID:");

        PatientIdField.setEditable(false);
        PatientIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BookAppointmentPanelLayout = new javax.swing.GroupLayout(BookAppointmentPanel);
        BookAppointmentPanel.setLayout(BookAppointmentPanelLayout);
        BookAppointmentPanelLayout.setHorizontalGroup(
            BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2))
                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(BookButton))
                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                        .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BookAppointmentPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(BookingIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(DoctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(AppointmentReasonText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BookAppointmentPanelLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AppointmentTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AppointmentDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(62, 62, 62)
                        .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(PatientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PatientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PatientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        BookAppointmentPanelLayout.setVerticalGroup(
            BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                        .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(BookingIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(PatientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PatientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(DoctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BookAppointmentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PatientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppointmentReasonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AppointmentDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(BookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(AppointmentTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BookButton)
                .addGap(99, 99, 99))
        );

        ParentPanel.add(BookAppointmentPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAppointmentButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) DisplayAppointmentsTable.getModel();
        tableModel.setRowCount(0);
        ArrayList<Appointments> appointmentDirectory = AppointmentDirectory.arrayReturn();
        for (int i = 0; i < AppointmentDirectory.arrayListLength(); i++) {
            if(PatientLoginScreen.pEmail.equals(appointmentDirectory.get(i).patientEmail)){
            Object[] rowData = new Object[]{
                appointmentDirectory.get(i).id,
                appointmentDirectory.get(i).patientID,
                appointmentDirectory.get(i).patientName,
                appointmentDirectory.get(i).patientEmail,
                appointmentDirectory.get(i).appointmentDoctor,
                appointmentDirectory.get(i).reason,
                appointmentDirectory.get(i).date,
                appointmentDirectory.get(i).time,};
            tableModel.addRow(rowData);}
        }
        ParentPanel.removeAll();
        ParentPanel.add(CancelAppointmentPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_CancelAppointmentButtonActionPerformed

    private void BookAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAppointmentButtonActionPerformed
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(BookAppointmentPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_BookAppointmentButtonActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        int patientID = Integer.parseInt(PatientIdField.getText());
        String patientName = PatientNameField.getText();
        String patientEmail = PatientEmailField.getText();
        String appointmentDoctor = DoctorComboBox.getSelectedItem().toString();
        String reason = AppointmentReasonText.getText();
        String date = AppointmentDateText.getText();
        String time = AppointmentTimeText.getText();

        String regex_date = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";

        if (reason.isEmpty() || date.isEmpty() || time.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter All Details");
        } else if (!date.matches(regex_date)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Date");
        } else {
            int id = AppointmentDirectory.arrayListLength();

            AppointmentDirectory.addArrayListItem(id, patientID, patientName, patientEmail, appointmentDoctor, reason, date, time);
            JOptionPane.showMessageDialog(this, "Appointment Added Successfully", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            BookingIDText.setText(String.valueOf(AppointmentDirectory.arrayListLength()));
            AppointmentReasonText.setText("");
            AppointmentDateText.setText("");
            AppointmentTimeText.setText("");

        }

    }//GEN-LAST:event_BookButtonActionPerformed

    private void DoctorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DoctorComboBoxActionPerformed

    private void PatientIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientIdFieldActionPerformed

    private void deleteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteIDActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String del = deleteID.getText();
        boolean found = false;
        if (del.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (Appointments appointment : AppointmentDirectory.arrayReturn()) {
                if (String.valueOf(appointment.id).equals(del)) {
                    AppointmentDirectory.arrayReturn().remove(appointment);
                    JOptionPane.showMessageDialog(this, "Doctor Deleted Successfully", "Warning",
                            JOptionPane.ERROR_MESSAGE);
                    found = true;
                    break;
                } else {
                    found = false;
                    JOptionPane.showMessageDialog(this, "Appointment does not exists", "Warning",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (found) {
            DefaultTableModel tableModel = (DefaultTableModel) DisplayAppointmentsTable.getModel();

            for (int i = 0; i < DisplayAppointmentsTable.getRowCount(); i++) {
                if (DisplayAppointmentsTable.getValueAt(i, 0).toString().equals(del)) {
                    tableModel.removeRow(i);
                    BookingIDText.setText(String.valueOf(AppointmentDirectory.arrayListLength()));
                }
            }
        }
        deleteID.setText("");
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PatientAppointmentScreen pa = new PatientAppointmentScreen();
        PatientMainScreen pm = new PatientMainScreen();
        pa.setVisible(false);
        pm.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientAppointmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAppointmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAppointmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAppointmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAppointmentScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AppointmentDateText;
    private javax.swing.JTextField AppointmentReasonText;
    private javax.swing.JFormattedTextField AppointmentTimeText;
    private javax.swing.JButton BookAppointmentButton;
    private javax.swing.JPanel BookAppointmentPanel;
    private javax.swing.JButton BookButton;
    private javax.swing.JTextField BookingIDText;
    private javax.swing.JButton CancelAppointmentButton;
    private javax.swing.JPanel CancelAppointmentPanel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable DisplayAppointmentsTable;
    private javax.swing.JComboBox<String> DoctorComboBox;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JTextField PatientEmailField;
    private javax.swing.JTextField PatientIdField;
    private javax.swing.JTextField PatientNameField;
    private javax.swing.JTextField deleteID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    // End of variables declaration//GEN-END:variables
}
