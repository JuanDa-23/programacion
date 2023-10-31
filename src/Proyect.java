import java.util.Random;
import java.util.Scanner;

public class Proyect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" #####  #  #   ####           ##      #    #   #  ####\n" +
                "   #    #  #   #             #  #    # #   ## ##  #\n" +
                "   #    ####   ###           #      #   #  # # #  ###\n" +
                "   #    #  #   #             # ##   #####  # # #  #\n" +
                "   #    #  #   #             #  #   #   #  #   #  #\n" +
                "   #    #  #   ####           ##    #   #  #   #  ####\n");
        System.out.println("Introduce un número del 1 al 200, para asignar valor a los atributos.\nLa suma total de los atributos introducidos no puede superar los 500 puntos");

        //Introducción Atributos Personaje//
        System.out.print("Introduce los puntos de Velocidad: ");
        int puntosVelocidad = scanner.nextInt();
        System.out.print("Introduce los puntos de Ataque: ");
        int puntosAtaque = scanner.nextInt();
        System.out.print("Introduce los puntos de Defensa: ");
        int puntosDefensa = scanner.nextInt();
        System.out.print("Introduce los puntos de Vida: ");
        int puntosVida = scanner.nextInt();
        if ((puntosVelocidad + puntosAtaque + puntosDefensa + puntosVida < 501) && (puntosVelocidad <= 201 && puntosVelocidad > 0 || puntosAtaque <= 201 && puntosAtaque > 0 || puntosDefensa <= 201 && puntosDefensa > 0 || puntosVida <= 201 && puntosVida > 0)) {
            System.out.println("____________________________________________________________________________________________________");
        } else {
            System.out.println("Error, vuelve a introducir los puntos ");
        }

        //Atributos NPC//
        Random random = new Random();
        int randomInt = random.nextInt(50, 200);
        System.out.println("Ahora, le daré yo puntos a mi Guerrero");

        int velocidadNpc = random.nextInt(50, 201);
        System.out.println("La Velocidad será de: " + velocidadNpc);
        int ataqueNpc = random.nextInt(50, 201);
        System.out.println("El Ataque será de: " + ataqueNpc);
        int defensaNpc = random.nextInt(50, 201);
        System.out.println("La Defensa será de: " + defensaNpc);
        int vidaNpc = random.nextInt(50, 201);
        System.out.println("La Vida será de: " + vidaNpc);
        int totalPoints = velocidadNpc + ataqueNpc + defensaNpc + vidaNpc;
        while (totalPoints == 500) {
            if (velocidadNpc > 0 || ataqueNpc > 0 || defensaNpc > 0 || vidaNpc > 0) {

            }
        }

        //Generación de RONDAS//
        int i = 1;
        while (puntosVida > 0 && vidaNpc > 0) {
            System.out.println("____________________________________________________________________________________________________");
            System.out.println("RONDA " + i);

            if (puntosVelocidad > velocidadNpc) {
                System.out.println("Empieza tu personaje");

                int critico = random.nextInt(1, 100);
                if (critico >= 80) {
                    puntosAtaque = random.nextInt(100, 201);
                    System.out.println("Inflinges un crítico de " + (puntosAtaque) + " puntos; mi salud disminuye a " + (Math.max(vidaNpc - puntosAtaque, 0)));
                } else if (critico < 20) {
                    puntosAtaque = random.nextInt(50, 101);
                    puntosDefensa = puntosDefensa - 10;
                    System.out.println("Solo inflinges " + (puntosAtaque) + " y mi salud disminuye a " + (Math.max(vidaNpc - puntosAtaque, 0)));
                } else {
                    System.out.println("Inflinges " + (puntosAtaque) + "; mi salud disminuye a " + Math.max(vidaNpc - puntosAtaque, 0));
                    System.out.println("Mi Guerrero inflinge " + (ataqueNpc) + "; tu salud disminuye a " + Math.max(puntosVida - ataqueNpc, 0));
                }
                System.out.println(Math.max(puntosVida -= ataqueNpc, 0));
                System.out.println(Math.max(vidaNpc -= puntosAtaque, 0));
                System.out.println("____________________________________________________________________________________________________");

            }
            if (puntosVida <= 0) {
                System.out.println("¡¡¡HE GANADO!!!");
            } else if (vidaNpc <= 0) {
                System.out.println("¡¡¡HAS GANADO!!!");
                System.out.println("____________________________________________________________________________________________________");


            } else {
                System.out.println("Empieza mi Guerrero");

                int critico2 = random.nextInt(1, 100);
                if (critico2 >= 80) {
                    ataqueNpc = random.nextInt(100, 201);
                    System.out.println("Mi Guerrero inflinge un crítico de " + (ataqueNpc) + " puntos; tu salud disminuye a " + Math.max(puntosVida - ataqueNpc, 0));
                } else if (critico2 < 20) {
                    ataqueNpc = random.nextInt(50, 101);
                    defensaNpc = defensaNpc - 10;
                    System.out.println("Solo inflinges " + (ataqueNpc) + " mi salud disminuye a " + (Math.max(puntosVida - ataqueNpc, 0)));
                } else {
                    System.out.println("Mi Guerrero inflinge " + (ataqueNpc) + "; tu salud disminuye a " + Math.max(puntosVida - ataqueNpc, 0));
                    System.out.println("Inflinges " + (puntosAtaque) + "; mi salud disminuye a " + (Math.max(vidaNpc - puntosAtaque, 0)));
                }
                System.out.println(Math.max(puntosVida -= ataqueNpc, 0));
                System.out.println(Math.max(vidaNpc -= puntosAtaque, 0));
                System.out.println("____________________________________________________________________________________________________");

            }
            if (puntosVida <= 0) {
                System.out.println("¡¡¡HE GANADO!!!");
            } else if (vidaNpc <= 0) {
                System.out.println("¡¡¡HAS GANADO!!!");
                System.out.println("____________________________________________________________________________________________________");


            }
            ++i;
        }
    }
}