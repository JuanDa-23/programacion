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
        result = Math.round(result * 100) / 100.0;

        return result;
    }

}
