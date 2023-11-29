package tema3;

import java.util.Scanner;

public class Ejercicio1 {
    static int[] array = new int[]{0,1,2,3,4,5};
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        showArray();
        System.out.println(maxArray(array));
        System.out.println(minArray(array));
        System.out.println(mediaArray(array));
        existeArray(array);

    }

    public static void showArray() {
        array [0] = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
   public static int maxArray(int[] array){
       int max = array[0];
        for (int i = 0; i < array.length; i++) {
          if (array[i] > max) {
              max = array[i];
          }

        }
       return max ;
   }
   public static int minArray(int[] array){
       int min = array[0];
       for (int i = 0; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
           }

       }
       return min;
   }
   public static int mediaArray(int[] array){
       int sumatory = array[0];
       for (int i = 0; i < array.length; i++) {
           sumatory += array[i] /2;
           }
       return sumatory;
   }

    public static void existeArray(int[] array) {
        System.out.println("Introduce un valor:");
        int number = scanner.nextInt();
        array [0] = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (number == i) {
                System.out.println("El número existe.");
            }else {
                System.out.println("El número no existe.");
                break;
            }
        }
    }
}
