import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Introduce un número.");
            double numero1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduce la operación: (+ , - , * , / , %)");
            String operacion = scanner.nextLine();
            System.out.println("Introduce otro número.");
            double numero2 = scanner.nextDouble();
            scanner.nextLine();
            double resultado = 0;
            switch (operacion) {
                case "+":
                    resultado = (numero1 + numero2);
                    break;
                case "-":
                    resultado = (numero1 - numero2);
                    break;
                case "*":
                    resultado = (numero1 * numero2);
                    break;
                case "/":
                    resultado = (numero1 / numero2);
                    break;
                case "%":
                    resultado = (numero1 % numero2);
                    break;
                default:
                    System.out.println("ERROR: Operación no válida.");
                    break;
            }
            System.out.println("El resultado es " + resultado);
            System.out.println("Introduce 'n' si quieres dejar de calcular.");
            String decision = scanner.nextLine();
            if (decision.equals("n")) {
                seguir = false;
            }
        }
    }
}
