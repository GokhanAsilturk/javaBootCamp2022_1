package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 0;
        boolean asal = true;


        if (number==1){
            System.out.println("Sayi asal degildir");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i=2;i<number;i++){

            if(number % i == 0){
                asal = false;
            }

        }
        if (asal){
        System.out.println("Sayi asaldir");
        }
        else{
            System.out.println("Sayi asal degildir");
        }
    }
}
