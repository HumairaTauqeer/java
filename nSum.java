/**
 * @author- Humaira Tauqeer
 * This program asks user to input
 * positive integer, validates input, takes
 * even numbers from 1- n and computes
 * sum of 1/n of all even numbers from 1-n
 */


import java.util.*; //import ArrayList
import java.util.Scanner;   //import Scanner

public class nSum {
    public static void main(String[] args) throws Exception {
        int n = 0;
        int number = userNumber(n);
        double sum = even(number);
        display(number, sum);

    }
    /**
     * @param n -number entered by user
     * @return -returns number after validation
     */
    static int userNumber(int n) {
        Scanner userInput = new Scanner(System.in); // creating scanner

        while (true) {

            System.out.println("Enter a positive number: ");
            n = userInput.nextInt(); // reading userInput
            if (n >= 1) {

                return n;

            } else { //showing error
                System.out.println("invalid input");
            }
            userInput.close(); //closing scanner
        }
    }
    /**
     * 
     * @param n - to get all even numbers between 1 to user entered number
     * @return
     */
    static double even(int n) {
        LinkedList<Integer> Y=new LinkedList<Integer>();
        //ArrayList<Integer> Y = new ArrayList<Integer>(); // creating arraylist to store even numbers

        double sum = 0;

        for (int i = 2; i <= n; i = i + 2) {

            sum += 1.0 / i; // computing sum 
            Y.add(i);
            // System.out.println(Y);

        }

        return sum;

    }
    /**
     * display the output
     * @param n - usernumber  
     * @param sum -sum calculated
     */
    public static void display(int n, double sum) {
        System.out.printf("The number entered was %d, and Summation resulted into %.2f", n, sum);
    }

}
