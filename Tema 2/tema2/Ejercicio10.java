package tema2;

import java.util.Scanner;

public class Ejercicio10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~MENÚ~");
        System.out.println("Introduce el número del ejercicio que desee:");
        int exercicie;
        do {
            showMenu();
            exercicie = in.nextInt();

            switch (exercicie) {
                case 1:
                    Ejercicio1.main(args);
                    break;
                case 2:
                    Ejercicio2.main(args);
                    break;
                case 3:
                    Ejercicio3.main(args);
                    break;
                case 4:
                    Ejercicio4.main(args);
                    break;
                case 5:
                    Ejercicio5.main(args);
                    break;
                case 6:
                    Ejercicio6.main(args);
                    break;
                case 7:
                    Ejercicio7.main(args);
                    break;
                case 8:
                    Ejercicio8.main(args);

                    break;
                case 9:
                    Ejercicio9.main(args);
                    break;
                default:
                    System.out.println("Has salido");
            }
        }
        while (exercicie != 0);
        {
        }

    }

    public static char showMenu() {
        System.out.println("0) SALIR.\n" +
                "1) Muestra el signo de un número introducido por el usuario.\n" +
                "2) Indica si el usuario es mayor de edad o no.\n" +
                "3) Calcula el área y perímetro de un círculo.\n" +
                "4) Conversor de euros a dólares y de dólares a euros.\n" +
                "5) Mostrar tabla de multiplicar de un número.\n" +
                "6) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "7) Comprobador de números primos.\n" +
                "8) Comprobador de fechas.\n" +
                "9) Dibujar triángulos.");

        char menu = in.next().charAt(0);
        return menu;
    }

}

