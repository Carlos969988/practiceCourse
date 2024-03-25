import javax.swing.*;

public class SentenceForArray {
    public static void main(String[] args) {

        String[] names = {"Carlos", "Juan", "Ana", "Maria", "Denise", "Guadalupe", "Patricia", "Esteban"};
        int count = names.length;

        for (int i = 0; i < count; i++ ) {
            if (names[i].toLowerCase().contains("CaRlOs".toLowerCase()) ||      // also permit equals method
                    names[i].toLowerCase().contains("ESTEBAN".toLowerCase())) {
                    continue;
            }
            System.out.println( i + ".-" + names[i]);
        }

        String search = JOptionPane.showInputDialog("Enter a name, example \"Carlos\" or \"Denise\":");
        System.out.println("search = " + search);

        boolean find = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                find = true;
                break;
            }
            System.out.println("names = " + names[i]);
        }
        if (find) {
            JOptionPane.showMessageDialog(null, search + " was found !!!");
        } else {
            JOptionPane.showMessageDialog(null, search + " doesn't exist in the system !!!");
        }
    }
}
