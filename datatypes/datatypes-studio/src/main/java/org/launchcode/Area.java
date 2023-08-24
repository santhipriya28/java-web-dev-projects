package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*System.out.println("Enter a radius:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double A = Circle.getArea(radius);
        System.out.println("The area of a circle of radius" + radius + "is :" + A);
        input.close();*/
        System.out.println("Enter a radius:");
        if(input.hasNextDouble()){
            double radius = input.nextDouble();

            if(radius >0){
                double A = Circle.getArea(radius);
                System.out.println("The area of a circle of radius" + radius + "is :" + A);
            } else {
                System.out.println("sorry, the radius must be positive number");
            }
        } else {
            System.out.println("sorry that was not a positive number");
        }
        input.close();
    }
}
