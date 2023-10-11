import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        System.out.println(randomInt);

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int intentos = 5;
        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": Ingrese un número: ");

            if (numero == randomInt) ;
            System.out.println("¡¡¡ENORABUENA!!!");
            System.out.println("Has ganado la loteria");
            break;
          /*  }else{
                System.out.println("Otra vez será");
            */
        }
        }
    }


