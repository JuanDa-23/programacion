import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número secreto entre 1 y 100 (Te iré dando pistas). ");

        while (true) {
            int randomInt = random.nextInt(100);
            int number = scanner.nextInt();

            if (number != randomInt) {

            } else if (number > randomInt) {
                System.out.println("El número secreto se es menor al introducido; vuelva a intentarlo ");
            } else {
                System.out.println("El número secreto se es mayor al introducido; vuelva a intentarlo ");

                System.out.println("Correcto, el número secreto era: " + randomInt);
                break;
            }
        }
    }
}

