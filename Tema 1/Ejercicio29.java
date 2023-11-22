import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Random random = new Random();
        int secreto = random.nextInt(1, 100);
        Scanner in = new Scanner(System.in);
        System.out.println("Adivina el número secreto, se encuentra entre el 1 y el 100");
        int i = in.nextInt();
        while (secreto != i) {
            if ((i > secreto)) {
                System.out.println("Tu número es mayor");
            } else {
                System.out.println("Tu número es menor");
            }
            System.out.println("Inténtalo denuevo:");
            i = in.nextInt();
        }
        System.out.println("¡Genial! El número secreto es " + i + ".");
    }
}



