package tema3;

import java.util.Random;
import java.util.Scanner;

public class AtrapaMosca {
    static int[] arrayFly = new int[16];
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        arrayFly = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Busca la mosca! Pon un número del 0 al 15: ");
        boolean cazada = false;
        while (!cazada) {
            int posicion = random.nextInt(15);
            int[] arrayMosca = arrayFly.clone();
            int numero = in.nextInt();
            arrayMosca[posicion] = 1;
            if (arrayMosca[numero] == 1) {
                System.out.println("Has cazado a la mosca!");
                cazada = true;
            } else {
                System.out.println("La mosca cambio de ubicación");
            }
        }

    }
}