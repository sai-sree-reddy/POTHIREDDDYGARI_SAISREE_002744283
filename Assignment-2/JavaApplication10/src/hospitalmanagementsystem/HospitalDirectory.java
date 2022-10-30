package hospitalmanagementsystem;

import Model.Hospitals;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class HospitalDirectory {
    private static ArrayList<Hospitals> hospitalDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,String hospitalName,String hospitalEmail,String hospitalContact,String hospitalCommunity,String communityHead, int adminId, String adminName, String adminEmail,String adminPassword ){
        hospitalDirectory.add(new Hospitals(id,hospitalName,hospitalEmail,hospitalContact,hospitalCommunity,communityHead,adminId,adminName,adminEmail,adminPassword));
        System.out.println(hospitalDirectory);
    }
    
    public static ArrayList<Hospitals> arrayReturn(){
        System.out.println("Array list"+hospitalDirectory);
        return hospitalDirectory;
    }
    
    public static int arrayListLength(){
        return hospitalDirectory.size();
    }
}
    

