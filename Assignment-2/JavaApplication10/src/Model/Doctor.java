package Model;




public class Doctor {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int id;
    public String name;
    public String email;
    public String gender;
    public String hospital;
    public String community;
    public String contact; 
    public String password;
    public Doctor(int id, String name, String email,String gender,String hospital,String community,String contact, String password) {
        this.id = id;
        this.name=name;
        this.email=email;
        this.gender=gender;
        this.hospital=hospital;
        this.community=community;
        this.contact=contact;
        this.password=password;
    }
    
    
    
}
