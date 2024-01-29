package tema3;

import java.util.Random;
import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Hay una mosca en alguna casilla, seleciona una casilla: ");
        //char letter = in.next().toLowerCase().charAt(0);

        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt();
        }

        boolean casilla = false;
        if (casilla){
            System.out.println("La mosca no se ha movido del sitio, prueba otra vez: ");
        }else if (){
            System.out.println("Uy! Casi, la mosca estaba acerca, ahora se ha movido, prueba otra vez: ");
        }else {
            System.out.println("Correcto, cazaste la mosca.");
        }
    }

}


//¿Porque hay veces que indice 0 = valor 0?

