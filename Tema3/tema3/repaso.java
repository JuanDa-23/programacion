package tema3;

import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);
    static int[] array = new int[6];

    public static void main(String[] args) {
        //System.out.println("Introduce la letra para elegir el ejercicio: ");
        //char letter = in.next().toLowerCase().charAt(0);

        creatArray();
        System.out.println(maxArray(array));
        System.out.println(minArray(array));
        System.out.println(mediaArray(array));
        System.out.println(existeArray(array));
        //System.out.println(sumaArrays(array));
    }

    public static void creatArray() {
        System.out.println("Introduce los valores del array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

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
   /* public static int[] sumaArrays(int[] array) {
        System.out.println("Introduce los valores de otra Array: ");
        int array2[] = new int[array.length];
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
         result[i] = array[i] + array2[i];
         //¿Por qué 4 = 3 + 1 es correcto, pero 1 + 3 = 4 no?
        }
      return result;
    }*/

}



