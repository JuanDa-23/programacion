import java.util.Scanner;

public class Condicional14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas personas vendrán al camping?");
        int persona = scanner.nextInt();
        System.out.println("¿Cuántas noches se quedarán en el camping?");
        int noches = scanner.nextInt();

        if (persona >= 5 && noches >= 7) {
            System.out.println("Eso te costará: " + ((persona * noches) * 15) * 0.25);
        } else {
            System.out.println("Eso te costará: " + (persona * noches) * 15);

        }
    }
}
