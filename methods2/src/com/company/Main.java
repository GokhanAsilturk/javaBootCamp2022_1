package com.company;

public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,6,8);
        System.out.println(toplam);
    }

    public static void add(){
        System.out.println("Eklendi");
    }

    public static void delete(){
        System.out.println("silindi");
    }

    public static void update(){
        System.out.println("guncellendi");
    }

    public static int topla(int number1, int number2){
        int total = number1 +number2;
        return total;
    }

    public static int topla2(int... sayilar){
        int toplam =0;

        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }


}
