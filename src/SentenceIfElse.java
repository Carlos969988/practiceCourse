public class SentenceIfElse {
    public static void main(String[] args) {

        float average = 5.5f;

        if (average >= 6.5) {
            System.out.println("Congratulations, excellent average");
        } else if (average >= 6.0) {
            System.out.println("Very good average");
        } else if (average >= 5.5) {
            System.out.println("Good average");
        } else if (average >= 5.0) {
            System.out.println("regular, you need to try harder");
        } else if (average >= 4.0) {
            System.out.println("insufficient, you need to try harder");
        } else {
            System.out.println("reproved");
        }
        System.out.println("Your average is  = " + average);
    }
}
