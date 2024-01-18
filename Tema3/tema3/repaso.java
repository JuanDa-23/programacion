package tema3;

import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Introduce la letra para elegir el ejercicio: ");
        //char letter = in.next().toLowerCase().charAt(0);
        readOption();
        char option;
        option = in.next().charAt(0);

        switch (option) {
            case 'a':
                System.out.println("Ejercicio2.main()");
                break;
            case 'b':
                System.out.println("Ejercicio.main()");
                break;
            case 'c':
                System.out.println("Elegiste: Corregir examen. ");
                break;
            case 'd':
                System.out.println("Elegiste: Introducir notas ciclo. ");
                break;
            default:
                System.out.println("Saliste ");


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



