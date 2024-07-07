package CSC320.CSC320_CTA4_aale12;

import java.util.ArrayList;
import java.util.Scanner;

public class CTA4_Option2 {
    public static void main(String[] args) {

        //prompting for 10 grades
        Float gradesMax = null, gradesMin = null, gradesAverage, gradesSum = (float) 0.0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> gradesArrayFloat = new ArrayList<>();
        System.out.println("Enter 10 floating-point student grades");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter grade " + i);
            Float userInput = scanner.nextFloat();
            gradesArrayFloat.add(userInput);
            gradesSum += userInput;
            if (i == 1) {
                gradesMax = userInput;
                gradesMin = userInput;
            }
            else if (userInput < gradesMin) {
                gradesMin = userInput;
            } 
            else if (userInput > gradesMax) {
                gradesMax = userInput;
            }
        }

        // Float gradesMax = gradesArrayFloat.get(0), gradesMin = gradesArrayFloat.get(0);
        // Float gradesSum = (float) 0.0;
        // Float gradesAverage;
        // for (Float grade: gradesArrayFloat) {
        //     if (grade < gradesMin) {
        //         gradesMin = grade;
        //     }
        //     if (grade > gradesMax) {
        //         gradesMax = grade;
        //     }
        //     gradesSum += grade;
        //     System.out.println(grade);
        // }
        gradesAverage = gradesSum / gradesArrayFloat.size();
        System.out.println("Maximum is " + gradesMax);
        System.out.println("Minumum is " + gradesMin);
        System.out.println("Average is " + gradesAverage);

        scanner.close();
    }
}
