import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pon el primer número: ");
        int n1 = scanner.nextInt();
        System.out.println("Pon el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Pon el tercer número: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }

    }
}
