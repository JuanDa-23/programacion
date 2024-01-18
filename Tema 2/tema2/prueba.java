package tema2;

import tema3.Ejercicio1;

import java.util.Scanner;

public class prueba {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la letra para elegir el ejercicio: ");
        char letter = in.next().toLowerCase().charAt(0);

        System.out.println("0) SALIR.\n" +
                "a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.\n" +
                "x) SALIR");

            showMenu(letter);
    }

    public static char showMenu(char letter) {
        int result = 0;
        switch (letter) {
            case 'a':
                Ejercicio1.main();
                break;
            case 'b':

                break;
            case 'c':

                break;
            case 'd':

                break;
            case 'e':

                break;
            case 'f':

                break;
            case 'g':

                break;
            case 'h':

                break;
            case 'i':

                break;
            case 'x':

                break;
            default:
                System.out.println("Introduce un carácter: ");
        }


        return result;
    }
}

