public class PrimitivesBolean {
    public static void main(String[] args) {

        boolean logicDate = true;
        System.out.println("logicDate = " + logicDate);

        double d = 98765.43e-3;     // 98.76543
        System.out.println("d = " + d);
        
        float f = 1.2345e2F;     // 123.45
        System.out.println("f = " + f);

        logicDate = d < f;
        System.out.println("logicDate = " + logicDate);

        boolean isEqual = (3 - 3 == 1);
        System.out.println("isEqual = " + isEqual);

        
    }
}
