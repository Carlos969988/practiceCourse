import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ExampleAssignSystemProperties {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("my.property.personalized","My value to save in the properties object");

            System.setProperties(p);
            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(...) = " + ps.getProperty("my.property.personalized"));
            System.out.println(System.getProperty("config.author.name"));
            System.out.println(System.getProperty("config.author.email"));
            System.out.println(System.getProperty("config.text.environment"));


            ps.list(System.out);
        } catch (Exception e) {
            System.err.println("Don´t exist the file = " + e);
            System.exit(1);
        }
    }
}
