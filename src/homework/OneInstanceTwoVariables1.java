package homework;

//Declare two instance variable outside main method
public class OneInstanceTwoVariables1 {
    int a = 15;
    int b = 25;

    //Declare two Extra variable for practice
    int c = 5;
    int d = 10;

    //Declare Main Method
    public static void main(String[] args) {

        OneInstanceTwoVariables1 cal = new OneInstanceTwoVariables1();
        cal.add();
    }

    //Declare Instance Method
    public void add() {
        int result = a + b;
        int result1 = c * d;
        System.out.println(result);
        System.out.println(result1);
    }
}
