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

    public static void madeTringle(int number, char caracter) {
        for (int i = 0; i < number; i++) {
            System.out.println(caracter + " ".repeat(number) + "\n");


        }


    }
}


