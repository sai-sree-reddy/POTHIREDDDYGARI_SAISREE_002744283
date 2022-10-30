package hospitalmanagementsystem;



import Model.Encounters;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class EncounterDirectory {
    private static ArrayList<Encounters> encounterDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,int patientID,String patientName,String patientEmail,int doctorID,String doctorName,String doctorEmail,String date,String time,String reason,String vitalsigns,String Hospital){
        encounterDirectory.add(new Encounters(id,patientID,patientName,patientEmail,doctorID,doctorName,doctorEmail,date,time,reason,vitalsigns,Hospital));
        
    }
    
    public static ArrayList<Encounters> arrayReturn(){
        return encounterDirectory;
    }
    
    public static int arrayListLength(){
        return encounterDirectory.size();
    }
}
