public class ExampleStringValide {
    public static void main(String[] args) {
        String course = null;
        
        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if (isNull) {
            course = "Java Programming";
        }

        boolean isVoid = course.length() == 0;

        System.out.println("isVoid = " + isVoid);

        boolean isVoid2 = course.isEmpty();
        System.out.println("isVoid2 = " + isVoid2);

        boolean isWhite = course.isBlank();
        System.out.println("isWhite = " + isWhite);
        
        if (!isWhite) {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to course " .concat(course));

        }
    }
}
