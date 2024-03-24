public class ExampleStringMethods {
    public static void main(String[] args) {

        String name = "Carlos";     // A string is an array, or sequence of characters
        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Carlos\") = " + name.equals("Carlos"));
        System.out.println("name.equals(\"carlos\") = " + name.equals("carlos"));
        System.out.println("name.equalsIgnoreCase(\"carlos\") = " + name.equalsIgnoreCase("carlos"));
        System.out.println("name.compareTo(\"Carlos\") = " + name.compareTo("Carlos"));
        System.out.println("name.compareTo(\"Aron\") = " + name.compareTo("Aron"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(0) = " + name.charAt(2));
        System.out.println("name.charAt(0) = " + name.charAt(name.length() - 1));

        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1, 4) = " + name.substring(1, 4));
        System.out.println("name.substring(name.length() - 2) = " + name.substring(name.length() - 2));

        String homeWork = "homeWork";
        System.out.println("homeWork = " + homeWork.replace("o", "."));   // immutable because it generates a new instance but the original does not change
        System.out.println("homeWork = " + homeWork);
        System.out.println("homeWork.indexOf('e') = " + homeWork.indexOf('o'));     // delivers first position
        System.out.println("homeWork.lastIndexOf(\"o\") = " + homeWork.lastIndexOf("o"));
        System.out.println("homeWork.indexOf('Work') = " + homeWork.indexOf("Work"));     // if the value is < than 0, ti's because the value not exist
        System.out.println("homeWork.contains(\"Work\") = " + homeWork.contains("Work"));
        System.out.println("homeWork.startsWith(\"home\") = " + homeWork.startsWith("home"));
        System.out.println("homeWork.endsWith(\"ork\") = " + homeWork.endsWith("ork"));
        System.out.println("  homeWork  ");
        System.out.println("  homeWork  ".trim());


    }
}
