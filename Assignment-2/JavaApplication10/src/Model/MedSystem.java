/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import hospitalmanagementsystem.PatientDirectory;
import hospitalmanagementsystem.PersonDirectory;

/**
 *
 * @author Sonur
 */
public class MedSystem {
     private PatientDirectory patientList;
    private PersonDirectory personList;
    private City city;
    
    public MedSystem(){
        personList = new PersonDirectory();
        patientList  = new PatientDirectory();
    }
    
    
    
    public void addPerson(Person p){
        personList.addPerson(p);
    }

    public void addPatient(Patients p){
        patientList.addPatients(p);
    }
    
    
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public Person searchUser(int txtId) {
        System.out.println("idid:"+txtId);
        return (Person) personList.searchUser(txtId);
    }

    public void encounterPatient(int id, Encounters enc) {
        patientList.encounterPatient(id, enc);
    }

    public void deletePerson(int id) {
        personList.deletePerson(id);
    }

    public void deletePatient(int id) {
        patientList.deletePatient(id);
    }
    
}
