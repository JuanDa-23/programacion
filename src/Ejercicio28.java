import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número tiene 5 intentos:  ");
        int randomInt = random.nextInt(100000);

        int i = 0;
        while (i < 4) {
            int number = scanner.nextInt();

            if (number != randomInt) {
                System.out.println("Intentalo de nuevo");
            } else {
                System.out.println("Enorabuena, has ganado la loteria");
                if (i == 4) {
                    System.out.println("Otra vez será");
                }
            }
        }
        i++;

    }
}



