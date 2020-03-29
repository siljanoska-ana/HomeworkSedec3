package com.company;

import com.company.Employee;

public class Main {

    public static void main(String[] args) {
        Employee anaSiljanoskaYears = new Employee(40, 15);
        Employee anaSiljanoskaName = new Employee("Ana", "Siljanoska");
        anaSiljanoskaYears.hasStartedWorkingAt(40, 15);
        System.out.println(anaSiljanoskaYears.employeeBasicInfo("Ana", "Siljanoska"));
        System.out.println("***********************************************************");
        Employee petkoPetkovskiYears = new Employee(32, 8);
        Employee petkoPetkovskiName = new Employee("Petko", "Petkovski");
        petkoPetkovskiYears.hasStartedWorkingAt(32,8);
        petkoPetkovskiYears.employeeBasicInfo("Petko", "Petkovski");
        System.out.println("************************************************************");
        AutomationTester trajkoTrajkoski = new AutomationTester(35,7,false,3);
        AutomationTester trajkoTrajkovski = new AutomationTester("Trajko", "Trajkovski", false, "API", 3);
        trajkoTrajkoski.autoTesterInfo(35,7,3,"API");
        trajkoTrajkoski.autoTesterInfo("API");
        trajkoTrajkoski.employeeBasicInfo("Trajko", "Trajkovski");

    }
}
