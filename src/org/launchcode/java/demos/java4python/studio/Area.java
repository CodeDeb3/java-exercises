package org.launchcode.java.demos.java4python.studio;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Debbie on 2/27/2017.
 */
public class Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double radius = 0.0;
        // Double PI = 3.14;

        while(radius.equals(0.0)) {
            System.out.println("Enter a radius: ");
            radius = scanner.nextDouble();
            //radius.Double.parseDouble(scanner.next()); autobox

            if(radius <0) {
                System.out.println("Be more positve");
            }   else {
                Double area = radius * radius * Math.PI;
                //String name = scanner.next();
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
            radius = 0.0;
        }
    }
}
