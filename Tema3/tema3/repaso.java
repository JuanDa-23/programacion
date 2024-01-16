package tema3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Introduce un número : ");
        int n1 = in.nextInt();
        System.out.println("Introduce otro número : ");
        int n2 = in.nextInt();
        System.out.println("Introduce el calculo que desee hacer: (S = +, R = -, M = *, D = /, A = % o E = Salir)");
        int option = in.nextInt();

        while (option != 6) {
            switch (option) {
                case (1):
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
                case 5:
                    System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
                    break;
            }

        }
    }
}
