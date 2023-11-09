import java.util.Scanner;

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

    public static double getCoins(double total) {
        int monedas = 0;
        int dinero = (int) Math.round(total * 100);
        while (dinero > 0) {
            if (dinero >= 200) {
                dinero -= 200;
                monedas += 10000000;
            } else if (dinero >= 100) {
                dinero -= 100;
                monedas += 1000000;
            } else if (dinero >= 50) {
                dinero -= 50;
                monedas += 100000;
            } else if (dinero >= 20) {
                dinero -= 20;
                monedas += 10000;
            } else if (dinero >= 10) {
                dinero -= 10;
                monedas += 1000;
            } else if (dinero >= 5) {
                dinero -= 5;
                monedas += 100;
            } else if (dinero >= 2) {
                dinero -= 2;
                monedas += 10;
            } else {
                dinero -= 1;
                monedas += 1;
            }
        }
        return monedas;
    }
    public static double getFIF(double letter) {

    }
}

