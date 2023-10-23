package tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dinero, te lo pasaré de € a $ o viceversa");
        int money = scanner.nextInt();
        System.out.println(euro2Dolar(money));
        System.out.println(dolar2Euro(money));

    }

    public static void showMenu(int money) {
       // return money;//
    }
    public static double euro2Dolar(double money) {
        return euro2Dolar(1.0662 * money);
    }
    public static double dolar2Euro(double money) {
        return dolar2Euro(0.9319 * money);
    }
}