package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class Diagnosis {
    public int patientId;
    public String patientName;
    public String patientEmail;
    public int reportId;
    public String reportTitle;
    public String reportDescription;
    public String reportVitalSign;

    public Diagnosis(int patientId,
            String patientName,
            String patientEmail,
            int reportId,
            String reportTitle,
            String reportDescription,
            String reportVitalSign) {
        
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.reportId = reportId;
        this.reportTitle = reportTitle;
        this.reportDescription = reportDescription;
        this.reportVitalSign = reportVitalSign;
        
    }
}
