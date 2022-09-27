package com.company;

public class Main {

    public static void main(String[] args) {

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }


    }
}
