package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * Solution to the PA2a
 * 
 * 
 * @author Ada Kavuzlu
 */
public class PA2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare variables for the five numbers
        int num1, num2, num3, num4, num5;
        int sumAll, sumPositive = 0, sumNonPositive = 0;
        int countPositive = 0, countNonPositive = 0;

        // Prompt the user for five whole numbers
        System.out.print("Enter five whole numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        //Calculate the sum of all numbers
        sumAll = num1 + num2 + num3 + num4 + num5;

        //Check each number and update sums and counts
        if (num1 > 0) {
            sumPositive += num1;
            countPositive++;
        } else {
            sumNonPositive += num1;
            countNonPositive++;
        }

        if (num2 > 0) {
            sumPositive += num2;
            countPositive++;
        } else {
            sumNonPositive += num2;
            countNonPositive++;
        }

        if (num3 > 0) {
            sumPositive += num3;
            countPositive++;
        } else {
            sumNonPositive += num3;
            countNonPositive++;
        }

        if (num4 > 0) {
            sumPositive += num4;
            countPositive++;
        } else {
            sumNonPositive += num4;
            countNonPositive++;
        }

        if (num5 > 0) {
            sumPositive += num5;
            countPositive++;
        } else {
            sumNonPositive += num5;
            countNonPositive++;
        }

        //Calculate the averages
        double averageAll = (double) sumAll / 5;
        double averagePositive = countPositive > 0 ? (double) sumPositive / countPositive : 0.0;
        double averageNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0.0;

        //Output the results with exact formatting
        System.out.printf("The sum of the %d %s number%s: %d%n", countPositive, 
                          countPositive == 1 ? "positive" : "positive", 
                          countPositive == 1 ? "" : "s", sumPositive);
                          
        System.out.printf("The sum of the %d %s number%s: %d%n", countNonPositive, 
                          countNonPositive == 1 ? "non-positive" : "non-positive", 
                          countNonPositive == 1 ? "" : "s", sumNonPositive);

        System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
        System.out.printf("The average of the %d %s number%s: %.2f%n", countPositive, 
                          countPositive == 1 ? "positive" : "positive", 
                          countPositive == 1 ? "" : "s", averagePositive);
                          
        System.out.printf("The average of the %d %s number%s: %.2f%n", countNonPositive, 
                          countNonPositive == 1 ? "non-positive" : "non-positive", 
                          countNonPositive == 1 ? "" : "s", averageNonPositive);

        System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);

        //Close the scanner
        input.close();
    }
}
