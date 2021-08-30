
/** @author Humaira Tauqeer
 *
 * This Java program sets up a linked list of nodes, where each node has 2 fields:
•	a field to hold a subexpression (ex. 1.0/2)
•	a field to point to the next field
The program then  recursively computes and then reports the following summation:
1.0/2 + 1.0/4 + 1.0/6 + ... + 1.0/n
where n >= 2

 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class nSumRecursive {
    public final static int MIN = 2;
    public final static double ONE = 1.0;

    public static void main(String[] args) throws Exception {
        int num = userNumber();
        // creatig a linked list node with valu 1.0/2
        Node head = new Node(ONE / MIN);
        Node currNode = head;
        /*
         * creating for loop from 2 to num and 
         * then creating a new node in the list for
         * each even number j with value 1.0/j
         */
        for (int j = 4; j <= num; j += 2) {
            currNode.Next = new Node(ONE / j);
            currNode = currNode.Next;
        }
        double Sum = recurseList(head);
        // System.out.println(Sum);

        displayResult(num, Sum);

    }

    /** A value-returning method to return a valid value
     * @return - 
     */
    static int userNumber() {
        Scanner userInput = new Scanner(System.in); // creating scanner
        System.out.println("Enter a number bigger than or equal to 2: ");
        // validating user Input
        try {
            while (true) {
                try {
                    // Reading entered input from user
                    int num = userInput.nextInt();

                    // Check if entered input data is bigger than or equal to 2
                    if (num < MIN) {
                        System.out.println("Invalid entry!!!\nEnter a number bigger than or equal to 2: ");
                    } else {
                        return num;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entry was not a number.\nEnter a number bigger than or equal to 2: ");
                    userInput.nextLine();
                }

            }
        } finally {
            userInput.close();
        }
    }

    /**
     * A value-returning method to recursively compute the summation
     * 
     * @param head
     * @return
     */
    public static double recurseList(Node head) {
        if (head.Next == null) { // base case
            return head.value;
        }
        return head.value + recurseList(head.Next); // recurse case + composition
    }

    /**
     * A void method that receives copies of userInput and the sum value and
     * displays them
     * 
     * @param num
     * @param Sum
     */
    public static void displayResult(int num, double Sum) {
        System.out.printf("The number entered was %d, and Summation resulted into %.2f", num, Sum);
    }

}
