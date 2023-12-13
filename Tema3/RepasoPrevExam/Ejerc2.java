package RepasoPrevExam;

import java.util.Scanner;

public class Ejerc2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*if (calcularRectangulo() >= 0){
            System.out.println("El resultado es " + calcularRectangulo());
        }else {
            System.out.println("Porfavor, introduce valores apropiados.");
        }*/
        calcularRectangulo();
    }
    public static int calcularRectangulo(){
        System.out.println("Introduce la base de un rectangulo: ");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura del rectangulo");
        int altura = scanner.nextInt();
        solicitarNumero("Porfavor ingresa valores apropiados.",1,1000);

        int result = (base * 2) + (altura * 2);
        return result;
    }
    public static int solicitarNumero(String mensaje, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
            if (numero < min || numero > max) System.out.println("Los valores no son posibles. Vuelve a introducir el numero correcto");
        } while (numero < min || numero > max);
        return numero;
    }

}
