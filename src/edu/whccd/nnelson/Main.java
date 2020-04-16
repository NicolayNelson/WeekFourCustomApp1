package edu.whccd.nnelson;
import java.util.Scanner;

/*
This program is designed to show how to use if-else statements and switch statements.
Author: Nicolay Nelson
Author: Nicolay Nelson
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numeric grade to a letter grade using an if-else statement");
        System.out.print("Enter a number integer grade (0-100): ");
        int numericGrade = input.nextInt();
        char letterGrade = '"';
        //Setting a range by making numbers less than 0 and greater than 100 invalid
        if (numericGrade < 0 || numericGrade > 100) {
            System.out.println("Invalid Input!");
            System.exit(0);
        // If-else statements Numeric grade to a letter grade
        } if (numericGrade <= 100 && numericGrade >= 90) {
            letterGrade = 'A';
        } else if (numericGrade < 90 && numericGrade >= 80) {
            letterGrade = 'B';
        } else if (numericGrade < 80 && numericGrade >= 70) {
            letterGrade = 'C';
        } else if (numericGrade < 70 && numericGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        //switch statement Letter grade to a numeric grade range
        String numericGradeRange;

        switch (letterGrade) {
            case 'A':
                numericGradeRange = "90-100%";
                break;
            case 'B':
                numericGradeRange = "80-89%";
                break;
            case 'C':
                numericGradeRange = "70-79%";
                break;
            case 'D':
                numericGradeRange = "60-69%";
                break;
            default:
                numericGradeRange = "0-59%";
                break;
        }
        //display
        System.out.println("Letter Grade:  " + letterGrade);
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Letter grade to a numeric grade range using a switch statement");
        System.out.println("Numeric Grade Range:" + numericGradeRange);
    }
}

