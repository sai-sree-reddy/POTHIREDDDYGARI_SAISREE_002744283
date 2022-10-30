/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Sonur
 */
public class Doctor {

    public String getDoctorname() {
        return Doctorname;
    }

    public void setDoctorname(String Doctorname) {
        this.Doctorname = Doctorname;
    }

    public int getDoctorid() {
        return Doctorid;
    }

    public void setDoctorid(int Doctorid) {
        this.Doctorid = Doctorid;
    }
    private String Doctorname;
    private int Doctorid;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    private String community;
    private String Gender;
    
    
    
}
