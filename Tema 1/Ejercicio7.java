import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Escribe otro número: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("El resultado del mayor entre el menor es: " + (n1 - n2));

        }else{
            System.out.println("El resultado del mayor entre el menor es: " + (n2 - n1));

        }

    }
}
