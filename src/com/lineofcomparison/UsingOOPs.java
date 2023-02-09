package com.lineofcomparison;
import java.util.Scanner;
public class UsingOOPs {
    public static void isEqual(double lengthLine1, double lengthLine2){                   //Checking equality of two lines
        if(lengthLine1 == lengthLine2){
            System.out.println("Therefore the two lines are equal");
        }
        else{
            compareLines(lengthLine1 , lengthLine2);
        }
    }
    public static void compareLines(double line1, double line2){             //Comparing the length of two lines
        if(line1 > line2){
            System.out.println("The first line is greater than the second line.");
        }
        else if(line1 < line2){
            System.out.println("The second line is greater than the first line.");
        }

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        UsingOOPs length = new UsingOOPs();
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

        double firstLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("\nThe length of first line is %.3f", firstLine);
        double secondLine = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        System.out.printf("\nThe length of second line is %.3f", secondLine);
        System.out.println("\n");
        isEqual(firstLine,secondLine);                                               //Calling the method isEqual
        compareLines(firstLine,secondLine);                                          //Calling the method compareLines
    }
}
