import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int cantidadCifra = 0;
        while (numero > 0) {
            numero /= 10;
            cantidadCifra++;
        }
            System.out.println("Tiene " + cantidadCifra + " cifras");

    }
}



