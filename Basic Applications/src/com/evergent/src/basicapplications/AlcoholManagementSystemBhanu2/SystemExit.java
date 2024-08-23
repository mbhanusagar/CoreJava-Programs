package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

public class SystemExit implements ExitSystem {
    @Override
    public void exit() {
        System.out.println("Exiting the system. Thank you for using Alcohol Ordering System!");
        System.exit(0);
    }
}
