package tema3;

import java.util.Scanner;

public class repaso {
    public class Repaso1 {
        static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {

            System.out.println("Introduce la hora: ");
            int hora = in.nextInt();
            System.out.println("Introduce los minutos: ");
            int minuto = in.nextInt();
            System.out.println("Introduce segundo: ");
            int segundo = in.nextInt();

            if(hora > 23 || hora < 0 || minuto > 60 || minuto < 0 || segundo > 60 || segundo < 0) {
                System.out.println("ERROR");
            } else if (segundo ){
            } else {
                System.out.println("La hora es: " + hora + ":" + minuto + ":" + (segundo + 1));
            }


        }
    }
}
