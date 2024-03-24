public class StringExampleConcatenation {
    public static void main(String[] args) {

        String course = "Java programming";
        String professor = "Carlos Diaz";

        String detail = course + " with the student " + professor;
        System.out.println(detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + (numberA + numberB));       // use parentheses to take precedence in execution

        System.out.println(numberA + numberB + detail);
        
        String detail2 = course.concat(" with ".concat(professor));     // use the operator or concat method
        System.out.println("detail2 = " + detail2);
    }
}
