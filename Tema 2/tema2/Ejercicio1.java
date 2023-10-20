package tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número, te diré si es positivo, negativo o zero: ");
        int number = scanner.nextInt();
        System.out.println(numberSing(number));
    }

    public static int numberSing(int number) {
        int result = number;
        if (number < 0) {
            System.out.println("Es negativo");
        } else if (number > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("El número es 0");
        }
        return result;

    }
}