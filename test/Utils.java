import javax.swing.*;

public class Utils {

    public static double miles2kilometers(double millas) {
        return 1.60934 * millas;
    }

    public static double getTaxes(double euro, double taxes) {
        double result = 0;
        result = euro * (taxes / 100);
        result = Math.round(result * 100) / 100.0;
        return result;
    }

    public static double getNetPrice(double euro, double taxes) {
        double result = 0;
        result = euro * (taxes / 100);
        result = result + euro;
        result = Math.round(result * 100) / 100.0;
        return result;
    }

    public static double getCoins(double euros) {
        int monedas = 0;
        int cents = (int) Math.round(euros * 100);
        while (cents > 0) {
            if (cents >= 200) {
                cents -= 200;
                monedas += 10000000;
            } else if (cents >= 100) {
                cents -= 100;
                monedas += 1000000;
            } else if (cents >= 50) {
                cents -= 50;
                monedas += 100000;
            } else if (cents >= 20) {
                cents -= 20;
                monedas += 10000;
            } else if (cents >= 10) {
                cents -= 10;
                monedas += 1000;
            } else if (cents >= 5) {
                cents -= 5;
                monedas += 100;
            } else if (cents >= 2) {
                cents -= 2;
                monedas += 10;
            } else {
                cents -= 1;
                monedas += 1;
            }
        }
        return monedas;
    }

   public static char getNIF(int numberDni) {
        int numberLetter = numberDni % 23;
        char letterNif = 'T';
        switch (numberLetter) {
            case (1):
                letterNif = 'R';
                break;
            case (2):
                letterNif = 'W';
                break;
            case (3):
                letterNif = 'A';
                break;
            case (4):
                letterNif = 'G';
                break;
            case (5):
                letterNif = 'M';
                break;
            case (6):
                letterNif = 'Y';
                break;
            case (7):
                letterNif = 'F';
                break;
            case (8):
                letterNif = 'P';
                break;
            case (9):
                letterNif = 'D';
                break;
            case (10):
                letterNif = 'X';
                break;
            case (11):
                letterNif = 'B';
                break;
            case (12):
                letterNif = 'N';
                break;
            case (13):
                letterNif = 'J';
                break;
            case (14):
                letterNif = 'Z';
                break;
            case (15):
                letterNif = 'S';
                break;
            case (16):
                letterNif = 'Q';
                break;
            case (17):
                letterNif = 'V';
                break;
            case (18):
                letterNif = 'H';
                break;
            case (19):
                letterNif = 'L';
                break;
            case (20):
                letterNif = 'C';
                break;
            case (21):
                letterNif = 'K';
                break;
            case (22):
                letterNif = 'E';
                break;
            default:
                System.out.println("ERROR: Introduce un DNI Válido.");
                break;
        }

       return letterNif;
   }

    public static boolean isValidNIF(int numberDni, char letterNif) {
        letterNif = Character.toUpperCase(letterNif);
        return letterNif == getNIF(numberDni);
    }

}
