/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sonur
 */
public class Diagnosis {

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

   
    public int patientId;
    public String patientName;
    public String age;
    public String vitalsign;
    public String pulserate;
    public String temperature;
    public String weight;
    public String sugar;
    public int doctorid;
   

    public Diagnosis(int patientId, String patientName, String age, int doctorid, String vitalsign, String pulserate, String temperature) {
        
        this.patientId = patientId;
        this.patientName = patientName;
        this.age=age;
        this.vitalsign=vitalsign;
        this.pulserate=pulserate;
        this.temperature=temperature;
        this.weight=weight;
        this.sugar=sugar;
        this.doctorid=doctorid;
        
    }
}
