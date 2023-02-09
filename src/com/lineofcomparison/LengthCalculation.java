package com.lineofcomparison;
import java.util.Scanner;
public class LengthCalculation {
    public double lengthCalculate(double x1,double y1, double x2, double y2)
    {
        double length = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.sqrt(length);
    }
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        LengthCalculation length = new LengthCalculation();
        double x1, y1, x2, y2;
        System.out.println("Enter x and y coordinates of the first point: ");
        x1 = read.nextDouble();
        y1 = read.nextDouble();
        System.out.println("Enter x and y coordinates of the second point: ");
        x2 = read.nextDouble();
        y2 = read.nextDouble();
        System.out.printf("The length of the line is %.3f", length.lengthCalculate(x1,y1,x2,y2));
    }
}
