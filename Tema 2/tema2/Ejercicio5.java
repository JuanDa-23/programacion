package tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número y te mostraré sus multiplicaciones: ");
        int number = scanner.nextInt();
        if (number > 10 || number < 0) {
            System.out.println("El número no se encuentra entre el 1 y el 10");
        }else{

        }
        System.out.println(multiplyNumber(number));
    }

    public static int multiplyNumber(int number) {
        int result = 1;
        for (int i = 0; i <= 10; i++) {
            result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
        return result;
    }

}