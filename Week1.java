public class Week1 {

    public static void main(String[] args) {
        
        System.out.println("------------------BASIC---------------------");
      
        int age = 19;
        double height = 160.02;
        char midinitial = 'A';
        boolean isStudent = true;
        String surname = " Agtarap";
        String fname = "Cherisha Jocein ";
        
        System.out.println("----------- Profile -------------");
        
        
        System.out.println("Full Name: " + fname + midinitial + '.' + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");
        System.out.println("Student Status: " + isStudent);

        System.out.println("------------------INTERMEDIATE---------------------");
      
        int quantity = 3;
        double unitprice = 99.67;
        String storename = "Pioneer Center";
        
        //total should not be an int because the can price have decimal values.
        double total = quantity * unitprice;
        
        double cash = 500.00;
        double change = cash - total;
        
        System.out.println("====================================");
        
        System.out.println(storename);
        System.out.println("SHOPPING RECEIPT");
        
        System.out.println("====================================");
        
        System.out.println("Item: Cowhead Fresh UHT Milk");
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitprice);
        
        System.out.println("------------------------------------");
        
        System.out.printf("TOTAL: %.2f%n", total);
        System.out.println("Cash: " + cash);
        System.out.printf("Change: %.2f%n", change);
        
        System.out.println("====================================");
        System.out.println("THANK YOU FOR SHOPPING!");
        System.out.println("====================================");

        System.out.println("------------------ADVANCED---------------------");

        double cm = 722.9;
        
        int m = (int) cm / 100;
        double remainingcm = cm - (m * 100);
        
        System.out.println("=== UNIT CONVERTER ===");
        System.out.println("Total Centimeters: " + cm + "cm");
        System.out.println("Whole Meters: " + m + "m");
        System.out.printf("Remaining Centimeters: %.2f", remainingcm);
        
        int meters= 7;
        double widenedmeters = meters;
        //no cast needed because Java automatically converts int to double.
        
        System.out.println("\n\n=== WIDENED ===");
        System.out.println("Total Meters: " + meters + "m");
        System.out.println("Widened Meters: " + widenedmeters + "m");
         
        double centimeters = 722.9;
        int narrowedcm = (int) centimeters;
        /*double to int removes the decimal and turned it into 
        a whole number instead of rounding the value.*/
        
        System.out.println("\n=== NARROWED ===");
        System.out.println("Total Centimeters: " + centimeters + "cm");
        System.out.println("Narrowed Centimeters: " + narrowedcm + "cm");

        System.out.println("------------------EXPERT---------------------");

        System.out.println("====== Overflow ======");

        byte num = 127;
        num++;
        System.out.println("Number: 127");
        System.out.println("Overflow result: " + num);
        
        String word1 = new String("Programming 3");
        String word2 = new String("Programming 3");
        String word3 = "Programming 3";

        System.out.println("\n====== String Comparison ======");

        System.out.println("Word 1: Programming 3");
        System.out.println("Word 2: Programming 3");
        System.out.println("Word 3: Programming 3");

        System.out.println("\nword1 == word2: " + (word1 == word2));
        System.out.println("word1.equals(word2): " + word1.equals(word2));

        System.out.println("\nword1 == word3: " + (word1 == word3));
        System.out.println("word1.equals(word3): " + word1.equals(word3));

        System.out.println("\nword2 == word3: " + (word2 == word3));
        System.out.println("word2.equals(word3): " + word2.equals(word3));

        /* For String comparison, == checks if two variables refer to the same object,
        while .equals() checks if they contain the same text. 

        For example, word1 == word2 results in false even though they contain the same text.
        This is because they are two different objects. However, when compared using
        .equals the result is true because they both contain the same text.*/
 
        System.out.println("\n====== Array ======");

        int[] array1 = {17, 22, 21};

        int[] array2 = array1;

        System.out.println("Before : " + array2[0]);

        array1[0] = 67;

        System.out.println("After : " + array2[0]);

        
    }
    
}
