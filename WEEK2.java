
package week2;

import java.util.Scanner;

public class WEEK2 {

    public static void main(String[] args) {
  
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------BASIC-------------------");
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.println("-------------------------------------------");
        
        System.out.println("\nADDITION: " + (num1 + num2));
        System.out.println("SUBTRACTION: " + (num1 - num2));
        System.out.println("MULTIPLICATION: " + (num1 * num2));
        
        if (num2 !=0){

        System.out.println("DIVISION: " + (num1 / num2));
        System.out.println("MODULUS: " + (num1 % num2));
        
        } else {
            
        //Division in Java removes the decimal part.
        //Modulus returns the remainder
        
            System.out.println("DIVISION: Cannot divide by zero");
        System.out.println("MODULUS: Cannot divide by zero");
        }
        
        System.out.println("\n\n----------------INTERMEDIATE----------------");
        
        double ave = 1.0;
        int absences = 1;
        
        System.out.println("Average Grade: " + ave);
        System.out.println("Number of Absences: " + absences);
        
        if (ave <= 2.75 && absences <= 2) {
            System.out.println("\nResult: PASS");
            System.out.println("You met the passing requirements!");
           
        } else if (ave >= 3.0 && absences >= 3) {
            System.out.println("\nResult: FAIL");
            System.out.println("You have failed to pass the needed requirements to pass!");
            
        } else {
            System.out.println("\nResult: ..");
            System.out.println("Please proceed to the Chairpersons Office!");
            
        }
        
        System.out.println("\n\n------------------ADVANCED------------------");
        
        
        double bal = 67000;
       
        System.out.println("Current Balance: " + bal);
        
        System.out.print("\nInput +=: ");
        bal += input.nextInt();
        System.out.printf("\nNew Balance: %.2f%n", bal);
        
        System.out.print("\nInput *=: ");
        bal *= input.nextInt();
        System.out.printf("\nNew Balance(2): %.2f%n", bal);
        
        System.out.print("\nInput +=: ");
        bal += input.nextInt();
        System.out.printf("\nNew Balance(3): %.2f%n", bal);
        
        System.out.println("-------------------------------------------");
        
        int count = 22;
        
        System.out.println("Count: 22");
        
        System.out.println("\nPostfix: " + count++);
        System.out.println("Result: " + count);
        
        System.out.println("\nPrefix: " + ++count);
        System.out.println("Result: " + count);
        
        // count++ uses the current value first and increases it by 1.
        // ++count increases the value by 1 first and then uses the new value.
        
        System.out.println("\n\n-------------------EXPERT-------=-----------");
  
        //Predicti=ion: false
        int a = 7;
        int b = 2;
        System.out.println("Expression 1: " + ((a + b * 2) > 10 && a < b + 3));
        //Result:false
        
        System.out.println("---------------------------");
        
        //Prediction: 6
        int counter = 5;
        
        System.out.println("Expression 2: " + counter);
        System.out.println("Counter: " + (counter++ + 1));
        //Result: 6

        System.out.println("---------------------------");
        
        //Prediction:true
        int x = 3;
        int y = 2;
        System.out.println("Expression 3: " + (x > y && x - y < 1 || y == 2));
        //Result: true
        
        input.close();
    }
    
}
