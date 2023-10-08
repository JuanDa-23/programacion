import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la hora: ");
        int h1 = scanner.nextInt();
        System.out.println("Escribe los minutos: ");
        int m2 = scanner.nextInt();
        System.out.println("Escribe los segundos: ");
        int s3 = scanner.nextInt();

        System.out.println("La hora es: " + h1 + ":" + m2 + ":" + (s3 + 1));

    }


}


