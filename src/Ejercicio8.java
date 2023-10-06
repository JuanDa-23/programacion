import java.util.Scanner;

public class Ejercicio8 {
//odio este portatil//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número:  ");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe otro número:  ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El mayor es el primer número");
        } else if (numero2 > numero1) {
            System.out.println("El mayor es el segundo número");
        }else{
                System.out.println("Los números son iguales");
            }
        }
    }