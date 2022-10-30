/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class Diagnonsisinfo {
    public static ArrayList<Diagnosis> Diagnosisinfo = new ArrayList<>();
    
    public static void addArrayItem(int pId,String pName, String pEmail, int rId, String rTitle, String rDesc, String rVitalSign){
        Diagnosisinfo.add(new Diagnosis(pId,pName,pEmail,rId,rTitle,rDesc,rVitalSign));
    }
    
    public static ArrayList arrayReturn(){
        return Diagnosisinfo;
    }
    
    public static int arrayListLengthReturn(){
        return Diagnosisinfo.size();
    }
}
