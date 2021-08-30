import java.util.Scanner;
import java.util.InputMismatchException;

public class Temperature {

    private double ftemp;

    /**
     * using Scanner method to populate ftemp with double value.
     */
    public void ReadInput() {

        // creating scanner

        Scanner userInput = new Scanner(System.in);
        // user input validation
        try {
            while (true) {
                try {
                    System.out.println("Please enter a temperature value in Fahrenheit\n"
                            + "to find its equivalent value in Celcius and Kelvin scale: ");

                    ftemp = userInput.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter a valid number!!!");
                    userInput.nextLine();

                }
            }
        } finally {
            userInput.close();
        }

    }

    /**
     * 
     * @return - returns the value of the ftemp field, as a Fahrenheit temperature.
     */
    public double getFahrenheit() {
        return ftemp;
    }

    /**
     * @return -Returns the value of the ftemp field converted to Celsius.
     */
    public double getCelcius() {
        return ((double) 5 / 9) * (ftemp - 32);
    }

    /**
     * @return -Returns the value of the ftemp field converted to Kelvin.
     */
    public double getKelvin() {
        return ((double) 5 / 9) * (ftemp - 32) + 273;
    }

    /**
     * Displaying The Fahrenheit temperature and the equivalent values in Celsius
     * and Kelvin
     */
    public void displayOutput() {
        System.out.printf(
                "Entered Fahrenheit Temperature: %.2f\nCelcius Temperature: %.2f\n" + "Kelvin Temperature: %.2f",
                getFahrenheit(), getCelcius(), getKelvin());
    }

}
