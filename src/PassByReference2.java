
class Person {
    private String name;

    public void modifyName(String newName) {
        this.name = newName;
    }
    public String readName() {
        return this.name;
    }
}
public class PassByReference2 {
    public static void main(String[] args) {

        Person person = new Person();
        person.modifyName("Carlos");

        int[] age = {10, 11, 12};
 
        System.out.println("init the main method ");

        System.out.println("person = " + person.readName());

        System.out.println("Before to the test method");
        test(person);
        System.out.println("After to the test method");

        System.out.println("person = " + person.readName());

        System.out.println("end to the main method with the person values modified");
    }

    public static void test(Person person) {
        System.out.println("init the test method!");

        person.modifyName("Juan");
        System.out.println("end the test method");
    }
}
