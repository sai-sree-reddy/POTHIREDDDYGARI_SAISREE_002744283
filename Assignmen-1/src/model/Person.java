 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;

/**
 *
 * @author Sonureddy
 */
public class Person {
 
    private String name;
    private int employeeid;
    private int age;
    private String gender;
    private String Startdate;
    private int level;
    private String teaminfo;
    private String positiontitle;
    private double cellphonenumber;
    private String emailaddress;
    private Icon image;

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }
    

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
    private String imagepath;
    //image -->Datatype

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartdate() {
        return Startdate;
    }

    public void setStartdate(String Startdate) {
        this.Startdate = Startdate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeaminfo() {
        return teaminfo;
    }

    public void setTeaminfo(String teaminfo) {
        this.teaminfo = teaminfo;
    }

    public String getPositiontitle() {
        return positiontitle;
    }

    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle;
    }

    public double getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(double cellphonenumber) {
        this.cellphonenumber = cellphonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    
    @Override
    public String toString(){
        return name;
    }
    //image setter getter 
    
}
