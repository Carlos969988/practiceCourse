import java.util.Map;

public class ExampleEnvironmentVariables {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Environment variable of the system = " + varEnv);

        System.out.println("-----------listing environment variables of system ---------");

        for (String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("USER");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TMPDIR");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path = " + path2);


    }
}
