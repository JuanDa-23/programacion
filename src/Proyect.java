import java.util.Random;
import java.util.Scanner;

public class Proyect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Game\nIntroduce un número del 1 al 200, para asignar valor a los atributos.\nLa suma total de los atributos introducidos no puede superar los 500 puntos");

        //Introducción Atributos Personaje//
        System.out.print("Introduce los puntos de Velocidad: ");
        int pointV = scanner.nextInt();
        System.out.print("Introduce los puntos de Ataque: ");
        int pointA = scanner.nextInt();
        System.out.print("Introduce los puntos de Defensa: ");
        int pointD = scanner.nextInt();
        System.out.print("Introduce los puntos de Vida: ");
        int pointL = scanner.nextInt();
        if ((pointV + pointA + pointD + pointL < 501) && (pointV <= 201 || pointA <= 201 || pointD <= 201 || pointL <= 201)) {
            System.out.println("____________________________________________________________________________________________________");
        } else {
            System.out.println("Error, vuelve a introducir los puntos ");
        }

        //IAtributos NPC//
        Random random = new Random();
        int randomInt = random.nextInt(200);
        System.out.println("Ahora, le daré yo puntos a mi Guerrero");

        int npcV = random.nextInt(201);
        System.out.println("La Velocidad será de: " + npcV);
        int npcA = random.nextInt(201);
        System.out.println("El Ataque será de: " + npcA);
        int npcD = random.nextInt(201);
        System.out.println("La Defensa será de: " + npcD);
        int npcL = random.nextInt(201);
        System.out.println("La Vida será de: " + npcL);
        int totalPoints = npcV + npcA + npcD + npcL;
        while (totalPoints == 500) {
            if (npcV > 0 || npcA > 0 || npcD > 0 || npcL > 0) {
            }
        }
        //Generación de RONDAS//
        int i = 1;
        while (pointL >= 0 || npcL >= 0) {
            System.out.println("RONDA " + i);
            System.out.println("Jugador: " + pointL);
            System.out.println("Guerrero_NPC: " + npcL);


            if (pointV > npcV) {
                System.out.println("Empieza tu personaje");
                int critico = random.nextInt(100);
                if (critico >= 75) {
                    pointA = pointA * 2;
                    System.out.println("Inflinges un crítico de " + (pointA) + " puntos; mi salud disminuye a " + (npcL - pointA));
                } else {
                    System.out.println("Inflinges " + (pointA) + "; mi salud disminuye a " + (npcL - pointA));
                }
                int damageTotal = 0;
                double defensaTotal = 0;
                if (pointD >= 50) {
                    damageTotal = pointA / 2;
                    defensaTotal = pointD * 0.25;
                    System.out.println("Solo inflinges " + (damageTotal) + " puesto que mi defensa se ha reducido a " + (defensaTotal));

                }

            } else {
                System.out.println("Empieza mi Guerrero");
                int critico = random.nextInt(100);
                if (critico >= 75) {
                    npcA = npcA * 2;
                    System.out.println("Mi Guerrero inflinge un crítico de " + (npcA) + " puntos; mi salud disminuye a " + (pointL - npcA));
                } else {
                    System.out.println("Mi Guerrero inflinge " + (npcA) + "; su salud disminuye a " + (pointL - npcA));
                }

                int npcDamage = 0;
                double npcDefensa = 0;
                if (pointD >= 50) {
                    npcDamage = npcA / 2;
                    npcDefensa = npcD * 0.25;
                    System.out.println("Solo inflinges " + (npcDamage) + " puesto que su defensa se ha reducido a " + (npcDefensa));

                }
            }
            //Fin Juego//
            if (pointL <= 0) {
                System.out.println("Mi guerrero gana");
            } else if (npcL <= 0) {
                System.out.println("Tu personaje gana");
            } else {
                i++;
            }

            //Acabar Bucle infinito//
            //No hay vida después del negativo//
            //Regenerarse//
        }
    }
}
