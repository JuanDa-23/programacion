import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a calcular la superficie y el perímetro de un cuadrado.");
        System.out.println("Escriba cuanto mide el lado del cuadrado: ");
        double l1 = scanner.nextDouble();

        System.out.println("La superficie del cuadrado es: " + l1 * l1);
        System.out.println("El area del cuadrado es: " + l1 * 4);

    }
}
