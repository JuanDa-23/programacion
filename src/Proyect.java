import java.util.Random;
import java.util.Scanner;

public class Proyect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Game\nIntroduce un número del 1 al 200, para asignar valor a los atributos.\nLa suma total de los atributos introducidos no puede superar los 500 puntos");

        System.out.print("Introduce los puntos de Velocidad: ");
        int pointV = scanner.nextInt();
        System.out.print("Introduce los puntos de Ataque: ");
        int pointA = scanner.nextInt();
        System.out.print("Introduce los puntos de Defensa: ");
        int pointD = scanner.nextInt();
        System.out.print("Introduce los puntos de Vida: ");
        int pointL = scanner.nextInt();
        if ((pointV + pointA + pointD + pointL < 500) && (pointV <= 200 || pointA <= 200 || pointD <= 200 || pointL <= 200)) {
            System.out.println("____________________________________________________________________________________________________");
        } else {
            System.out.println("Error, vuelve a introducir los puntos ");
        }

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
        while (totalPoints == 500) if (npcV > 0 || npcA > 0 || npcD > 0 || npcL > 0) { int reduceFrom = random.nextInt(4); int[] attrs = {npcV, npcA, npcD, npcL}; if (attrs[reduceFrom] > 0) { attrs[reduceFrom]--; totalPoints--; } npcV = attrs[0]; npcA = attrs[1]; npcD = attrs[2]; npcL = attrs[3]; }

        //Delimitar el sumatorio npc hasta 500//
        //if (pointV > npcV){//
        //Se genera un numero del 1 al 100, si es mayor que 75 (damage x2)//
        //Visualizar las rondas//
        //defensa quita 50% al daño pero elimina 25% de defensa //
        }
    }