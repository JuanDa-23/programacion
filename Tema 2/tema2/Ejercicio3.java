package tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Te diré el perímetro y el area.\n" + "Introduce el radio de un circulo: ");
        int radius = scanner.nextInt();
        System.out.println("El perímetro es: " + calculateCirclePerimeter(radius));
        System.out.println("El area es: " + calculateCircleArea(radius));
    }
//Esto no sé que hace y como invalidar negativos//
    public static boolean validRadius (int radius) {
        return radius >= 0;
    }
    public static double calculateCirclePerimeter (int radius) {
        int result = radius;
        return 2 * Math.PI * radius;
    }
    public static double calculateCircleArea (int radius) {
       int result = radius;
        return Math.PI * Math.pow(radius, 2);
    }
}