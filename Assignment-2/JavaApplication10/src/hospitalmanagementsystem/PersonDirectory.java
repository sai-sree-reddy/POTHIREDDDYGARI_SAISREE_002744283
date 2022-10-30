/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import Model.Person;
import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class PersonDirectory {
    private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }
    
    
    public void removePerson(Person person){
        persons.add(person);
    }


    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Person searchUser(int txtId) {

        for (Person v : persons) {
            System.out.println("person "+v.getId());
            if (v.getId() == txtId ) {
                System.out.println("person"+v.getFullName());
                return v;
            }
        }
        return null;
    }

    public void deletePerson(int id) {
        System.out.println("id "+id);
        
       for (Person p : persons) {
            
            if (p.getId() == id ) {
                persons.remove(p);
                return;
            }
        }
    }
    public static ArrayList<Person> personArrayList = new ArrayList<>();
    
    public static void addArrayItem(int id, String name, String email, String role, String community, String house, String city){
        personArrayList.add(new Person(id,name,email,role,community,house,city));
    }
    
    public static ArrayList arrayReturn(){
        return personArrayList;
    }
    
    public static int arrayLengthReturn(){
        return personArrayList.size();
    }
    
}
