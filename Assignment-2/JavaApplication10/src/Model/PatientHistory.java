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
public class PatientHistory {
    
    private ArrayList<Person> Info;
    
    public PatientHistory(){
        this.Info= new ArrayList<Person>();
    }
     public ArrayList<Person> getInfo() {
        return Info;
    }
     
         public void setPatientHistory(ArrayList<Person> Info) {
        this.Info = Info;
    }
    
    public Person addNewInfo(Person psn){
       Person newInfo = new Person();
        Info.add(newInfo);
        return newInfo;
    }
    public void deletepersoninfo(Person pn){
        Info.remove(pn);   
    }
    public void updateemployee(Person pn){
            
                Info.add(pn);

    }
}
