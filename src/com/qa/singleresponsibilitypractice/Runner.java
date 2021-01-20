package com.qa.singleresponsibilitypractice;

public class Runner {

    public static void main(String[] args) {

        Car tesla = new Car("black", "cybertruck", 1000);
        RacingDriver lewisHamilton = new RacingDriver();
        Mechanic bill = new Mechanic();

        lewisHamilton.setMilesDriven(50000);
        lewisHamilton.drive(tesla);
        System.out.println(tesla.getMileage());
        bill.repair(tesla);

        
        System.out.println(tesla.getMileage());

    }

}
