package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixEj1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void creatMatrix(Matrix1[][]) {
        System.out.println("Introduce los valores de la matriz: ");

        int[][] Matrix1 = new int[3][3];
        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[0].length; j++) {
                System.out.print("Valor " + i + " " + j + ":");
                Matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(Matrix1));
    }


}


    /*public static int[][] creatMatrix() {
        System.out.println("Introduce los valores de la matriz: ");

        int[][] Matrix1 = new int[3][3];
        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[0].length; j++) {
                System.out.print("Valor " + i + " " + j + ":");
                Matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(Matrix1));
        return Matrix1;
    }*/

