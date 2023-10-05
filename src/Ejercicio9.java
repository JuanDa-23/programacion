import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número:");
        int n1 = scanner.nextInt();
        System.out.println("Escribe otro número:");
        int n2 = scanner.nextInt();

        int resultsuma = (n1 + n2);
        System.out.println("La suma da: " + resultsuma);
        int resultresta = (n1 - n2);
        System.out.println("La resta da: " + resultresta);
        int resultmulti = (n1 * n2);
        System.out.println("La multiplicación da: " + resultmulti);
        int resultdivision = (n1 / n2);
        System.out.println("La división da: " + resultdivision);
        int resultresto = (n1 % n2);
        System.out.println("El resto es: " + resultresto);
    }
}
