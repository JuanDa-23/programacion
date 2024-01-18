package tema3;

import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la letra para elegir el ejercicio: ");
        char letter = in.next().toLowerCase().charAt(0);

    }
    public static char showMenu(char letter){
      int result = 0;
        switch (letter){
            case 'a':

                break;
            case 'b':

                break;
            case 'c':

                break;
            case 'd':

                break;
            case 'e':

                break;
            case 'f':

                break;
            case 'g':

                break;
            case 'h':

                break;
            case 'i':

                break;
            case 'x':

                break;
            default:
                System.out.println("Introduce un carácter: ");
        }


        return result;
    }
}


