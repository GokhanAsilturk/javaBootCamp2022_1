package com.company;

public class MySQLCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("MySQL eklendi");
    }
    //Dal = data access layer = veri tabanı operasyonları.


}
