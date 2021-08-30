/* this program asks user to type 
 * 4-digit number and displays the 
 * number and then the digits of that 
 * number on separate line*/
import java.util.Scanner; // importing package for user input
class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Declaring variable userInput to ask for user input
        System.out.println("Enter a positive 4-digit number: "); // printing user input message
        String userNumber = userInput.nextLine(); // declaring userNumber variable to read input from user
        // printing the message with number entered by user
        System.out.println("The number you entered is "+ userNumber+". It's digits are:");
        // printing each digit on separate line
        System.out.println(userNumber.charAt(0)+"\n"+ 
         userNumber.charAt(1)+"\n"+
         userNumber.charAt(2)+"\n"+
         userNumber.charAt(3));
         userInput.close();
        
    }
}
