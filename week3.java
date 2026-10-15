
package week3;

import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
    System.out.println("-------------------BASIC-------------------");
    
        double score;
        
        System.out.print("Score: ");
        score = input.nextDouble();
        input.nextLine();
        
        if (score <= 2.75) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
 
    System.out.println("\n\n----------------INTERMEDIATE----------------");
    
        System.out.println("========== LOGIN ==========");

        System.out.print("Enter username: ");
        String user = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (user.equals("cein.agtrp")) {

            if (password.equals("Css@12345")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed: Incorrect username or password.");
            }

        } else {
            System.out.println("Login failed: Incorrect username or password.");
        }
    System.out.println("\n\n------------------ADVANCED------------------");
    
    System.out.print("Enter purchase amount: ");
    double amount = input.nextDouble();
    input.nextLine();
        
    double discount;
    String dtier;

    if (amount < 1000) {
    discount = 0.00;
    dtier = "No Discount";
} else if (amount < 2000) {
    discount = 0.05;
    dtier = "5% Discount";
} else if (amount < 3000) {
    discount = 0.10;
    dtier = "10% Discount";
} else {
    discount = 0.15;
    dtier = "15% Discount";
}

    double discounted = amount * discount;
    double price = amount - discounted;

    System.out.println("Discount Tier: " + dtier);
    System.out.printf("Purchase Amount: %.2f%n", amount);
    System.out.printf("Discount Amount: %.2f%n", discounted);
    System.out.printf("Final Discounted Price: %.2f%n", price);


    System.out.println("\n\n-------------------EXPERT-------=-----------");
    
        String correctuser = "cein.agtrp";
        int correctPIN = 1722;

        double balance = 67000.00;
        String tier = "";
        double dlimit = 0;
        double fee= 0;

        System.out.println("========== ATM TRANSACTION ==========");
        
        
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter 4-digit PIN: ");
        int pin = input.nextInt();

        if (username.equals(correctuser)) {

            if (pin == correctPIN) {

                System.out.println("\nLogin successful!");
                System.out.printf("Account Balance: %.2f%n", balance);

                if (balance < 5000) {
                    tier = "Bronze";
                    dlimit = 2000;
                } else if (balance < 15000) {
                    tier = "Silver";
                    dlimit = 5000;
                } else if (balance < 50000) {
                    tier = "Gold";
                    dlimit = 10000;
                } else {
                    tier = "Platinum";
                    dlimit = 25000;
                }

                System.out.println("Account Tier: " + tier);
                System.out.printf("Daily Withdrawal Limit: %.2f%n", dlimit);

                switch (tier) {
                    case "Bronze":
                        fee= 2;
                        break;
                    case "Silver":
                        fee= 1.5;
                        break;
                    case "Gold":
                        fee = 0.01;
                        break;
                    case "Platinum":
                        fee = 0.005;
                        break;
                }

                System.out.printf("Transaction Fee Rate: %.2f%%%n",
                        fee * 100);

                System.out.print("\nEnter withdrawal amount: ");
                double withdrawal = input.nextDouble();

                double fees = withdrawal * fee;
                double totalDeduction = withdrawal + fees;
                
                if (withdrawal > 0) {

                    if (totalDeduction <= balance) {

                        if (withdrawal <= dlimit) {

                            System.out.println("\n========== TRANSACTION ==========");
                            System.out.println("APPROVED");
                            System.out.printf("Withdrawal: %.2f%n", withdrawal);
                            System.out.printf("Transaction Fee: %.2f%n", fee);
                            System.out.printf("Total Deduction: %.2f%n",
                                    totalDeduction);
                            System.out.printf("Remaining Balance: %.2f%n",
                                    balance - totalDeduction);

                        } else {
                            System.out.println(
                                    "DENIED: Withdrawal exceeds your daily limit.");
                        }

                    } else {
                        System.out.println(
                                "DENIED: Insufficient balance to cover withdrawal and fee.");
                    }

                } else {
                    System.out.println(
                            "DENIED: Withdrawal amount must be greater than zero.");
                }

            } else {
                System.out.println("LOGIN DENIED: Incorrect PIN.");
            }

        } else {
            System.out.println("LOGIN DENIED: Incorrect username.");
        }
    
    input.close();
    
    }
    
}
