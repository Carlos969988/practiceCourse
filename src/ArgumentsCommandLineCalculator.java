public class ArgumentsCommandLineCalculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Please, enter an operation and two numbers");
            System.exit(-1);
        }
        String operation = args[0];
        int a = 0;
        int b = 0;
        double result = 0.00;

        try {
             a = Integer.parseInt(args[1]);
             b = Integer.parseInt(args[2]);
        } catch (Exception e) {
            System.err.println("Careful, a and b must be integers, try again");
            System.exit(-1);
        }

        switch (operation) {
            case "sum":
                result = a + b;
                break;
            case "rest":
                result = a - b;
                break;
            case "multi":
                result = a * b;
                break;
            case "split":
                if (b == 0) {
                    System.err.println("cannot be divided by zero");
                    System.exit(-1);
                }
                result = (double) a / b;
                break;
            default:
                result = a + b;
        }
        System.out.println("Result of operation '" + operation + "' is: " + result);
    }
}
