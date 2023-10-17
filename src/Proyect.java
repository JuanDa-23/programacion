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
        int pointV = scanner.nextInt();
        System.out.print("Introduce los puntos de Ataque: ");
        int pointA = scanner.nextInt();
        System.out.print("Introduce los puntos de Defensa: ");
        int pointD = scanner.nextInt();
        System.out.print("Introduce los puntos de Vida: ");
        int pointL = scanner.nextInt();
        if ((pointV + pointA + pointD + pointL < 501) && (pointV <= 201 && pointV > 0 || pointA <= 201 && pointA > 0 || pointD <= 201 && pointD > 0 || pointL <= 201 && pointL > 0)) {
            System.out.println("____________________________________________________________________________________________________");
        } else {
            System.out.println("Error, vuelve a introducir los puntos ");
        }

        //Atributos NPC//
        Random random = new Random();
        int randomInt = random.nextInt(50, 200);
        System.out.println("Ahora, le daré yo puntos a mi Guerrero");

        int npcV = random.nextInt(50, 201);
        System.out.println("La Velocidad será de: " + npcV);
        int npcA = random.nextInt(50, 201);
        System.out.println("El Ataque será de: " + npcA);
        int npcD = random.nextInt(50, 201);
        System.out.println("La Defensa será de: " + npcD);
        int npcL = random.nextInt(50, 201);
        System.out.println("La Vida será de: " + npcL);
        int totalPoints = npcV + npcA + npcD + npcL;
        while (totalPoints == 500) {
            if (npcV > 0 || npcA > 0 || npcD > 0 || npcL > 0) {
            }
        }

        //Generación de RONDAS//
        int i = 1;
        while (pointL > 0 && npcL > 0) {
            System.out.println("____________________________________________________________________________________________________");
            System.out.println("RONDA " + i);

            if (pointV > npcV) {
                System.out.println("Empieza tu personaje");

                    int d = random.nextInt(1, 100);
                    if (d >= 80) {
                    pointA = random.nextInt(100, 201);
                    System.out.println("Inflinges un crítico de " + (pointA) + " puntos; mi salud disminuye a " + (Math.max(npcL - pointA, 0)));
                    } else if (d < 20) {
                    pointA = random.nextInt(50, 101);
                    pointD = pointD - 10;
                    System.out.println("Solo inflinges " + (pointA) + " y mi salud disminuye a " + (Math.max(npcL - pointA, 0)));
                    } else {
                    System.out.println("Inflinges " + (pointA) + "; mi salud disminuye a " + Math.max(npcL - pointA, 0));
                    System.out.println("Mi Guerrero inflinge " + (npcA) + "; tu salud disminuye a " + Math.max(pointL - npcA, 0));
                    }
                    System.out.println(Math.max(pointL -= npcA, 0));
                    System.out.println(Math.max(npcL -= pointA, 0));
                }
                if (pointL <= 0) {
                    System.out.println("¡¡¡HE GANADO!!!");
                } else if (npcL <= 0) {
                    System.out.println("¡¡¡HAS GANADO!!!");
                    System.out.println("____________________________________________________________________________________________________");

                    ++i;


                } else {
                    System.out.println("Empieza mi Guerrero");

                        int d2 = random.nextInt(1, 100);
                        if (d2 >= 80) {
                            npcA = random.nextInt(100, 201);
                            System.out.println("Mi Guerrero inflinge un crítico de " + (npcA) + " puntos; tu salud disminuye a " + Math.max(pointL - npcA, 0));
                        } else if (d2 < 20) {
                            npcA = random.nextInt(50, 101);
                            npcD = npcD - 10;
                            System.out.println("Solo inflinges " + (npcA) + " mi salud disminuye a " + (Math.max(pointL - npcA, 0)));
                        } else {
                            System.out.println("Mi Guerrero inflinge " + (npcA) + "; tu salud disminuye a " + Math.max(pointL - npcA, 0));
                            System.out.println("Inflinges " + (pointA) + "; mi salud disminuye a " + (Math.max(npcL - pointA, 0)));
                        }
                        System.out.println(Math.max(pointL -= npcA, 0));
                        System.out.println(Math.max(npcL -= pointA, 0));

                    }
                if (pointL <= 0) {
                    System.out.println("¡¡¡HE GANADO!!!");
                } else if (npcL <= 0) {
                    System.out.println("¡¡¡HAS GANADO!!!");
                    System.out.println("____________________________________________________________________________________________________");

                    ++i;

                }
            }
        }
    }




