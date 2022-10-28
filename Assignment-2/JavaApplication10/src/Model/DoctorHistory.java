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
public class DoctorHistory {
    private ArrayList<Doctor> dctrhistry;
    
    public DoctorHistory(){
        this.dctrhistry=new ArrayList<Doctor>();
        
    }
    public ArrayList<Doctor> getHistory(){
        return dctrhistry;
    }
    public ArrayList<Doctor> setHistory(){
        return dctrhistry;
    }
    public Doctor addDoctor(){
        Doctor dctr=new Doctor();
        dctrhistry.add(dctr);
        return dctr;
    } 
    
}
