import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el número del mes:");
        int m1 = scanner.nextInt();
        System.out.println("Dime el año:");
        int a1 = scanner.nextInt();

        if (m1 >= 1 && m1 <= 12) {
            switch (m1) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes dura 30");
                case 2:
                    if ((a1 % 4 == 0 && a1 % 100 != 0) || (a1 % 400 == 0)) {
                        System.out.println("El mes dura 29");
                    } else {
                        System.out.println("El mes dura 28");
                    }
                    break;
                default:
                    System.out.println("El mes dura 31");
                    break;

            }


        }

    }}