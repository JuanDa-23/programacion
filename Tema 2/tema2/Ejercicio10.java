package tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~MENÚ~");
        System.out.println("Introduce el número del ejercicio que desee:");
        int exercicie = scanner.nextInt();
        do {
            switch (exercice) {
                case 1:
                    Ejercicio1.main(args);
                case 2:
                    Ejercicio2.main(args);
                case 3:
                    Ejercicio3.main(args);
                case 4:
                    Ejercicio4.main(args);
                case 5:
                    Ejercicio5.main(args);
                case 6:
                    Ejercicio6.main(args);
                case 7:
                    Ejercicio7.main(args);
                case 8:
                    Ejercicio8.main(args);
                case 9:
                    Ejercicio9.main(args);
            }
        }
        while (exercicie != 0);
        {
        }
        System.out.println(showMenu(exercicie));
    }

    public static void ShowMenu(int exercice) {
        System.out.println("0) SALIR" +
                "1) Muestra el signo de un número introducido por el usuario.\n" +
                "2) Indica si el usuario es mayor de edad o no.\n" +
                "3) Calcula el área y perímetro de un círculo.\n" +
                "4) Conversor de euros a dólares y de dólares a euros.\n" +
                "5) Mostrar tabla de multiplicar de un número.\n" +
                "6) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "7) Comprobador de números primos.\n" +
                "8) Comprobador de fechas.\n" +
                "9) Dibujar triángulos.");

    }
}

