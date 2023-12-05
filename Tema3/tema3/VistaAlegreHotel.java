package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class VistaAlegreHotel {
    static int[] arrayHotel = new int[20];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Selecciona un número de habitación(1-20): ");
        int number = in.nextInt();

        if (number < 1 || number > 20) {
            System.out.println("Número de habitación inválido. Debe estar entre 1 y 20.");
            return;
        }
        number--;

        System.out.println("Selecciona la frecuencia (1-6): ");
        int frequency = in.nextInt();

        if (frequency < 1 || frequency > 6) {
            System.out.println("Frecuencia inválida. Debe estar entre 1 y 6.");
            return;
        }

        arrayHotel[number] = frequency;
        int pre =  number;
        int post = number;
        for (int i = frequency - 1; i > 0; i--) {

            if (pre > 0 &&  pre <= 20) {
                pre--;
                arrayHotel[pre] = i;
            }
            if (post >= 0 && post < 20) {
                post++;
                arrayHotel[post] = i;
            }

            /*int distance = Math.abs(number - i + 1);
            arrayHotel[i] = Math.max(0, frequency - distance);
           */
        }
        System.out.println(Arrays.toString(arrayHotel));
    }
}
