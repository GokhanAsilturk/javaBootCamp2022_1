package com.company;

public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Musteri eklendi");
        this.logger.log("Log mesaji");
    }

}
