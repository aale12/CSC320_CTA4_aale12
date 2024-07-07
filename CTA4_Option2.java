package CSC320.CSC320_CTA4_aale12;

import java.util.ArrayList;
import java.util.Scanner;

public class CTA4_Option2 {

    public static void main(String[] args) {
        //init variables
        Float gradesMax = null, gradesMin = null, gradesAverage, userInput = null, gradesSum = (float) 0.0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> gradesArrayFloat = new ArrayList<>();
        boolean invalidInput = true;

        //prompting for 10 grades
        System.out.println("Enter 10 floating-point student grades");
        for (int i = 1; i <= 10; i++) {
            while (invalidInput) {
                try {
                    System.out.println("Enter grade " + i);
                    userInput = scanner.nextFloat();
                    invalidInput = false;
                } catch (Exception e) {
                    System.out.println("You entered " + scanner.next());
                    System.err.println("You did not enter a number, please try again!");
                }
            }
            //tracking sum for average
            gradesArrayFloat.add(userInput);
            gradesSum += userInput;
            if (i == 1) {
                gradesMax = userInput;
                gradesMin = userInput;
            } //assigning min
            else if (userInput < gradesMin) {
                gradesMin = userInput;
            } //assigning max
            else if (userInput > gradesMax) {
                gradesMax = userInput;
            }
            invalidInput = true;
        }
        gradesAverage = gradesSum / gradesArrayFloat.size();
        System.out.println("Maximum is " + gradesMax);
        System.out.println("Minumum is " + gradesMin);
        System.out.println("Average is " + gradesAverage);
        scanner.close();
    }
}
