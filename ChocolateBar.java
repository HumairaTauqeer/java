
/**
 * @ author - Humaira Tauqeer
 * This programs asks user to input age, weight,
 * height and sex, and calculates how many calories
 * that user need to maintain their weight, and how many 
 * chocolate bars they can consume. 
 */
//import scanner
import java.util.Scanner;

public class ChocolateBar {
    public static void main(String[] args) throws Exception {

        final int ChocBarCalories = 230;
        // create scanner
        Scanner Input = new Scanner(System.in);
        System.out.printf("%s\n%s\n", "I am here to tell you how many chocolate bars", // welcome message
                "you can consume in a day.");
        System.out.println("Please provide some info below: ");
        System.out.println("Enter your age in years: "); // user Input
        // reading age
        int age = Input.nextInt();
        System.out.println("Enter your height in inches: "); // asking height
        double height = Input.nextDouble(); // reading height
        System.out.println("Enter your weight in pounds: "); // asking weight
        double weight = Input.nextDouble(); // reading weight
        System.out.println("spicify if you are a male or a female: "); // asking gender
        String askSex = Input.next().toUpperCase(); // reading gender and converting it to upper case
        // Creating enum
        enum Sex {
            MALE, FEMALE, OTHER

        }
        // creating if else statement for passing value to OTHER in enum
        Sex sex = null;
        if (askSex.equals("MALE") || askSex.equals("FEMALE")) {
            sex = Sex.valueOf(askSex);

        } else {
            sex = Sex.OTHER;
            // closing scanner
            Input.close();
        }

        switch (sex) {
            case FEMALE:
                double WBMR = BMR1(height, weight, age); // passing argument to function BMR1
                // output message
                System.out.printf("You are a %d years old female with\n%.2f pounds weight, and %.2f inches height.\n"
                        + "You need %.2f calories to maintain your weight.\n", age, weight, height, WBMR);

                int recommendedChocolateBar1 = ChocBar1(WBMR, ChocBarCalories); // calculating number of chocolate bars
                System.out.printf("You can consume %d chocolate bars in a day to maintain your weight. ",
                                recommendedChocolateBar1);
                

                break;
            case MALE:

                double MBMR = BMR2(height, weight, age); // passing argument to function BMR2

                System.out.printf("You are a %d years old male with\n%.2f pounds weight, and %.2f inches height.\n"
                        + "You need %.2f calories to maintain your weight.\n", age, weight, height, MBMR);
                int recommendedChocolateBar2 = ChocBar2(MBMR, ChocBarCalories); // calculating number of chocolate bars
                // output message
                System.out.printf("You can consume %d chocolate bars in a day to maintain your weight. ",
                                recommendedChocolateBar2);
                break;

            default: // output if anything other than male or female selected
                System.out.println("Sorry, this program is designed for a Male or a Female.");
        }

    }

    /**
     * method for calculating woman BMI
     * @param height
     * @param weight
     * @param age
     * @return
     */
        
    static double BMR1(double height, double weight, int age) {
        return 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
    }

    /**
     * method for calculation chocolate bars for women
     * @param WBMR
     * @param ChocBarCalories
     * @return
     */
    static int ChocBar1(double WBMR, int ChocBarCalories) {
        return (int) WBMR / ChocBarCalories;
    }

    /**
     * method for calculating man BMI
     * @param height
     * @param weight
     * @param age
     * @return
     */
    static double BMR2(double height, double weight, int age) {
        return 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
    }

    /**
     * method for calculation chocolate bars for man
     * @param MBMR
     * @param ChocBarCalories
     * @return
     */
    static int ChocBar2(double MBMR, int ChocBarCalories) {
        return (int) MBMR / ChocBarCalories;
    }
}
