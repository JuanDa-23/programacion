package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Introduce la letra para elegir el ejercicio: ");
        //char letter = in.next().toLowerCase().charAt(0);

        int[] array = createArray(6);
        int[] array2 = createArray(6);

        System.out.println(maxArray(array));
        System.out.println(minArray(array));
        System.out.println(mediaArray(array));
        System.out.println(existeArray(array));
        System.out.println(Arrays.toString(sumaArrays(array, array)));


    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        System.out.println("Introduce los valores del array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;

    }

    public static int maxArray(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minArray(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int mediaArray(int array[]) {
        int suma = array[0];
        for (int i = 0; i < array.length; i++) {
            suma += array[i] / 2;

        }
        return suma;
    }

    public static boolean existeArray(int array[]) {
        System.out.println("Introduce un valor: ");
        int number = in.nextInt();
        boolean existe = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                existe = true;
            }
        }
        return existe;
    }

    public static int[] sumaArrays(int[] array, int[] array2) {
        int[] result = new int[array.length];
        if (array2.length == array.length) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] + array2[i];
            }
        }
        return result;
    }

}


// 4 = 3 + 1 es correcto