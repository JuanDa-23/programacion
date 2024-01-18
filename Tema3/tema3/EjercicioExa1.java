package tema3;

import java.util.Scanner;

public class EjercicioExa1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce las respuestas correctas del examen : ");
        System.out.println("a = 1 \n" +
                "b = 2 \n" +
                "c = 3\n" +
                "d = 4");
        System.out.println("(x para salir)");
        guardarRespuestas();

    }

    public static int[] guardarRespuestas() {
        System.out.print("Tamaño del array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        System.out.println(array);
        return array;
    }



}
