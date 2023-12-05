package tema3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BuscaParejas {
    public static void main(String[] args) {
        String[] animales = {"león", "mandril", "suricata", "facóquero", "tigre", "elefante", "jirafa", "mono", "cocodrilo", "cebra"};
        String[] parejas = new String[animales.length * 2];
        for (int i = 0; i < animales.length; i++) {
            parejas[i] = animales[i];
            parejas[i + animales.length] = animales[i];
        }
        Collections.shuffle(Arrays.asList(parejas));
        boolean[] visibles = new boolean[parejas.length];
        Scanner scanner = new Scanner(System.in);
        int parejasRestantes = animales.length;
        while (parejasRestantes > 0) {
        mostrarTablero(parejas, visibles);


            System.out.println("Ingresa la primera posición: ");
            int posicion1 = scanner.nextInt();

            System.out.println("Ingresa la segunda posición: ");
            int posicion2 = scanner.nextInt();


            if (posicionValida(posicion1, parejas.length) && posicionValida(posicion2, parejas.length) && !visibles[posicion1] && !visibles[posicion2]) {

                if (parejas[posicion1].equals(parejas[posicion2])) {

                    System.out.println("¡Encontraste una pareja!");
                    visibles[posicion1] = true;
                    visibles[posicion2] = true;
                    parejasRestantes--;
                } else {

                    System.out.println("¡No son iguales! Inténtalo de nuevo.");
                }
            } else {

                System.out.println("Posiciones inválidas. Inténtalo de nuevo.");
            }

            limpiarPantalla();
        }


        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
        scanner.close();
    }

    public static void mostrarTablero(String[] parejas, boolean[] visibles) {
        for (int i = 0; i < parejas.length; i++) {
            if (visibles[i]) {
                System.out.print(parejas[i] + " ");
            } else {
                System.out.print("?? ");
            }
        }
        System.out.println();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static boolean posicionValida(int posicion, int longitudArray) {
        return posicion >= 0 && posicion < longitudArray;
    }
}