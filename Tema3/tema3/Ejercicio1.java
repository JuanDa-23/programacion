//JMJ
package tema3;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array1 = creatArray();
        int[] array2 = creatArray();
        showMenu();
        System.out.println("Introduce un número: ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                showArray(array1);
                break;
            case 2:
                maxArray(array1);
                break;
            case 3:
                minArray(array1);
                break;
            case 4:
                mediaArray(array1);
                break;
            case 5:
                existeArray(array1);
                break;
            case 6:
                sumaArray(array1, array2);
                break;
            case 7:
                restaArray(array1, array2);
                break;
            case 8:
                System.out.println(productoArray(array1, array2));
                break;
            case 9:
                invertirArray(array1);
                break;
            case 10:
                System.out.println(capicuaArray(array1));
                break;
            case 0:
                break;
        }
    }

    public static int[] creatArray() {
        System.out.println("Introduce los valores del vector (hasta 6)");
        int[] array1 = new int[6];
        for (int i = 0; i < 6; i++) {
            array1[i] = scanner.nextInt();
        }
        return array1;
    }

    public static void showMenu() {
        System.out.println("Escribe el número segun lo que quieras:");
        System.out.println("1) Imprimir el array");
        System.out.println("2) Maximo de tu array");
        System.out.println("3) Minimo de tu array");
        System.out.println("4) Media de tu array");
        System.out.println("5) ¿Existe el valor en tu array?");
        System.out.println("6) Suma de dos vectores");
        System.out.println("7) Resta de dos vectores");
        System.out.println("8) Producto esclar de dos vectores");
        System.out.println("9) Invertir el numero de un array");
        System.out.println("10) Indica si el array es capicua o no");
    }

    public static void showArray(int[] array1) {
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

    public static boolean existeArray(int[] array) {
        System.out.println("Introduce un valor:");
        int number = scanner.nextInt();
        boolean exist = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                exist = true;
            }
        }
        return exist;
    }
    public static int[] sumaArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    public static int[] restaArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
            result[i] = array1[i] - array2[i];
        }
        return result;

    }

    public static int productoArray(int[] array1, int[] array2) {
        int result = 0;
        if (array1.length == array2.length) {
            int[] tempArray = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                tempArray[i] = array1[i] * array2[i];
            }
            for (int i = 0; i < tempArray.length; i++) {
                result +=  tempArray[i];
            }
        }

        return result;
    }


    public static int[] invertirArray(int[] array1) {
        int inicio = 0;
        int fin = array1.length - 1;

        while (inicio < fin) {
            int temp = array1[inicio];
            array1[inicio] = array1[fin];
            array1[fin] = temp;
            inicio++;
            fin--;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        return array1;
    }
    public static boolean capicuaArray(int[] array1) {
        int longitud = array1.length;
        for (int i = 0; i < longitud / 2; i++) {
            if (array1[i] != array1[longitud - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

