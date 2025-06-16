package com.va.week7;

public class Student {
    private String studentId;
    private String name;
    private String fname;
    private String lname;
    private String phone;
    private String dob;
    private String address; 

    
    public Student(String studentId, String name, String fname, String lname, String phone, String dob, String address) {
        this.studentId = studentId;
        this.name = name;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.dob = dob;
        this.address = address;
    }


    // Getters and Setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }
    public void setLname(String lname) { this.lname = lname; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}