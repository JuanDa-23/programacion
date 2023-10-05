import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número:");
        double n1 = scanner.nextDouble();
        System.out.println("Escribe otro número:");
        double n2 = scanner.nextDouble();

        double resultsuma = (n1 + n2);
        System.out.println("La suma da: " + resultsuma);
        double resultresta = (n1 - n2);
        System.out.println("La resta da: " + resultresta);
        double resultmulti = (n1 * n2);
        System.out.println("La multiplicación da: " + resultmulti);
        double resultdivision = (n1 / n2);
        System.out.println("La división da: " + resultdivision);
        double resultresto = (n1 % n2);
        System.out.println("El resto es: " + resultresto);
    }
}
