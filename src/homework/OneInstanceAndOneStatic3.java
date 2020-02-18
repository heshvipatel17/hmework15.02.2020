package homework;

public class OneInstanceAndOneStatic3 {

    //Declare Instance variable
    String name = "Jitu";

    //Declare Static variable
    static int age = 40;

    //Declare Main Method
    public static void main(String[] args) {
        OneInstanceAndOneStatic3 heshu1 = new OneInstanceAndOneStatic3();

        //Call Method
        heshu1.data1();
        data2();
    }

    //Declare Instance Method
    public void data1() {
        System.out.println(name);
        System.out.println(age);
    }

    //Declare Static Method
    public static void data2() {

        //Creat Object to Call Instance Variable
        OneInstanceAndOneStatic3 obj1 = new OneInstanceAndOneStatic3();
        System.out.println(obj1.name);
        System.out.println(age);
    }
}
