package com.company;

public class Main {
    static boolean worked = false;

    public static void main(String[] args) {


        LogManager logManager = new LogManager();
        logManager.logStudent("Ahmet", "Kaya", "ahmtkya46@gmail.com", "12345", 23, "High Scool", "Java&React", "C++,C#");
        logManager.logInstructor("Engin", "Demirog", "engindemirog@gmail.com", "3232", 6500, "Software", 20);


    }

    public static void StudentProcess(Student student) {
        StudentManager studentManager = new StudentManager();
        studentManager.login(student);
        studentManager.viewCourses(student);
        studentManager.startCourse(student);
        studentManager.completeCourse(student);
        System.out.println("\n\n");
    }


    public static void InstructorProcess(Instructor instructor) {
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);
        instructorManager.viewProfile(instructor);
        instructorManager.addCourse();
        instructorManager.deleteCourse();
    }
}
