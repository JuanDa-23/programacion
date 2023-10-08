import java.util.Scanner;

public class Condicional17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vamos a calcular superficies y perimetros");
        System.out.println();
        System.out.print("Pulsa 0 para calcular el cuadrado, 1 para calcular el rectangulo o 2 para calcular el triangulo ");

        String option = scanner.next();
        double zero;
        double uno;
        double dos;
        switch (option) {
            case "0":
                System.out.print("Has elegido el cuadrado, indica cuanto mide su lado: ");
                double l1 = scanner.nextDouble();
                System.out.println("La superficie de dicho cuadrado es: " + (l1 * l1) + " y el perímetro es: " + (l1 * 4));
                break;
            case "1":
                System.out.print("Has elegido el rectangulo, indica cuanto mide su base: ");
                double b1 = scanner.nextDouble();
                System.out.print("Y su altura: ");
                double a1 = scanner.nextDouble();
                System.out.println("La superficie del rectángulo es: " + (b1 * a1) + " y el perímetro es: " + 2 * (b1 + a1));
                break;
            case "2":
                System.out.print("Has elegido el triangulo, indica cuanto mide su base: ");
                double basetriangulo = scanner.nextDouble();
                System.out.print("Y su altura: ");
                double alturatriangulo = scanner.nextDouble();
                System.out.println("La superficie del circulo es: " + (2 / basetriangulo * alturatriangulo) + " y el perímetro es: " + (basetriangulo * 3));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}