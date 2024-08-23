package com.evergent.src.basicapplications.BankManagementSystem;

class BankRBI{
    static {
    	System.out.println("Welcome to Loan Details");
    }
    public BankRBI() {
    	System.out.println("RBI Bank Home Loan & Personal loan Interest");
    }
    public BankRBI(double p,double r) {
    	System.out.println((p*r)/100);
    }
    public static final void GetBankDetails() {
    	System.out.println("Home Loan Interest in 8.5");
    	System.out.println("Personal Loan Interest is 11%");
    }
}
