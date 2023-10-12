import java.util.Scanner;

public class Proyect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Game\nIntroduce un número del 1 al 200, para asignar valor a los atributos.\nLa suma total de los atributos introducidos no puede superar los 500 puntos");

        System.out.println("Introduce los puntos de Velocidad: ");
        int pointV = scanner.nextInt();
        System.out.println("Introduce los puntos de Ataque: ");
        int pointA = scanner.nextInt();
        System.out.println("Introduce los puntos de Defensa: ");
        int pointD = scanner.nextInt();
        System.out.println("Introduce los puntos de Vida: ");
        int pointL = scanner.nextInt();
        if ((pointV + pointA + pointD + pointL < 500) && (pointV <= 200 || pointA <= 200 || pointD <= 200 || pointL <= 200)) {
            System.out.println("Correcto, sigamos con el juego");
        }else {
            System.out.println("Error, vuelve a introducir los puntos ");

            //Condiciones: ·El más rápido empieza, ·Los criticos, ·

            }

        }

    }


