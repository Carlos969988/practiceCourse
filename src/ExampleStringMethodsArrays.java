public class ExampleStringMethodsArrays {
    public static void main(String[] args) {
        
        String homeWork = "homeWork";
        System.out.println("homeWork.length() = " + homeWork.length());
        System.out.println("homeWork.toCharArray() = " + homeWork.toCharArray());

        char [] array=homeWork.toCharArray();
        int large = array.length;
        System.out.println("large = " + large);
        for (int i = 0; i < large; i ++) {
            System.out.println("array[i] = " + array[i]);
        }

        System.out.println();
        System.out.println("homeWork = " + homeWork.split("o"));

        String[] array2 = homeWork.split("o");
        int l = array2.length;
        for (int j = 0; j < l; j ++) {
            System.out.println(array2[j]);
        }

        String file = "some.image.pdf";
        String[] fileArt = file.split("[.]");      // also works with \\.  "it represents a regular expression"
        l = fileArt.length;
        System.out.println("l = " + l);
        for (int j = 0; j < l; j ++) {
            System.out.println(fileArt[j]);
        }
        System.out.println("extension = " + fileArt[l - 1]);
    }
}
