public class LogicalOperators {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false;     // if one fails, all the expression fails
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;       // if one fails don´t worry, the expression value all params
        System.out.println("b2 = " + b2);       // if at least one is fulfilled it will return TRUE

        boolean b3 = i == j && (k > l || m == true);
        System.out.println("b3 = " + b3);

        boolean b4 = i == j || (k < l && m == true);        // the precedence of values always
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;       // and '&&' always has higher priority than or '||'
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false;     // true
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false;   // false
        System.out.println("b7 = " + b7);


    }
}
