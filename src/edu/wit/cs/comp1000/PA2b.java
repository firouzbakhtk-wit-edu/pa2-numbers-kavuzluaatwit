package edu.wit.cs.comp1000;
/**
 * Solution to the PA2a
 * 
 * 
 * @author Ada Kavuzlu
 */
import java.util.Scanner;

public class PA2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the coefficients a, b, and c
        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        //Check the discriminant and solve accordingly
        if (discriminant < 0) {
            System.out.println("Roots: imaginary");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);

            //Ensure the roots are printed in ascending order
            if (root1 < root2) {
                System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
            } else {
                System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
            }
        }

        //Close the scanner
        input.close();
    }
}