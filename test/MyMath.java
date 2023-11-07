import java.util.Scanner;

public class MyMath {
    public static double squarePerimeter(double side) {
        double result = 0;
        if (side < 0) {
            result = 0;
        }else {
            result = 4 * side;
        }
        return result;
    }

    public static double squareArea(double side) {
        double result = 0;
        if (side < 0) {
            result =  0;
        } else {
            result = side * side;
        }
        return result;
    }

    public static double rectanglePerimeter(double side, double high) {
        double result = 0;
        if (side <= 0 || high <= 0) {
            result = 0;
        } else {
            result = 2 * side + 2 * high;
        }
        return result;
    }

    public static double rectangleArea(double side, double high) {
        double result = 0;
        if (side <= 0 || high <= 0) {
            result = 0;
        } else {
            result = side * high;
        }
        return  result;
    }

    public static double circlePerimeter(double radius) {
        double result = 0;
        if (radius < 0) {
            result = 0;
        }else {
            result = 2 * Math.PI * radius;
        }
        return result;
    }


    public static double circleArea(double radius) {
        double result = 0;
        if (radius < 0) {
            result = 0;
        }else {
        result = Math.PI * radius * radius;
        }
        return result;
    }

    public static boolean isPrime(int number) {

        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static boolean isNotPrime(int number) {
        return !isPrime(number);
    }

    public static int figureCount(int digit) {
        int result = 0;
        digit = Math.abs(digit);

        if (digit == 0) {
            return 1;
        }

        int contador = 0;

        while (digit > 0) {
            digit = digit / 10;
            contador++;
        }

        return contador;
    }

    public static int evenFigureCount(int digit) {

        int figures = 0;
        if (digit == 0) {
            figures = 1;
        } else {
            while (digit != 0) {
                if (digit % 2 == 0) {
                    figures++;
                }
                digit = digit / 10;
            }
        }
        return figures;
    }

    public static int oddFigureCount(int digit) {
        return (figureCount(digit) - evenFigureCount(digit));
    }

    public static int factorial(int number) {
        int factor = 1;
        if (number == -1) {
            return 0;
        } else {
            for (int i = 1; i <= number; i++) {
                factor = factor * i;
            }
        }
        return factor;
    }

    public static int factorialRecursive(int number) {
        int factor = 1;
        if (number == -1) {
            return 0;
        } else {
            for (int i = 1; i <= number; i++) {
                factor = factor * i;
            }
        }
        return factor;
    }

    public static int quadraticEcuationSolutions(int number, int number1, int number2) {
        int solution = number1 * 2 - 4 * number * number2;
        if (solution == 0) {
            return 1;
        } else if (solution > 0) {
            return 2;
        } else {
            return 0;
        }

    }

    public static int figuresSumatory(int number) {
        int sumatory = 0;
        number = Math.abs(number);
        while (number != 0) {
            sumatory += number % 10;
            number /= 10;
        }
        return sumatory;
    }


}
