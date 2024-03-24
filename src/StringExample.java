public class StringExample {
    public static void main(String[] args) {

        String course = "Java programming";
        String course2 = new String("Java programming");

        boolean isEqual = course == course2;        // compare the object, and == is only apply in primitive values not reference then is false
        System.out.println("course == course2 = " + isEqual);

        isEqual = course.equals(course2);       // compare the String value
        System.out.println("course.equals(course2) = " + isEqual);

        String course3 = "Java programming";        // when exist the object with the same String "", Java takes to compare only the course reference to save memory space
        isEqual = course == course3;
        System.out.println("course == course3 = " + isEqual);



    }
}
