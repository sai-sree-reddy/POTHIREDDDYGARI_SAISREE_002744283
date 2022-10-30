/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import Model.Encounters;
import Model.Patients;
import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class PatientDirectory {
    private static ArrayList<Patients> patientDirectory = new ArrayList<>();

    public static void addItems(int id,String patientName,String patientEmail,String patientContact,String patientGender,int patientAgeC,String patientCommunity,String patientPassword){
        patientDirectory.add(new Patients(id,patientName,patientEmail,patientContact,patientGender,patientAgeC,patientCommunity,patientPassword));
        System.out.println(patientDirectory);
    }
    
    public static ArrayList<Patients> arrayValueReturn(){
        //System.out.println("Array list"+patientDirectory);
        return patientDirectory;
    }
    
    public static int arrayListLength(){
        return patientDirectory.size();
    }

    public void addPatients(Patients p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void encounterPatient(int id, Encounters enc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deletePatient(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
