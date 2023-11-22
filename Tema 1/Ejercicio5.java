import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pon el primer número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Pon el segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.println("Pon el tercer número: ");
        double n3 = scanner.nextDouble();

        System.out.print("Tu media es: " + (n1 + n2 + n3)/3);


    }
}
