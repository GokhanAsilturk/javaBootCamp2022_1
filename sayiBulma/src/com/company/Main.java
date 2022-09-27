package com.company;

public class Main {

    public static void main(String[] args) {


        int[] numbers = new int[]{1,2,5,7,9};
        int target = 7;
        boolean situation = false;

        for (int number : numbers){
            if(number==target){
                situation=true;
            }
        }
        if(situation){
            System.out.println("Sayi bulundu: "+target);
        }
        else {System.out.println("Sayi bulunmadi");}
    }
}
