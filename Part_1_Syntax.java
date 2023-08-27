package Part_1_Syntax;

import java.util.Scanner;

public class Part_1_Syntax {
    //Part 1. Syntax
    //Single-Line comments
    /*
     * Multiple-line comments
     */
    /**
     *Document comments
     */

    public static void main(String[] args) {
        //Creating scanner for user input
        Scanner scanner = new Scanner(System.in);
        //Declaring variables
        int INT1 = 4;
        int INT2 = 9;
        double DOUBLE = 4.5;
        char CHAR = 'g';
        System.out.println("Input true or false");
        /*creating user input*/
        boolean BOOLEAN = scanner.nextBoolean();
        String STRING = "Strin";
        //Number operations
        int IntSum = INT1 + INT2;
        double DoubleProduct = DOUBLE * 3;
        System.out.println("First integer = " + INT1);
        System.out.println("Second integer = " + INT2);
        System.out.println("Sum of the integers = " + IntSum);
        System.out.println("Double variable = " + DOUBLE);
        System.out.println("Double times 3 = " + DoubleProduct);
        System.out.println("String variable = " + STRING);
        System.out.println("Char variable = " + CHAR);
        System.out.println("String + Char variables = " + STRING + CHAR);
        System.out.println("Boolean value is " + BOOLEAN);
    }
}
