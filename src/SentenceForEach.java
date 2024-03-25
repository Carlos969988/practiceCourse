import javax.swing.*;
import java.util.Scanner;

public class SentenceForEach {      // sentence is only to arrays
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numbers) {
            System.out.println("num = " + num);
        }

        String[] names = {"Carlos", "Juan", "Ana", "Maria", "Denise", "Guadalupe", "Patricia", "Esteban"};

        for(String name: names) {
            System.out.println("name = " + name);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar:");
        int cantidadNumeros = scanner.nextInt();

        int menorNumero = Integer.MAX_VALUE; // Inicializamos con un valor muy grande para asegurar que se actualice correctamente

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número entero #" + (i + 1) + ":");
            int numero = scanner.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("El número menor es: " + menorNumero);

        if (menorNumero < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

    }

}
