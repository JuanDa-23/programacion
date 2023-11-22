import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la altura del triángulo: ");
        double a1 = scanner.nextDouble();
        System.out.println("Escriba la base del triángulo: ");
        double b2 = scanner.nextDouble();
        System.out.println("La superficie del triángulo es: " + (b2 * a1)/2);


    }
}
