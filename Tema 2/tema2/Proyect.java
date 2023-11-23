package tema2;

import java.util.Random;
import java.util.Scanner;

public class Proyect {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int speed1;
    static int damage1;
    static int defense1;
    static int life1;
    static int speed2;
    static int damage2;
    static int defense2;
    static int life2;

    public static void main(String[] args) {

        showMenu();
        /*if (configureAttributes()) {
            System.out.println("_______".repeat(10));
        } else {
            System.out.println("Vuelve a introducir los valores: ");
            showMenu();
        }*/
        generateRounds();

    }



    public static void showMenu() {
        System.out.println(" #####  #  #   ####           ##      #    #   #  ####\n" +
                "   #    #  #   #             #  #    # #   ## ##  #\n" +
                "   #    ####   ###           #      #   #  # # #  ###\n" +
                "   #    #  #   #             # ##   #####  # # #  #\n" +
                "   #    #  #   #             #  #   #   #  #   #  #\n" +
                "   #    #  #   ####           ##    #   #  #   #  ####\n");
        System.out.println("Introduce un número del 1 al 200, para asignar valor a los atributos.\nLa suma total de los atributos introducidos no puede superar los 500 puntos");

        //Introducción Atributos Personaje//
        System.out.print("Introduce los puntos de Velocidad: ");
        speed1 = scanner.nextInt();
        System.out.print("Introduce los puntos de Ataque: ");
        damage1 = scanner.nextInt();
        System.out.print("Introduce los puntos de Defensa: ");
        defense1 = scanner.nextInt();
        System.out.print("Introduce los puntos de Vida: ");
        life1 = scanner.nextInt();

        //Atributos NPC//
        System.out.println("Ahora, le daré yo puntos a mi Guerrero");
        System.out.println("La Velocidad será de: " + speed2);
        speed2 = random.nextInt(50, 201);
        System.out.println("El Ataque será de: " + damage2);
        damage2 = random.nextInt(50, 201);
        System.out.println("La Defensa será de: " + defense2);
        defense2 = random.nextInt(50, 201);
        System.out.println("La Vida será de: " + life2);
        life2 = random.nextInt(50, 201);

    }

    //Bucles entre funciones
   /* public static boolean configureAttributes() {
        boolean atributosSonCorrectos = false;
        while (!atributosSonCorrectos) {
            atributosSonCorrectos = configureAttributes();
        }
        if ((speed1 + damage1 + defense1 + life1 < 501) && (speed1 <= 201 && speed1 > 0 || damage1 <= 201 && damage1 > 0 || defense1 <= 201 && defense1 > 0 || life1 <= 201 && life1 > 0)) {
            atributosSonCorrectos = true;
        }
        return atributosSonCorrectos;
    }*/

        public static void generateRounds() {
        //Generación de RONDAS//

        int i = 1;
        while (life1 > 0 && life2 > 0){
        System.out.println("_______".repeat(10));
        System.out.println("RONDA "+i);

        startFirst();
        startSecond();
        gameOver();
        }
            ++i;
    }
    public static void startFirst() {
        if (speed1 > speed2) {
            System.out.println("Empieza tu personaje");

            int critico = random.nextInt(1, 100);
            if (critico >= 80) {
                damage1 = random.nextInt(100, 201);
                System.out.println("Inflinges un crítico de " + (damage1) + " puntos; mi salud disminuye a " + (Math.max(life2 - damage1, 0)));
            } else if (critico < 20) {
                damage1 = random.nextInt(50, 101);
                defense1 = defense1 - 10;
                System.out.println("Solo inflinges " + (damage1) + " y mi salud disminuye a " + (Math.max(life2 - damage1, 0)));
            } else {
                System.out.println("Inflinges " + (damage1) + "; mi salud disminuye a " + Math.max(life2 - damage1, 0));
                System.out.println("Mi Guerrero inflinge " + (damage2) + "; tu salud disminuye a " + Math.max(life1 - damage2, 0));
            }
            System.out.println(Math.max(life1 -= damage2, 0));
            System.out.println(Math.max(life2 -= damage1, 0));
            System.out.println("________".repeat(10));
        }
    }
    public static void startSecond() {

            System.out.println("Empieza mi Guerrero");

            int critico2 = random.nextInt(1, 100);
            if (critico2 >= 80) {
                damage2 = random.nextInt(100, 201);
                System.out.println("Mi Guerrero inflinge un crítico de " + (damage2) + " puntos; tu salud disminuye a " + Math.max(life1 - damage2, 0));
            } else if (critico2 < 20) {
                damage2 = random.nextInt(50, 101);
                defense2 = defense2 - 10;
                System.out.println("Solo inflinges " + (damage2) + " mi salud disminuye a " + (Math.max(life1 - damage2, 0)));
            } else {
                System.out.println("Mi Guerrero inflinge " + (damage2) + "; tu salud disminuye a " + Math.max(life1 - damage2, 0));
                System.out.println("Inflinges " + (damage1) + "; mi salud disminuye a " + (Math.max(life2 - damage1, 0)));
            }
            System.out.println(Math.max(life1 -= damage2, 0));
            System.out.println(Math.max(life2 -= damage1, 0));
            System.out.println("________".repeat(10));

    }
    public static void gameOver() {
        if (life1 <= 0) {
            System.out.println("¡¡¡HE GANADO!!!");
        } else if (life2 <= 0) {
            System.out.println("¡¡¡HAS GANADO!!!");
            System.out.println("_______".repeat(10));
        }
    }
}