/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonur
 */
public class EmployeeHistory {
    
    private ArrayList<Person> history;
    
    public EmployeeHistory(){
        this.history=new ArrayList<Person>();
    }

    public ArrayList<Person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    
    public Person addnewemployee(){
        Person person=new Person();
        history.add(person);
        return person;
        
        
    }
     

    public void deleteemployee(Person selectedemployee) {
        history.remove(selectedemployee);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addupdatedemployee(Person employee) {
         history.add(employee);
     
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
