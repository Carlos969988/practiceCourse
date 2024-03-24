import java.util.Scanner;

public class LogicalOperatorsLogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Carlos";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "juan";
        passwords[2] = "12345";*/

        String[] usernames = {"carlos", "admin", "juan"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the username");
        String u = scan.next();

        System.out.println("Enter the password");
        String p = scan.next();

        boolean isAuthenticated = false;

        for (int i = 0; i < usernames.length; i++) {

            isAuthenticated = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: isAuthenticated;

            /*if ( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                isAuthenticated = true;
                break;      // out from the for cycle when authentication is true
            }*/
        }

        String message = isAuthenticated ? "Welcome user ".concat(u).concat("!"):
                "username or password incorrect\nsorry, you require an authentication";
        System.out.println("message = " + message);

        /*if (isAuthenticated) {
            System.out.println("Welcome user ".concat(u).concat("!"));
        } else {
            System.out.println("username or password incorrect");
            System.out.println("sorry, you require an authentication");
        }*/
    }
}
