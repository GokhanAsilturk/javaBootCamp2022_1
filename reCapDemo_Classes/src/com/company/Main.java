package com.company;

public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);

        dortIslem.Cikart(3,4);
        dortIslem.Carp(3,4);
        dortIslem.Bol(3,4);

    }
}
