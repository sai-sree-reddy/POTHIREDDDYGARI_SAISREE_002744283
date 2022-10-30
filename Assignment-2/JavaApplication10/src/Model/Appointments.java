package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class Appointments {

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

    public String getAppointmentDoctor() {
        return appointmentDoctor;
    }

    public void setAppointmentDoctor(String appointmentDoctor) {
        this.appointmentDoctor = appointmentDoctor;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
    public int id;
    public int patientID;
    public String patientName;
    public String patientEmail;
    public String appointmentDoctor;
    public String reason;
    public String date;
    public String time;

    public Appointments(int id, int patientID, String patientName, String patientEmail, String appointmentDoctor, String reason, String date, String time) {
        this.id = id;
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.appointmentDoctor = appointmentDoctor;
        this.reason = reason;
        this.date = date;
        this.time = time;
    }
    
}
