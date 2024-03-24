public class instanceOfOperatorGenericTypes {
    public static void main(String[] args) {

        Object text = "create an object of the String class ... nice";
        Number num = Integer.valueOf(7); //7; valueOf("7");

        Boolean b1 = text instanceof String;        // Object parent class of all objects
        System.out.println("text is of the type String  = " + b1);

        b1 = text instanceof Integer;
        System.out.println("text is of the type Integer = " + b1);

        b1 = text instanceof Object;
        System.out.println("text is of the type Object  = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num is of the type Integer  = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is of the type Number  = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is of the type Object  = " + b1);

        b1 = num instanceof Long;
        System.out.println("num is of the type Long  = " + b1);

        b1 = num instanceof Double;
        System.out.println("num is of the type Double  = " + b1);

        Number decimal = Float.valueOf(45.54f);
        b1 = decimal instanceof Double;
        System.out.println("decimal is of the type Double  = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal is of the type Float  = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal is of the type Integer  = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal is of the type Number  = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 is of the type Boolean  = " + b1);


    }
}
