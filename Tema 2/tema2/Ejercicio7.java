package tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número te diré si es primo. Pulsa 0 para salir.");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
               System.out.println("Has salido");
            }
            if (number < 0) {
                System.out.println("Dame un numero positivo");

            } else if (isPrime(number) || number == 1) {
                System.out.println(number + " es primo.");
            } else {
                    System.out.println(number + " no es primo.");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
               return false;
            }
        }
        return true;

    }
}


