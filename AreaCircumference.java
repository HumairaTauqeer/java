import java.util.Scanner;
public class AreaCircumference {
    public static void main(String[] args) throws Exception {
         // create scanner and prompt user for input
         Scanner userInput = new Scanner(System.in);
         double radius = 0;
         boolean isNumber = true;
 
         // checking if the input is a positive number
         while (isNumber) {
             System.out.println("Enter the radius: ");
             radius = userInput.nextDouble();
 
             if (radius >= 0) {
 
                 isNumber = true;
                 //computing formulas
                 double area = Math.PI *radius * radius;
                 double circumference = 2 * Math.PI * radius;
 
                 System.out.printf("Area of the circle is %f%nCircumference of the circle is %f%n ", area,
                         circumference);
 
                 System.out.println("Feel free to try more numbers: ");
 
             } else {
 
                // showing error
                 System.out.println("Wrong entry. Please enter a positive number");
 
             }
 
         }
         //closing scanner
         userInput.close();
     }
 }
 
