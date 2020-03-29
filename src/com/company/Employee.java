package com.company;

public class Employee {
    String name;
    String surname;
    int yearsOld;
    int yearsOfExperience;
    static final int EMPLOYEEID = 2;

    //Constructors
    public Employee (int yearsOld, int yearsOfExperience) {
        this.yearsOld = yearsOld;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Employee (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //Methods

    public int hasStartedWorkingAt (int yearsOld, int yearsOfExperience) {
        int hasStartedWorkingAt = yearsOld - yearsOfExperience;
        System.out.println("I have started working when I was " + hasStartedWorkingAt + " years old." );
        return (hasStartedWorkingAt);
    }

    public String employeeBasicInfo (String name, String surname) {
        this.yearsOld = yearsOld;
        this.yearsOfExperience = yearsOfExperience;
//       System.out.println("My name is " + name + " " + surname + " and I am " + this.yearsOld + " years old. I have " + this.yearsOfExperience + " years of experience and my employee ID is " + EMPLOYEEID);
        return "My name is" + name + surname + " and I am " + this.yearsOld + " years old. I have " + this.yearsOfExperience + " years of experience and my employee ID is " + EMPLOYEEID;
    }

}
