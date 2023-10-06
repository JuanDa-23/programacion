import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la altura del rectangulo: ");
        double a1 = scanner.nextDouble();
        System.out.println("Escriba la base del rectangulo: ");
        double b2 = scanner.nextDouble();

        System.out.println("La superficie del rectangulo es: " + a1 * b2);

        System.out.println("La perímetro del rectangulo es: " + 2 * (a1 * b2));

    }
}
