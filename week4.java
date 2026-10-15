package week4;

import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-------------------BASIC-------------------");

        for (int number = 1; number <= 20; number++) {
            int square = number * number;

            System.out.println("Number: " + number
                    + " | Square: " + square);
        }


        System.out.println("\n\n----------------INTERMEDIATE----------------");

        int number;
        int total = 0;

        System.out.print("Enter an integer (-1 to stop): ");
        number = input.nextInt();

        while (number != -1) {
            total += number;

            System.out.print("Enter an integer (-1 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Final Total: " + total);

        System.out.println("\n\n------------------ADVANCED------------------");

        int size = 5;

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {

                if (col <= size - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }


        System.out.println("\n\n-------------------EXPERT-------------------");

        int[][] warehouse = {
            {17, 5, -1, 3},
            {2, 0, 8, 7},
            {19, 22, 1, 21}
        };

        int choice;

        do {
            System.out.println("\n===== WAREHOUSE INVENTORY SCANNER =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Critically Low Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");

            choice = readInteger(input, "\nChoose an option: ");

            switch (choice) {

                case 1:
                    System.out.println("\n--- WAREHOUSE SHELVES ---");

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                System.out.print("[DAMAGED]\t");
                            } else {
                                System.out.print(
                                    warehouse[row][col] + "\t\t"
                                );
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int inventoryTotal = 0;


                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                continue;
                            }

                            inventoryTotal += warehouse[row][col];
                        }
                    }

                    System.out.println(
                        "Total Inventory: " + inventoryTotal + " items"
                    );
                    break;

                case 3:
                    boolean found = false;


                    search:
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] != -1
                                    && warehouse[row][col] < 3) {

                                System.out.println(
                                    "Critically low shelf found at Row "
                                    + (row + 1) + ", Column " + (col + 1)
                                    + " with " + warehouse[row][col]
                                    + " items."
                                );

                                found = true;
                                break search;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println(
                            "No critically low shelves found."
                        );
                    }
                    break;

                case 4:
                    System.out.println("\n--- RESTOCK SHELF ---");

                    int shelfRow = readInteger(
                        input, "Enter row (1-3): "
                    );
                    int shelfCol = readInteger(
                        input, "Enter column (1-4): "
                    );

                    if (shelfRow < 1 || shelfRow > warehouse.length
                            || shelfCol < 1
                            || shelfCol > warehouse[0].length) {

                        System.out.println("Invalid shelf position.");

                    } else if (
                        warehouse[shelfRow - 1][shelfCol - 1] == -1
                    ) {

                        System.out.println(
                            "Cannot restock a damaged shelf."
                        );

                    } else {
                        int indexRow = shelfRow - 1;
                        int indexCol = shelfCol - 1;

                        warehouse[indexRow][indexCol] =
                            restock(input, warehouse[indexRow][indexCol]);

                        System.out.println("Restocking successful!");
                        System.out.println(
                            "Updated quantity: "
                            + warehouse[indexRow][indexCol] + " items."
                        );
                    }
                    break;

                case 5:
                    System.out.println(
                        "Exiting inventory system. Goodbye!"
                    );
                    break;
 
                default:
                    System.out.println(
                        "Invalid option. Choose 1 to 5."
                    );
            }

        } while (choice != 5);

        input.close();
    }

    public static int readInteger(Scanner input, String message) {
        while (true) {
            System.out.print(message);

            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println(
                    "Invalid input. Please enter a whole number."
                );
                input.next();
            }
        }
    }

    public static int restock(Scanner input, int currentCount) {
        while (true) {
            int quantity = readInteger(
                input, "Enter quantity to add (greater than 0): "
            );

            if (quantity > 0) {
                return currentCount + quantity;
            }

            System.out.println(
                "Quantity must be greater than zero."
            );
        }
    }
}
