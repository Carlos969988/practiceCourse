public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] integers = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15};

        int sum = 0;

        for (Integer i: integers) {
            if (i.intValue() % 2 == 0) {
                sum += i.intValue();
            }
        }
        System.out.println("sum = " + sum);

        sum = 0;

        for (Integer i: integers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);

    }
}
