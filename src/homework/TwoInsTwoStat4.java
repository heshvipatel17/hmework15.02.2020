package homework;

public class TwoInsTwoStat4 {
    //Declare two instance variable outside main method
    int a = 10;
    int b = 7;

    //Declare two Static Variable outside main method
    static int c = 3;
    static int d = 1;

    // Declare Main Method
    public static void main(String[] args) {
        TwoInsTwoStat4 obj1 = new TwoInsTwoStat4();
        obj1.instanceMethod1();
        staticMethod1();
    }

    //Declare Instance Method
    public void instanceMethod1() {
        System.out.println(a + b + c + d);
    }

    //Declare Static Method
    public static void staticMethod1() {

        //Creat Object to Call Instance Variable
        TwoInsTwoStat4 obj2 = new TwoInsTwoStat4();
        System.out.println(obj2.a - obj2.b);
        System.out.println(c - d);
    }
}
