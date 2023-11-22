import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;
        int suspendidos = 0;
        int totalAlumnos = 0;

        while (true) {
            System.out.print("Introduce la nota del alumno (-1 para salir): ");
            int nota = scanner.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota >= 5) {
                    aprobados++;
                } else {
                    suspendidos++;
                }
            } else {
                System.out.println("Nota no válida. Debe estar en el rango de 0 a 10.");
                System.out.println("Aprobados: " + aprobados);
                System.out.println("Suspendidos: " + suspendidos);
            }

        }

    }

}




