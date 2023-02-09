package com.lineofcomparison;
import java.util.Scanner;
public class LineComparison {
    public double lengthCalculate(double x1,double y1, double x2, double y2)
    {
            double length = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
            return Math.sqrt(length);
        }
            public static void main(String[]args)
        {
                Scanner read = new Scanner(System.in);
                LineComparison length = new LineComparison();
                double x1, y1, x2, y2, x3, y3, x4, y4;

                System.out.println("::::::Considering the first line::::::");
                System.out.println("Enter x and y coordinates of the first point: ");
                x1 = read.nextDouble();
                y1 = read.nextDouble();
                System.out.println("Enter x and y coordinates of the second point: ");
                x2 = read.nextDouble();
                y2 = read.nextDouble();

                System.out.println("\n::::::Considering the second line::::::");
                System.out.println("Enter x and y coordinates of the third point: ");
                x3 = read.nextDouble();
                y3 = read.nextDouble();
                System.out.println("Enter x and y coordinates of the fourth point: ");
                x4 = read.nextDouble();
                y4 = read.nextDouble();

                Double firstLine = length.lengthCalculate(x1,y1,x2,y2);                 // Storing the line length in two different variables
                System.out.printf("\nThe length of first line is %.3f", firstLine);
                Double secondLine = length.lengthCalculate(x3,y3,x4,y4);                // Storing the line length in two different variables
                System.out.printf("\nThe length of second line is %.3f", secondLine);
                System.out.println("\n");

                /*Using equals method to check equality of two lengths*/
                if(firstLine.equals(secondLine)){
                    System.out.println("Therefore the two lines are equal");
                }
                else{
                    System.out.println("Therefore the two lines are not equal");
                }
            }
}
