import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
            // TODO: el radio podría ser real (con decimales), 2.5 por ejemplo
            Scanner in = new Scanner (System.in);
            System.out.println("Escribe el radio del circlo: ");
            int radio = in.nextInt();
            double area = 3.14 * radio * radio;
            System.out.println("El area del circulo es: " + area);

        }

}

