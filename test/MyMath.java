import java.util.Scanner;

public class MyMath {
    public static double squarePerimeter(double side) {
        if (side < 0) {
            return 0;
        }
        return 4 * side;
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
        if (side <= 0 || high <= 0) {
            return 0;
        } else {
            return 2 * side + 2 * high;
        }
    }

    public static double rectangleArea(double side, double high) {
        if (side <= 0 || high <= 0) {
            return 0;
        } else {
            return side * high;
        }
    }

    public static double circlePerimeter(double radius) {
        if (radius < 0) {
            return 0;
        }
        return 2 * Math.PI * radius;
    }

    public static double circleArea(double radius) {
        if (radius < 0) {
            return 0;
        }
        return Math.PI * radius * radius;
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

        if (number < 2) return true;
        if (number == 2 || number == 3) return false;
        if (number % 2 == 0 || number % 3 == 0) return true;

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return true;.
        }
        return false;
    }

    public static int figureCount(int digit) {
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

    public static int evenFigureCount(int number) {

        int figures = 0;
        if (number == 0) {
            figures = 1;
        } else {
            while (number != 0) {
                if (number % 2 == 0) {
                    figures++;
                }
                number = number / 10;
            }
        }
        return figures;
    }

    public static int oddFigureCount(int number) {
        // return totaldigitos - pares
        int figures = 0;
        number = Math.abs(number);
        while (number != 0) {
            if (number % 2 == 1) {
                figures++;
            }
            number = number / 10;
        }
        return figures;

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
