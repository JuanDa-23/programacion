package tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige E (para convertir en euros) o D (para convertir a dolares): ");
        String choice = scanner.nextLine();
        System.out.println("Introduce el dinero: ");
        int money = scanner.nextInt();

        if (choice.equals("E")) {
            System.out.println("Tus dolares son: " + dolar2Euro(money) + " euros");
        } else if (choice.equals("D")) {
            System.out.println("Tus euros son: " + euro2Dolar(money) + " dolares");
        }

        // System.out.println(showMenu(money));//
    }

    public static double showMenu(int money) {
        return money;
    }

    public static double euro2Dolar(double money) {
        double result = money;
        return euro2Dolar(1.0662 * money);
    }

    public static double dolar2Euro(double money) {
        double result = money;
        return dolar2Euro(0.9319 * money);
    }
}