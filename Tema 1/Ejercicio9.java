import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a convertir tus dólares a euros");
        System.out.println("Escriba cuantos dólares va a convertir: ");
        double d1 = scanner.nextDouble();

        System.out.println("Esta es la conversíon en euros:" + (d1 * 0.94));


    }
}
