package com.company;

public class Main {

    public static void main(String[] args) {

        //interfaceler de abstractlar gibi newlenemezler.
        //interface, onu implemente eden classın referansını tutabilir.
        //bir class birden fazla interface i implemente edebilir.
        //bir class, hem bir klası extend edebilir hem de birden fazla interface i implemente edebilir.
        ICustomerDal customerDal = new OracleCUstomerDal();

        CustomerManager customerManager = new CustomerManager(new OracleCUstomerDal());
        customerManager.add();


    }
}
