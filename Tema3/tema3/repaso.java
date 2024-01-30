package tema3;

import java.util.Random;
import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayMosca = new int[15];
        for (int i = 0; i < arrayMosca.length; i++) {
            arrayMosca[i] = 0;
        }
        Random random = new Random();
        int n = random.nextInt(0, 15);
        arrayMosca[n] = 8;

       /* IF arrayMosca[USUARIO] == 8
                HAS GANADO
        ELSE
            ARRAYMOSCA[USUARIO+1]
        ARRAYMOSCA[USUARIO-1]
                RANDOM.NEXTINT(0,15)
                        ARRAYMOSCA[RANDOM] = 8;*/
        /*Random random = new Random();
        System.out.println("Hay una mosca en alguna casilla, seleciona una casilla: ");
        boolean cazada = false;
        int[] arrayMosca = new int[15];
        while (!cazada){

        }
        if (){

        }

        int mosca = in.nextInt();
        int casilla = random.nextInt();

     */
    }

}

//char letter = in.next().toLowerCase().charAt(0);
//¿Porque hay veces que indice 0 = valor 0?

