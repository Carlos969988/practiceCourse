public class OperatorsPresence {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double average = (i + j + k) / 3d;
        System.out.println("average = " + average);

        average = (i + j + k) / 3d * 10;
        System.out.println("average = " + average);

        average = --i + j++ + k / 3d * 10;
        System.out.println("average = " + average);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
    }
}
