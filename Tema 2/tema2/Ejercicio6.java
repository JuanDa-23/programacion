package tema2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        showTableMultiplication(number);
    }


    public static void showTableMultiplication(int number) {


        for (number = 1; number < 10; number++)
            Ejercicio5.showMultiplication(number);

    }

}
