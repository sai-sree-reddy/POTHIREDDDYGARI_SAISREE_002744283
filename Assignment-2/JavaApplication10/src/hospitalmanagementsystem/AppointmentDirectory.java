package hospitalmanagementsystem;



import Model.Appointments;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class AppointmentDirectory {
    private static ArrayList<Appointments> appointmentDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,int patientID,String patientName,String patientEmail,String appointmentDoctor,String reason,String date,String time){
        appointmentDirectory.add(new Appointments(id,patientID,patientName,patientEmail,appointmentDoctor,reason,date,time));
        System.out.println(appointmentDirectory);
    }
    
    public static ArrayList<Appointments> arrayReturn(){
        return appointmentDirectory;
    }
    
    public static int arrayListLength(){
        return appointmentDirectory.size();
    }
    
}
