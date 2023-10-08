import java.util.Scanner;

public class Condicional16 {
    public static void main(String[] args) {
        final double euroExchangeRate = 1.06;
        final double dollarExchangeRate = 0.96;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Convertir a euros (E) o a dólares (D):");
        String option = scanner.next();
        double euros;
        double dollars;
        switch (option) {
            case "D":
                System.out.print("Escribe una cantidad en €:");
                euros = scanner.nextDouble();
                dollars = euros * euroExchangeRate;
                System.out.println("Son " + dollars + "$");
                break;
            case "E":
                System.out.print("Escribe una cantidad en $:");
                dollars = scanner.nextDouble();
                euros = dollars * dollarExchangeRate;
                System.out.println("Son " + euros + "€");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}



