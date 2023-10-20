package tema2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad, te diré si eres mayor de edad o no: ");
        int number = scanner.nextInt();
        System.out.println(isAdult(number));

    }

    public static int isAdult(int number) {
        int result = number;
        if (number >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");


        }
        return result;
    }
}

