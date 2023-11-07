import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~MENÚ~");
        System.out.println("Elige con un número una función matemática.");
        showMenu();
        double side = scanner.nextDouble();
        double high = scanner.nextDouble();
        double radius = scanner.nextDouble();
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int digit = scanner.nextInt();

        System.out.println("El perimetro de un cuadrado de lado 3 es " + MyMath.squarePerimeter(3));

                    System.out.println("Calcular el area del cuadrardo.");
                    MyMath.squareArea(side);


                    System.out.println("Calcular el perímetro del rectángulo.");
                    MyMath.rectanglePerimeter(side, high);


                    System.out.println("Calcular el area del rectángulo.");
                    MyMath.rectangleArea(side, high);


                    System.out.println("Calcular el perímetro del círculo.");
                    MyMath.circlePerimeter(radius);


                    System.out.println("Calcular el area del círculo.");
                    MyMath.circleArea(radius);


                    System.out.println("¿Es tu número primo?");
                    MyMath.isPrime(number);


                    System.out.println("¿No es tu número primo?");
                    MyMath.isNotPrime(number);


                    System.out.println("Devuelve el número de dígitos enteros.");
                    System.out.println(MyMath.figureCount(digit));


                    System.out.println("Devuelve el número de dígitos pares.");
                    MyMath.evenFigureCount(number);


                    System.out.println("Devuelve el número de dígitos impares.");
                   // MyMath.oddFigtestureCount(number);


                    System.out.println("Calcúlar el factorial de un número.");
                    MyMath.factorial(number);


                    System.out.println("Devuelve el número factorial");
                    MyMath.factorialRecursive(number);


                    System.out.println("Calcula ecuaciones de segundo grado.");
                    MyMath.quadraticEcuationSolutions(number, number1, number2);


                    System.out.println("Suma los dígitos de números enteros.");
                    MyMath.figuresSumatory(number);


                    System.out.println("Has salido");
            }


    public static void showMenu() {
        System.out.println(
                "1) Calcular el perímetro del cuadrardo.\n" +
                        "2) Calcular el area del cuadrardo.\n" +
                        "3) Calcular el perímetro del rectángulo.\n" +
                        "4) Calcular el area del rectángulo.\n" +
                        "5) Calcular el perímetro del círculo.\n" +
                        "6) Calcular el area del círculo.\n" +
                        "7) ¿Es tu número primo?\n" +
                        "8) ¿No es tu número primo?\n" +
                        "9) Devuelve el número de dígitos enteros.\n" +
                        "10) Devuelve el número de dígitos pares.\n" +
                        "11) Devuelve el número de dígitos impares.\n" +
                        "12) Calcúlar el factorial de un número.\n" +
                        "13) Devuelve el número factorial.\n" +
                        "14) Calcula ecuaciones de segundo grado.\n" +
                        "15) Suma los dígitos de números enteros.\n" +
                        "0) SALIR .");

    }
}

