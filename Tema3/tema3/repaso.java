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
        showMenu();
        int option = in.nextInt();
        switch (option) {
            case 1:
               showArray(array);
               break;
            case 2:
                System.out.println(maxArray(array));
                break;
            case 3:
                System.out.println(minArray(array));
                break;
            case 4:
                System.out.println(mediaArray(array));
                break;
            case 5:
                System.out.println(existeArray(array));
                break;
            case 6:
                System.out.println(Arrays.toString(sumaArrays(array, array2)));
                break;
            case 7:
                System.out.println(Arrays.toString(restaArrays(array, array2)));
                break;
            case 8:
                System.out.println(escalarArrays(array, array2));
                break;
            case 9:
                System.out.println(Arrays.toString(invertirArrays(array)));
                break;
            case 10:
                System.out.println(esCapicua(array));
                break;
            case 0:
                System.out.println("Saliste");
                break;
            default:
                System.out.println("Introduce un número valido.");
        }





    }

    public static void showMenu() {
        System.out.println("Escribe el número según lo que quieras:\n" +
                "1) Imprimir el array\n" +
                "2) Máximo de tu array\n" +
                "3) Mínimo de tu array\n" +
                "4) Media de tu array\n" +
                "5) ¿Existe el valor en tu array?\n" +
                "6) Suma de dos vectores\n" +
                "7) Resta de dos vectores\n" +
                "8) Producto esclar de dos vectores\n" +
                "9) Invertir el numero de un array\n" +
                "10) Indica si el array es capicua o no\n" +
                "0) Salir");


    }
    public static void showArray(int array[]) {
        array[0] = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
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

    public static int[] restaArrays(int[] array, int[] array2) {
        int[] result = new int[array.length];
        if (array2.length == array.length) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] - array2[i];
            }
        }
        return result;
    }

    public static int escalarArrays(int[] array, int[] array2) {
        int[] mult = new int[array.length];
        int result = 0;
        if (array2.length == array.length) {
            for (int i = 0; i < array.length; i++) {
                mult[i] = array[i] * array2[i];
            }
            for (int i = 0; i < array.length; i++) {
                result += mult[i];

            }
        }
        return result;
    }

    public static int[] invertirArrays(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = (array.length - 1) - i;
            int a = array[i];
            array[i] = array[j];
            array[j] = a;
        }

        return array;
    }

    public static boolean esCapicua(int[] array) {
        boolean capicua = false;
        for (int i = 0; i < array.length / 2; i++) {
            int j = (array.length - 1) - i;
            if (array[i] == array[j]) {
                capicua = true;
            }

        }
        return capicua;
    }
}


// 4 = 3 + 1 es correcto
//.toString => hacer el Array bonito
//if (array2.length == array.length) => igualar indices
/*funcion int[] = me devuelve un array
funcion int (pero uso arrays) = devuelve enteros
 */
