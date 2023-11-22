import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero y te diré si es primo o no");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
        }
    }

