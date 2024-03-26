public class ArgumentsCommandLine {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("you must enter arguments:");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arguments num = " + i + ": " + args[i]);


        }
    }
}
