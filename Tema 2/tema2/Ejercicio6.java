package tema2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        System.out.println(multiplyNumber(number));
    }


    public static int multiplyNumber(int number) {

        int result = 1;
        for (number = 1; number <= 10; number++)

            for (int i = 1; i <= 10; i++) {
                result = i * number;
                System.out.println(i + " x " + number + " = " + result);

            }
        return result;
    }

}
