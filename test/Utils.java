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

    public static double getCoins(double dinero) {
        int monedas = 0;
        while (dinero > 0) {
            if (dinero >= 2) {
            dinero -= 2;
            monedas += 10000000;
            } else if (dinero >= 1) {
            } else if (dinero >= 0.50) {
            } else if (dinero >= 0.20) {
            } else if (dinero >= 0.10) {
            } else if (dinero >= 0.05) {
            } else if (dinero >= 0.02) {
            } else if (dinero >= 0.01) {

            }
        }
    }
}

