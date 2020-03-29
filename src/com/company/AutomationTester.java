package com.company;

public class AutomationTester extends Employee {
    boolean auto;
    String testerSkill;
    int autoExperience;

    public AutomationTester(int yearsOld, int yearsOfExperience, boolean auto, int autoExperience) {
        super(yearsOld, yearsOfExperience);
        this.auto = auto;
        this.testerSkill = testerSkill;
        this.autoExperience = autoExperience;
    }

    public AutomationTester(String name, String surname, boolean auto, String testerSkill, int autoExperience) {
        super(name, surname);
        this.auto = auto;
        this.testerSkill = testerSkill;
        this.autoExperience = autoExperience;
    }

    public void autoTesterInfo (int yearsOld, int yearsOfExperience, int autoExperience, String testerSkill) {
        int hasStartedWorkingAt = yearsOld - yearsOfExperience;
        System.out.println("I have started working when I was " + hasStartedWorkingAt + " years old.");
        System.out.println("I have been working as an automation QA tester for " + autoExperience + " years.");
        System.out.println("My area of expertise is " + testerSkill + ".");
    }

    public void autoTesterInfo (String testerSkill) {
        System.out.println("My area of expertise is " + testerSkill + ".");
    }

    @Override
    public String employeeBasicInfo(String name, String surname) {
        super.employeeBasicInfo(name, surname);
        System.out.println("I am currently working as Automation QA tester.");
        return "I am currently working as Automation QA tester.";
    }
}
