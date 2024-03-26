import java.lang.reflect.Method;

public class ExampleMethodGetClass {
    public static void main(String[] args) {
        
        String text = "Hellos, how are you";
        
        Class strClass = text.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for (Method method: strClass.getMethods()) {
            System.out.println("method = " + method.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objectClass =intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + objectClass);

        for (Method method: objectClass.getMethods()) {
            System.out.println("method = " + method.getName());
        }
    }
}
