package tema3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce tu edad: ");
        int number = in.nextInt();
        if (!isAdult(number)){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

        }

    public static boolean isAdult(int number){
        boolean result = true;
        if (number >= 18){
            result = false;
        }
        return result;
    }

}
