/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import Model.Diagnosis;
import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class DiagnosisDirectory {
    public static ArrayList<Diagnosis> reportDirectory = new ArrayList<>();
     
     
         
    public static void addArrayItem(int patientId, int doctorid,String patientName, String age, String vitalsign, String pulserate, String temperature, String weight){
        reportDirectory.add(new Diagnosis(patientId,patientName,age, doctorid,vitalsign,pulserate,temperature));
    }
    
    public static ArrayList arrayReturn(){
        return reportDirectory;
    }
    
    public static int arrayListLengthReturn(){
        return reportDirectory.size();
    }
    
}
