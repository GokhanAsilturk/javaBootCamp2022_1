package com.company;

public class UserManager {

    public void login(User user) {
        System.out.println("(Uye) Giris yapildi: " + user.getFirstName() + " " + user.getLastName());
    }

    public void register(User user) {
        System.out.println("Kayit yapildi: " + user.getFirstName() + " " + user.getLastName());
    }

    public void viewProfile(User user) {
        String accountInfo = "Ad: " + user.getFirstName() + "\nSoyad: " + user.getLastName() + "\nEmail" + user.geteMail();
        System.out.println("Profiliniz: " + accountInfo);
    }
}
