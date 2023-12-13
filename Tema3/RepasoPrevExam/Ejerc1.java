package RepasoPrevExam;

import java.util.Scanner;

public class Ejerc1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        showMenu();
        int option = scanner.nextInt();
        switch (option) {
            case 0:
                System.out.println("Saliste");
                break;
            case 1:
                System.out.println("Elegiste el ejercicio 1: ");
                break;
            case 2:
                System.out.println("Elegiste el ejercicio 2: ");
                break;
            case 3:
                System.out.println("Elegiste el ejercicio 3: ");
                break;
            case 4:
                System.out.println("Elegiste el ejercicio 4: ");
                break;
        }
    }
    public static void showMenu() {
        System.out.println("Elige el ejercicio que desee: \n" +
                "0) SALIR \n" +
                "1) Ejercicio 1 \n" +
                "2) Ejercicio 2 \n" +
                "3) Ejercicio 3 \n" +
                "4) Ejercicio 4");
    }
}
