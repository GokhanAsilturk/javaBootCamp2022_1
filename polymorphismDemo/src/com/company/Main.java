package com.company;

public class Main {

    public static void main(String[] args) {

    //EmailLogger emailLogger = new EmailLogger();
    //emailLogger.log("log mesaji");

    //extend eden klaslar ile array oluşturulabilir.
//    BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
//
//    for (BaseLogger logger:loggers){
//        logger.log("Log mesaji");
//    }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();
    }
}
