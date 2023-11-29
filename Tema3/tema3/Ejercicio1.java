package tema3;

import java.util.Scanner;

public class Ejercicio1 {
    static int[] array1 = new int[]{0, 1, 2, 3, 4, 5};
    static  int[] array2 = new int[]{7, 5, 9, 0, 8, 3};
    static  int[] array3 = new int[]{0, 0, 0, 0, 0, 0};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showArray();
        System.out.println("_______".repeat(20));
        System.out.println("El número máximo es " + maxArray(array1));
        System.out.println("_______".repeat(20));
        System.out.println("El número mínimo es " + minArray(array1));
        System.out.println("_______".repeat(20));
        System.out.println("La media es de " + mediaArray(array1));
        System.out.println("_______".repeat(20));
        existeArray(array1);
        System.out.println("_______".repeat(20));
    }

    public static void showArray() {
        array1[0] = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
            System.out.println(array1[i]);
        }
    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public static int mediaArray(int[] array) {
        int sumatory = array[0];
        for (int i = 0; i < array.length; i++) {
            sumatory += array[i] / 2;
        }
        return sumatory;
    }

    public static void existeArray(int[] array) {
        array[0] = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println("Introduce un valor:");
            int number = scanner.nextInt();
            if (number == i) {
                System.out.println("El número existe.");
            } else {
                System.out.println("El número no existe.");

            }
        }
    }

    public static int[] sumaArray(int[] array1, int[] array2) {
        int[] result = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
            result[i] = array1[i] + array2[i];
        }
        return result;

    }
}
