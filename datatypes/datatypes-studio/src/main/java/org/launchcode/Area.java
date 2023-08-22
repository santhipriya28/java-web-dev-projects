package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double A = Circle.getArea(radius);
        if(!input.hasNext()){
            System.out.println(" empty ");
        }
        System.out.println("The area of a circle of radius" + radius + "is :" + A);

    }
}
