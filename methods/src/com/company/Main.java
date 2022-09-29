package com.company;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca(5);


    }

    public static void sayiBulmaca(int target) {
        int[] numbers = new int[]{1, 2, 5, 7, 9};
        boolean situation = false;

        for (int number : numbers) {
            if (number == target) {
                situation = true;
            }
        }
        if (situation) {
            mesajVer("Sayi bulundu: " + target);
        } else {
            mesajVer("Sayi bulunmadi : " + target);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}