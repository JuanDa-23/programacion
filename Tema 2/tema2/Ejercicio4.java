package tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Introduce el dinero e indica conversión desea Euros (E) o Dolares (D) ");
        public static void showMenu(){
            Scanner scanner = new scanner(System.in);
        }
        System.out.println("E. convertir de euros a dolares");
        System.out.println("D. convertir de dolares a euros");
        System.out.println("Elige E o D");

        int money;
        money = scanner.nextInt();


        if (money == ) {
            System.out.println(dolar2Euro(money));
        }
        if (money == ){
            System.out.println(euro2Dolar(money));
        }
        System.out.println(showMenu(money));
    }

    public static double showMenu(int money) {
        return money;
    }
    public static double euro2Dolar(double money) {
        return euro2Dolar(1.0662 * money);
    }
    public static double dolar2Euro(double money) {
        return dolar2Euro(0.9319 * money);
    }
}