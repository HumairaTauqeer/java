/** @author Humaira Tauqeer
 * This program asks for userinput between 1 to 50.
 * then creates a triangle of height based on userinput.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class triangle {
    // Creating constants fro min and max userinput
    public static final int Min = 1;
    public static final int Max = 50;

    public static void main(String[] args) {

        int enteredNumber = getUserNumber();
        // System.out.print(enteredNumber);
        makeTriangle(enteredNumber); // calling makeTriangle function 

    }
    /**
     * 
     * @return -number entered by user
     */
    private static int getUserNumber() {
        int enteredNumber = 0;
        Scanner userInput = new Scanner(System.in); //creating scanner
        // user input validation
        try {
            while (true) {
                System.out.println("Please enter a positive number within specified range (1-50): ");
                /*try and catch block to handle inputmismatch exception
                if user enters something other than numbers*/
                try { 
                    enteredNumber = userInput.nextInt();

                    if (enteredNumber >= Min && enteredNumber <= Max) {
                        return enteredNumber;

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Input was not a number!!!");
                    userInput.nextLine();

                }

            }
        } finally { // closes scanner
            userInput.close();
        }

    }
    /**
     * 
     * @param enteredNumber -number entered by user
     */
    private static void makeTriangle(int enteredNumber) {
       // this loop creates upper half of the triangle
        for (int i = 0; i < enteredNumber - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        // this loop creates lower half of the triangle
        for (int i = enteredNumber - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
