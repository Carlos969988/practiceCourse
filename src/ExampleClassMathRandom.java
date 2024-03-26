import java.util.Random;
import java.util.Scanner;

public class ExampleClassMathRandom {
    public static void main(String[] args) {

        String[] colors = {"blue", "yellow", "red", "green", "white", "black"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colors.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colors = " + colors[(int) random]);

        Random randomObject = new Random();
        int randomInt = 15 + randomObject.nextInt(25 - 15 + 1 );
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObject.nextInt(colors.length);
        System.out.println("randomInt = " + randomInt);

        System.out.println("colors = " + colors[randomInt]);

    }
}
