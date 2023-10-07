import java.util.Scanner;

public class Condicional8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a convertir tus euros a dolares");
        System.out.println("Escriba cuantos euros va a convertir: ");
        double e1 = scanner.nextDouble();

        System.out.println("Esta es la conversíon en dolares:" + (e1 * 1.06));

    }
}
