import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Escribe otro número: ");
        int n2 = scanner.nextInt();
        System.out.println("Escribe un último número: ");
        int n3 = scanner.nextInt();

        if (n2 == (n1 + 1) && n3 == (n2 + 1)) {
            System.out.println("Los números son consecutivos");
        } else {
            System.out.println("Los números no son consecutivos");
        }


    }
}
