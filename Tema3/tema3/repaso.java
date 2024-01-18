package tema3;

import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Introduce la letra para elegir el ejercicio: ");
        //char letter = in.next().toLowerCase().charAt(0);
            creatArray();
    }

    public static void creatArray() {
        System.out.println("Introduce los valores del array: ");
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
           array[i] = in.nextInt();
        }

    }
}



