package homework;

public class TwoStaticOutsideMethod2 {

    // Declare two Static variable outside main method
    static int a = 10;
    static int b = 20;

    // Declare Two Extra Variable for practice
    static int c = 3;
    static int d = 6;

    // Declare Main Method
    public static void main(String[] args) {

        //Call Method
        add();
    }

    // Declare Static Method
    public static void add() {
        int answer1 = a + b;
        System.out.println(answer1);
        int answer2 = c * d;
        System.out.println(answer2);

    }
}
