import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Los 20 primeros números primos son: ");

        int cantidadPrimos = 20;
        int numero = 2;
        while (cantidadPrimos > 0) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                cantidadPrimos--;
            }
            numero++;
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