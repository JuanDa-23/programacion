package RepasoPrevExam;

import java.util.Scanner;

public class Ejerc2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int check = calcularRectangulo();
        if (check >= 0){
            System.out.println("El resultado es " + check);
        }else {
            System.out.println("Porfavor, introduce valores apropiados.");
        }

    }
    public static int calcularRectangulo(){
        System.out.println("Introduce la base de un rectangulo: ");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura del rectangulo");
        int altura = scanner.nextInt();

        int result = (base * 2) + (altura * 2);
        return result;
    }

}
