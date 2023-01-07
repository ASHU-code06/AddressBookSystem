package com.bridgelabz;


class Contacts {

    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZIP() {
        return zip;
    }

    public void setZIP(String ZIP) {
        this.zip = zip;//if parameter is same as variable that is why this,  is used here
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contacts(String firstname, String l, String addre, String c, String s, String z, String ph, String e) {
        this.firstname = firstname;
        this.lastname = l;
        this.address = addre;
        this.city = c;
        this.state = s;
        this.zip = z;
        this.phoneNumber = ph;
        this.email = e;
    }

    public String toString(){//here we are aceesing private variables
        return "First Name: "+firstname+"\nLast Name: "+lastname +"\nAddress:  "+address+"\nCity:  "+city+"\nState:  "+state+"\nZIP:  "+zip+"\nPh.no.:  "+phoneNumber+"\nEmail: "+email;
            //   \n next line
    }
}
