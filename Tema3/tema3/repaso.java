package tema3;

import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el tamaño: ");
        int number = in.nextInt();
        System.out.println("Introduce la letra: ");
        char caracter = in.next().charAt(0);
        madeTringle(number, caracter);
    }

    public static void madeTringle(int number, char character) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(character);
            }
            System.out.println();
        }


    }
}


