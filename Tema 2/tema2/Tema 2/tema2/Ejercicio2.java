package tema2.Tema;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad, te diré si eres mayor de edad o no: ");
        int age = scanner.nextInt();
        System.out.println(isAdult(age));

    }

    public static int isAdult(int age) {
        int result = age;
        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");


        }
        return result;
    }
}

