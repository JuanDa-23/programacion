package tema2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        showTableMultiplication(number);
    }


    public static void showTableMultiplication(int number) {

        int result = 1;
        for (number = 1; number < 10; number++)
            Ejercicio5.showMultiplication(number);
            for (int i = 1; i <= 10; i++) {
                result = i * number;
                System.out.println(i + " x " + number + " = " + result);

            }

    }

}
