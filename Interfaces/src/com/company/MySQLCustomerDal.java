package com.company;

public class MySQLCustomerDal extends OracleCUstomerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("MySQL eklendi");
    }
    //Dal = data access layer = veri tabanı operasyonları.


}
