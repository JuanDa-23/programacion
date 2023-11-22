package tema3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        array [0] = 0;
        for (int i = 0; i < array.length; i++) {
                array[i] = i;
            System.out.println(array[i]);
        }
    }
}
