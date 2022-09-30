package com.company;

public class Instructor extends User {

    public Instructor() {

    }

    public Instructor(double salary, String profession, int yearsOfExperience) {

        this.profession = profession;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;

    }

    private double salary;
    private String profession;
    private int yearsOfExperience;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
