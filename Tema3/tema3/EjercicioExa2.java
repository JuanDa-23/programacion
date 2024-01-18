package tema3;

import java.util.Scanner;

public class EjercicioExa2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        leerAlumnos();
        int estudiante = in.nextInt();
        int nota = in.nextInt();

        if (nota == -1) {
            System.out.println("Saliste.");
        } else if (nota >= 0 && nota <= 10) {
            nota = (nota * 50) / 10;
            System.out.println("El alumno: " + estudiante + " ha sacado un " + nota + " sobre 50");
        } else {
            System.out.println("Introduce los números validos. ");
        }


    }

    public static void leerAlumnos() {
        System.out.println("Introduce el número del estudiante: ");
        System.out.println("Introduce la nota sobre 10 o pulsa (-1) para salir:  ");

    }

}


