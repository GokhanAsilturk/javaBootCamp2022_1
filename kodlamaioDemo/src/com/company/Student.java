package com.company;

public class Student extends User {

    public Student() {

    }

    public Student(int age, String education, String completedCourses, String courses) {

        this.age = age;
        this.education = education;
        this.completedCourses = completedCourses;
        this.courses = courses;

    }

    private int age;
    private String education;
    private String courses;
    private String completedCourses;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(String completedCourses) {
        this.completedCourses = completedCourses;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
