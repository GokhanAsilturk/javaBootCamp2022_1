package com.company;

public class InstructorManager extends UserManager {

    public void login(User user) {
        System.out.println("(Instructor) Giris yapildi: " + user.getFirstName() + " " + user.getLastName());
    }

    public void viewProfile(Instructor instructor) {
        String accountInfo = "Name: " + instructor.getFirstName() + "\nLast name: " + instructor.getLastName() +
                "\nEmail: " + instructor.geteMail() + "\nSalary: " + instructor.getSalary() + "\nProfession: " + instructor.getProfession() +
                "\nYears of experience: " + instructor.getYearsOfExperience()+"\n";


        System.out.println("\nYour Profile: \n" + accountInfo);
    }

    public void addCourse() {
        System.out.println("Course Added Succesfully");
    }

    public void deleteCourse() {
        System.out.println("Course Deleted Succesfully");
    }

}
