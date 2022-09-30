package com.company;

public class User {

    public User() {

    }

    public User(String firstName, String lastName, String eMail, String password) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;

    }

    private String id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;

    public String getId() {
        return eMail.substring(0, 1) + eMail.length();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
