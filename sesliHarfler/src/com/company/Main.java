package com.company;

public class Main {

    public static void main(String[] args) {

        char harf = 'ö';

        char[] inceSesli = {'e', 'i', 'ö', 'ü'};
        char[] kalinSesli = {'a', 'o', 'u', 'ı'};

        for (char inceTestHarfi : inceSesli) {
            if (harf == inceTestHarfi) {
                System.out.println("ince sesli");
            }
        }
        for (char kalinTestHarfi : kalinSesli) {
            if (kalinTestHarfi == harf) {
                System.out.println("kalin sesli");
            }
        }

    }
}
