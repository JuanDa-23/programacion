import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cantidadNumeros = 0;

        while (true) {
            System.out.print("Introduce un número entero positivo o un número negativo para salir: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }

            suma += numero;
            cantidadNumeros++;
        }

        scanner.close();
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

    }
}
