package homework;

import java.util.Scanner;

public class AverageOfTheNumber13 {

    public static void main(String[] args) {
        Scanner avg = new Scanner(System.in);
        System.out.print("Input the first number: ");
        float x = avg.nextFloat();
        System.out.print("Input the second number: ");
        float y = avg.nextFloat();
        System.out.print("Input the third number: ");
        float z = avg.nextFloat();
        System.out.print("The average value is " + average(x, y, z) + "\n");
    }

    public static float average(float x, float y, float z) {
        return (x + y + z) / 3;
    }
}

