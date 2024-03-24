import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

       String  variable = 7 == 5 ? "if it's true": "if it´s false";
        System.out.println("variable = " + variable);

        String state = "";
        double average = 0.0;

        double math = 0.0;
        double sciences = 0.0;
        double history = 0.0;

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter math grade between 2.0 and 7.0:");
        math = sca.nextDouble();
        System.out.println("Enter sciences grade between 2.0 and 7.0:");
        sciences = sca.nextDouble();
        System.out.println("Enter history grade between 2.0 and 7.0:");
        history = sca.nextDouble();

        average = (math + sciences + history) / 3;
        System.out.println("average = " + average);

        state = average >= 5.40 ? "approved" : "refused";       // the same declaration that an if expression
        System.out.println("state = " + state);

        /*if (average >= 5.49) {
            state = "approved";
        } else {
            state = "refused";
        }*/
    }
}
