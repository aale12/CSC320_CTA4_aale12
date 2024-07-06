package CSC320.CSC320_CTA4_aale12;

import java.util.ArrayList;
import java.util.Scanner;

public class CTA4_Option2 {
    public static void main(String[] args) {

        //prompting for 10 grades
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 floating-point student grades, separated by a space");
        String gradesList = scanner.nextLine();

        //converting string to stringarray
        String[] gradesArray = gradesList.split(" ");

        //initializing float arraylist
        ArrayList<Float> gradesArrayFloat = new ArrayList<>();

        //adding float to float arraylist
        for (String grade: gradesArray) {
            gradesArrayFloat.add(Float.valueOf(grade));
        }

        //initializing requested data
        Float gradesMax = gradesArrayFloat.get(0), gradesMin = gradesArrayFloat.get(0);
        Float gradesSum = (float) 0.0;
        Float gradesAverage;
        for (Float grade: gradesArrayFloat) {
            if (grade < gradesMin) {
                gradesMin = grade;
            }
            if (grade > gradesMax) {
                gradesMax = grade;
            }
            gradesSum += grade;
            System.out.println(grade);
        }
        gradesAverage = gradesSum / gradesArrayFloat.size();
        System.out.println("Maximum is " + gradesMax);
        System.out.println("Minumum is " + gradesMin);
        System.out.println("Average is " + gradesAverage);

        scanner.close();
    }
}
