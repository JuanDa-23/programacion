import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Escribe la cara de un dado:  ");
        int dice = in.nextInt();

        if (dice > 0 && dice < 7) {
            int resultado;
            resultado = (7 - dice);
            System.out.println("Su cara opuesta es: " + resultado);

        } else {
            System.out.println("ERROR: Número incorrecto.");
        }
    }
}
