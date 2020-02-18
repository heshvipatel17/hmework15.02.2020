package homework;

import java.util.Scanner;

public class RadiasValueOfCircle6 {

    //Declare Main Method
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area;
        Scanner cir = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = cir.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:" + area);
    }
}

