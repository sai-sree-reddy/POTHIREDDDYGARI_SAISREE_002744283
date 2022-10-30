package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class Encounters {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(String vitalsigns) {
        this.vitalsigns = vitalsigns;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }
    public int id;
    public int patientID;
    public String patientName;
    public String patientEmail;
    public int doctorID;
    public String doctorName;
    public String doctorEmail;
    public String date;
    public String time;
    public String reason;
    public String vitalsigns;
    public String Hospital;

    public Encounters(int id, int patientID, String patientName, String patientEmail, int doctorID, String doctorName, String doctorEmail, String date, String time, String reason, String vitalsigns,String Hospital) {
        this.id = id;
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorEmail = doctorEmail;
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.vitalsigns = vitalsigns;
        this.Hospital=Hospital;
    }
    
    
}
