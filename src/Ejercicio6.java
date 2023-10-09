import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int n1 = scanner.nextInt();
        if (n1 > 0) {
            System.out.println("El número es positivo");
        } else if (n1 < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");

        }

    }


}
