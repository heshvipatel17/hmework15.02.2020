package homework;

import java.util.Scanner;

public class TableUpTo10 {

    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        System.out.print("Enter number:");
        int a = table.nextInt();
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " * " + b + " = " + a * b);
        }
    }
}




