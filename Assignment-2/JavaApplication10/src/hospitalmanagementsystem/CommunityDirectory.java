/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import Model.Community;
import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class CommunityDirectory {
    private static ArrayList<Community> communityDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact, String gender, int age, String community, String city, String password,int adminId){
        communityDirectory.add(new Community(id, name,email, contact,  gender, age, community, city, password,adminId));
        System.out.println(communityDirectory);
    }
    
    public static ArrayList<Community> arrayReturn(){
        return communityDirectory;
    }
    
    public static int arrayListLength(){
        return communityDirectory.size();
    }
    
}
