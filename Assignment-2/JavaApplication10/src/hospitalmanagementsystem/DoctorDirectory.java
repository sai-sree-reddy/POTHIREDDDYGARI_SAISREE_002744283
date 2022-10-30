package hospitalmanagementsystem;


import Model.Doctor;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class DoctorDirectory {
    private static ArrayList<Doctor> doctorDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,String doctorName,String doctorEmail,String doctorGender,String doctorContact,String doctorHospital,String doctorCommunity,String doctorPassword){
        doctorDirectory.add(new Doctor(id, doctorName, doctorEmail, doctorGender, doctorHospital, doctorCommunity,doctorContact, doctorPassword));
        System.out.println(doctorDirectory);
    }
    
    public static ArrayList<Doctor> arrayReturn(){
        return doctorDirectory;
    }
    
    public static int arrayListLength(){
        return doctorDirectory.size();
    }
}
