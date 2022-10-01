package com.example.testrun;

public class studentprofile {
    static String college = "GeorgianCollege";
    String firstname;
    String lastname;
    int expectedyear;
    double gpa;
    String declaredmajor;
    
    public studentprofile(String firstname, String lastname, int expectedyear, double gpa, String declareadmajor) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.expectedyear = expectedyear;
        this.gpa = gpa;
        this.declaredmajor = declareadmajor;
    }
    public int incrementExpectedGraduationYear() {
        int incrementYear = expectedyear + 1;
        return incrementYear;
    }
}
