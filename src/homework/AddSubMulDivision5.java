package homework;
//Java program to calculation with addition, subtraction, multiplication and division methods

public class AddSubMulDivision5 {
    int multiply;
    float devide;
    static int addition, subtract;

    //Declare Main Method
    public static void main(String args[]) {

        AddSubMulDivision5 met = new AddSubMulDivision5();
        addition(10, 20);
        subtraction(30, 20);
        met.multiplication(10, 20);
        met.division(10, 2);

    }

    public static void addition(int first, int second) {

        addition = (first + second);
        System.out.println("Sum = " + addition);
    }

    public static void subtraction(int first, int second) {
        subtract = first - second;
        System.out.println("Difference = " + subtract);
    }

    public void multiplication(int first, int second) {
        multiply = first * second;
        System.out.println("multiplication = " + multiply);
    }

    public void division(int first, int second) {
        devide= (float) first / second;
        System.out.println("division = " + devide);
    }
}
