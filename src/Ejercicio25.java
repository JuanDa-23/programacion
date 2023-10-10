import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introcude un número entero positivo para calcular su factorial:");
        int Numero = scanner.nextInt();
        int factorial = 1;
            if (Numero < 0) {
                System.out.println("ERROR: Introduce un número entero positivo.");
            } else {
                for (int i = 1; i <= Numero; i++) {
                    factorial = factorial * i;
                }
                System.out.println("El factorial del número es " + factorial + ".");
            }
        }
    }
