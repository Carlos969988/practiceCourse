public class StringExampleTestPerformanceConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);    // StringBuilder is mutable
        long start = System.currentTimeMillis();

        for (int i =0; i < 100000; i ++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 -> 3ms
            // c += a + b + "\n";  // 500  -> 28 ms
             sb.append(a).append(b).append("\n");        // 500 -> 1ms
;        }

        long end = System.currentTimeMillis();
        System.out.println(end -start);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
