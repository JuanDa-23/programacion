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



    }

    public static void creatArray() {
        System.out.println("Introduce los valores del array: ");
        for (int i = 0; i < array.length; i++) {
           array[i] = in.nextInt();
        }

    }
    public static int maxArray(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int minArray(int array[]){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}



