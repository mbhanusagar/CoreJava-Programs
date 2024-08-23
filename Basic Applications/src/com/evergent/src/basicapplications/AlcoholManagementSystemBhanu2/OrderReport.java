package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;


public class OrderReport implements ReportGeneration {
    @Override
    public void generateReport(String orderSummary, double amt) {
        System.out.println("\nOrder Summary Report");
        System.out.println("=====================");
        System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
        System.out.println(orderSummary);
        
        
    }
}

