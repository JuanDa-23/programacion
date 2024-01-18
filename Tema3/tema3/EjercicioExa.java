package tema3;

import java.util.Scanner;

public class EjercicioExa {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        readOption();
        char option;
        option = in.next().toLowerCase().charAt(0);

        switch (option) {
            case 'a':
                EjercicioExa1.main(args);
                break;
            case 'b':
                EjercicioExa2.main(args);
                break;
            case 'c':
                System.out.println("Elegiste: Corregir examen. ");
                break;
            case 'd':
                System.out.println("Elegiste: Introducir notas ciclo. ");
                break;
            case 'e':
                System.out.println("Saliste");
            default:
                System.out.println("Introduce una letra correcta.");


        }
    }

    public static void readOption() {
        System.out.println("Introduce la letra que desees: \n" +
                "a) Introducir nota. \n" +
                "b) Introducir examen. \n" +
                "c) Corregir examen. \n" +
                "d) Introducir notas ciclo. \n" +
                "e) SALIR. \n");


    }
}
