package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixEj1 {
    static Scanner scanner = new Scanner(System.in);
   // static int[][] Matrix1 = scanner.nextInt();
    public static void main(String[] args) {
     creatMatrix();
        System.out.println();
     maxMatrix(Matrix1);



    }
      public static int[][] creatMatrix() {
        System.out.println("Introduce los valores de la matriz: ");

        int[][] Matrix1 = new int[4][4];
        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[0].length; j++) {
                System.out.print("Valor " + i + " " + j + ": ");
                Matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(Matrix1));
        return Matrix1;
      }

      public static int maxMatrix(int[][] matrix){
          int max = matrix[][];
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[0].length; j++) {
                  if (matrix[i][j] > max){
                      max = matrix[i][j];
                  }
              }
          }
          return max;
      }
}




   /* public static void creatMatrix(int[][] Matrix1) {
        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[i].length; j++) {
                System.out.print(Matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(Matrix1));
    }*/
