public class instanceOfOperator {
    public static void main(String[] args) {

        String text = "create an object of the String class ... nice";
        Integer num = 7;

        Boolean b1 = text instanceof String;        // Object parent class of all objects
        System.out.println("text is of the type String  = " + b1);

        b1 = text instanceof Object;
        System.out.println("text is of the type Object  = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num is of the type Integer  = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is of the type Number  = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is of the type Object  = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal is of the type Number  = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 is of the type Boolean  = " + b1);


    }
}
