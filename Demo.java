/**
 * @author Huamira Tauqeer
 * this program asks for user input for 
 * fahrenheit temperature and displays its 
 * conversion to celcius and kelvin scale.
 */
public class Demo{
    public static void main(String[] args) throws Exception {
       //creating instance of Temperature class
        Temperature temp = new Temperature();
        // Invokation of ReadInput method
        temp.ReadInput();
        // Invokation of displayOutput method
        temp.displayOutput();
    }
}
