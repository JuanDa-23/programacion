package tema2.Tema;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dinero: ");
        int money = scanner.nextInt();
        System.out.println("Elige 1 (para convertir en euros) o 2 (para convertir a dolares): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Tus dolares son: " + dolar2Euro(money) + " euros");
        } else if (choice == 2) {
            System.out.println("Tus euros son: " + euro2Dolar(money) + " dolares");
        }
    }
    public static double euro2Dolar(double euros) {
      return 1.0662 * euros;
    }
    public static double dolar2Euro(double dollar) {
        return 0.9319 * dollar;
    }
}