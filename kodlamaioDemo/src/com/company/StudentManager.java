package com.company;

public class StudentManager extends UserManager {

    public void login(User user) {
        System.out.println("(Student) Giris yapildi: " + user.getFirstName() + " " + user.getLastName());
    }

    public void viewCourses(Student student) {
        System.out.println("Courses: " + student.getCourses());
    }

    public void startCourse(User user) {
        System.out.println("Course started");
    }

    public void completeCourse(User user) {
        System.out.println("Course completed!");
    }

}
