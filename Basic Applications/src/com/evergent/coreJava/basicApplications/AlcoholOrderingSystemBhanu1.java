package com.evergent.coreJava.basicApplications;
import java.io.*;
import java.util.Scanner;

import java.util.Scanner;

public class AlcoholOrderingSystemBhanu1 {

    enum Module { O, P, R, E } // Main Menu Options (Order, Payment, Report, Exit)
    enum BeerBrand { KINGFISHER, CARLSBERG,BUDWAISER } // Beer brand options
    enum WineType { RED, WHITE } // Wine type options
    enum LiquorType { WHISKY, VODKA, RUM } // Liquor type options
    enum PaymentMethod { CASH, CARD } // Payment methods

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String module;
        String itemname="";
        String itemname1="";
        String itemname3="";
        int itemPrice = 0;
        int quantity = 0;
        int amount = 0;
        int discount = 0;
        String currentOrderSummary = "";

        System.out.println("\n\t\t\tWelcome to My Liquormart ");

        while (true) {
            System.out.println("\n=====================");
            System.out.println(" Main Menu");
            System.out.println("=====================");
            System.out.println("O - Order Alcohol");
            System.out.println("P - Payment");
            System.out.println("R - Reports");
            System.out.println("E - Exit System");
            System.out.println("=====================");
            System.out.println("Enter your choice (O - Order Alcohol, P - Make Payment,R - View Order Summary, Exit System): ");

            module = scanner.nextLine().toUpperCase();

            switch (Module.valueOf(module)) {
                case O:
                    System.out.println("\nOrder Alcohol");
                    System.out.println("=====================");
                    System.out.println("1 - Beer");
                    System.out.println("2 - Wine");
                    System.out.println("3 - Liquor");
                    System.out.println("=====================");
                    System.out.println("Enter your choice (1, 2, 3): ");

                    int orderChoice = Integer.parseInt(scanner.nextLine());

                    switch (orderChoice) {
                        case 1: // Beer
                            System.out.println("\nSelect Beer Brand");
                            System.out.println("=====================");
                            System.out.println("1 - Kingfisher");
                            System.out.println("2 - Carlsberg");
                            System.out.println("3 - Budwiser");
                            System.out.println("=====================");
                            System.out.println("Enter your choice (1 - Kingfisher, 2 - Carlsberg, 3 - Budwiser): ");

                            int orderChoice1 = Integer.parseInt(scanner.nextLine());
                            switch (orderChoice1) {
                                case 1:
                                    itemPrice = 100;
                                    itemname="Kingfisher";
                                    break;
                                case 2:
                                    itemPrice = 120;
                                    itemname="carlsberg";
                                    break;
                                case 3:
                                    itemPrice = 150;
                                    itemname="Budwiser";
                                    break;
                            }

                            System.out.print("Enter quantity: ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            amount = itemPrice * quantity;
                            System.out.println("Your iteam "+itemname);
                            System.out.println("Your toatal amount :"+amount);
                            break;

                        case 2: // Wine
                            System.out.println("\nSelect Wine Type");
                            System.out.println("=====================");
                            System.out.println("1 - Red Wine");
                            System.out.println("2 - White Wine"); 
                            System.out.println("=====================");
                            System.out.println("Enter your choice (R, W): ");

                            int orderChoice2 = Integer.parseInt(scanner.nextLine());
                            switch (orderChoice2) {
                                case 1:
                                    itemPrice = 200;
                                    itemname3="Red wine ";
                                    break;
                                case 2:
                                    itemPrice = 220;
                                    itemname3="white wine";
                                    break;
                            }

                            System.out.println("Enter quantity (bottles): ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            amount = itemPrice * quantity;
                            System.out.println("Your iteam "+itemname3);
                            System.out.println("Amount for "+quantity+" bottels is "+amount);
                            break;

                        case 3: // Liquor
                            System.out.println("\nSelect Liquor Type");
                            System.out.println("=====================");
                            System.out.println("1 - Whisky");
                            System.out.println("2 - Vodka");
                            System.out.println("3 - Rum");
                            System.out.println("=====================");
                            System.out.println("Enter your choice (1, 2, 3): ");

                            int orderChoice3 = Integer.parseInt(scanner.nextLine());
                            switch (orderChoice3) {
                                case 1:
                                    itemPrice = 500;
                                    itemname1="Whiskey";
                                    break;
                                case 2:
                                    itemPrice = 450;
                                    itemname1="Vodka";
                                    break;
                                case 3:
                                    itemPrice = 400;
                                    itemname1="Rum";
                                    break;
                            }

                            System.out.println("Enter quantity (bottles): ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            amount = itemPrice * quantity;
                            System.out.println("Your iteam "+itemname1);
                            System.out.println("Amount for "+quantity+" bottels is "+amount);
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    }

                    // Apply discount if applicable
                    if (quantity >= 10) {
                        discount = 100; // Discount for ordering 5 or more items
                    } else {
                        discount = 0;
                    }

                    // Update order summary
                    String orderType = (orderChoice == 1) ? "Beer" : (orderChoice == 2) ? "Wine" : "Liquor";
                    currentOrderSummary += orderType + ": " + quantity + " x " + itemPrice + " = " + amount + "\n";
                    currentOrderSummary += "Discount: " + discount + "\n";
                    amount -= discount;

                    break;

                case P:
                    System.out.println("\nMake Payment");
                    System.out.println("=====================");
                    System.out.println("1 - Cash");
                    System.out.println("2 - Card");
                    System.out.println("=====================");
                    System.out.println("Enter your choice (1, 2): ");

                    int paymentChoice = Integer.parseInt(scanner.nextLine());
                    PaymentMethod paymentMethod = (paymentChoice == 1) ? PaymentMethod.CASH : PaymentMethod.CARD;

                    System.out.println("Payment Method : " + paymentMethod);
                    System.out.println("Dicount applied :"+discount);
                    System.out.println("Amount to be paid : " + amount);
                    break;

                case R:
                    System.out.println("\nOrder Summary");
                    System.out.println("=====================");
                    System.out.println(currentOrderSummary);
                    System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
                    System.out.println("Dicount applied :"+discount);
                    System.out.println("Total Amount: " + amount);
                    System.out.println("=====================");
                    break;

                case E:
                    System.out.println("Exiting the system. Thank you for using Alcohol Ordering System!");
                    scanner.close();
                    System.exit(0);
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice. Please enter O, P, R, or E.");
            }
        }
    }
}