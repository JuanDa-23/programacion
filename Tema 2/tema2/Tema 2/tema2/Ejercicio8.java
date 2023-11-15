package tema2.Tema;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voy a decirte si tu fecha es correcta");
        System.out.println("Introduce el día: ");
        int day = scanner.nextInt();
        System.out.println("Introduce el mes: ");
        int mounth = scanner.nextInt();
        System.out.println("Introduce el año: ");
        int year = scanner.nextInt();

        if (correctDate(day, mounth, year)) {
            System.out.println(day + "/" + mounth + "/" + year + " es correcta.");
        } else {
            System.out.println(day + "/" + mounth + "/" + year + " no es correcta.");
        }
    }

    public static boolean correctDate(int day, int mounth, int year) {
        boolean esValido = false;
        if (mounth < 1 || mounth > 12 || day < 1) {
            esValido = false;
        } else if (mounth == 2) {
            esValido = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else if (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) {
            esValido = (day <= 30);
        } else {
            esValido = (day <= 31);
        }

        return esValido;
    }
}


/*if (mounth < 1 || mounth > 12 || day < 1) {
            esValido = false;
        } else {
        }
            int maxDias = 0;
            if (mounth == 2) {
                if (isleapyear(year)) {
                    maxDias = 29;
                } else  {
                    maxDias = 28;
                }
                maxDias = isleapyear(year) ? 29 : 28;
            } else if (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) {
                maxDias = 30;
            } else {
                maxDias = 31;
            }
            if (day > maxDias) {
                esValido = false;
            }
        }
        return esValido;
    }
                public static boolean isleapyear ( int year){
                    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);*/