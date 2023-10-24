package tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número y te mostraré sus multiplicaciones: ");
        int number = scanner.nextInt();
        System.out.println(multiplyNumber(number));
    }

    public static void multiplyNumber(int number) {
        int i = 1;
        while (i <= 10) {
            int result = number * i;
            return result;
            i++;
        }

    }
}
