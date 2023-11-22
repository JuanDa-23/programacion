import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int a = scanner.nextInt();
        System.out.println("Introduce otro número");
        int b = scanner.nextInt();

        if (b > a) {
            System.out.println("Números impares entre " + a + " y " + b + ":");
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("B no es mayor que A.");
        }
    }
}
