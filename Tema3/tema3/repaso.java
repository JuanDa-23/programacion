package tema3;

import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la hora: ");
        int hora = in.nextInt();
        System.out.println("Introduce los minutos: ");
        int minuto = in.nextInt();
        System.out.println("Introduce segundo: ");
        int segundo = in.nextInt();

        if (hora <= 0 || minuto <= 0 || segundo <= 0) {
            System.out.println("ERROR");
        } else {
            System.out.println("La hora es: " + hora + ":" + minuto + ":" + (segundo + 1));
        }

        if (segundo > 60) {
            System.out.println("La hora es: " + hora + ":" + (minuto + 1) + ":" + (segundo - 60));
        } else if (minuto > 60) {
            System.out.println("La hora es: " + (hora + 1) + ":" + (minuto - 60) + ":" + segundo);
        } else if (hora > 23) {
            System.out.println("La hora es: " + (hora - 23) + ":" + minuto + ":" + (segundo + 1));
        }

    }
}
