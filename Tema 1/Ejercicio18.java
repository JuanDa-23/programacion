import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número y calcularemos su raiz cuadrada: ");
        double number = scanner.nextDouble();
        if (number < 0 ) {
            System.out.println("Número negativo, no se puede calcular la raiz cuadrada.");
        } else {
            double square = Math.sqrt(number);
            System.out.println("La raiz cuadrada es " + square);
        }
    }
}
