import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Escribe un segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Escribe un tercer número: ");
        int n3 = scanner.nextInt();

        int maximum = n1;
        int minimum = n1;
        int middle = 0;

        if (n2 > maximum) maximum = n2;
        if (n3 > maximum) maximum = n3;
        if (n2 < minimum) minimum = n2;
        if (n3 < minimum) minimum = n3;
        middle = n1 + n2 + n3 - minimum - maximum;

        System.out.println(maximum + " > " + middle + " > " + minimum);
        }



    }

