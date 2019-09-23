package com.example.complaints;

public class Complaint {
    private String Name;
    private Integer Mobile;
    private String Email;
    private String Date;
    private String Address;
    private String Complaint;

    public Complaint() {
    }

    public static boolean isValid(final String Mobile){
        return Mobile != null && Mobile.length()==10;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getMobile() {
        return Mobile;
    }

    public void setMobile(Integer mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getComplaint() {
        return Complaint;
    }

    public void setComplaint(String complaint) {
        Complaint = complaint;
    }
}
