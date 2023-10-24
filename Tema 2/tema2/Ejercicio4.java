package tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        showMenu();
    }

    public static double showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dinero: ");
        int money = scanner.nextInt();
        System.out.println("Elige E (para pasar a euros) o D (para pasar a dolares) ");
        String choice = scanner.nextLine();

        if (choice.equals("D") || choice.equals("d")) {
            System.out.print("Introduce la cantidad en Euros: ");
            double euros = scanner.nextDouble();
            double dollars = euro2Dollar(euros);
            System.out.println(euros + " Euros equivalen a " + dollars + " Dólares.");
        } else if (choice.equals("E") || choice.equals("e")) {
            System.out.print("Introduce la cantidad en Dólares: ");
            double dollars = scanner.nextDouble();
            double euros = dollar2Euro(dollars);
            System.out.println(dollars + " Dólares equivalen a " + euros + " Euros.");
        } else {
            System.out.println("Opción no válida. Debes elegir E o D.");
        }
        return money;
    }

    public static double euro2Dollar(double money) {
        return euro2Dollar(1.0662 * money);
    }

    public static double dollar2Euro(double money) {
        return dollar2Euro(0.9319 * money);
    }
}