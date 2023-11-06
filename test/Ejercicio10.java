import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~MENÚ~");
        System.out.println("Elige con un número una función matemática");
        int exercicie;
        do {
            exercicie = scanner.nextInt();

            switch (exercicie) {
                case 1:
                    System.out.println("Calcúlar el perímetro del cuadrardo");
                    MyMath.squarePerimeter();
                    break;
                /*case 2:
                System.out.println("Calcúlar el perímetro del cuadrardo");
                    MyMath.squareArea(double side);
                    break;
                case 3:
                    MyMath.rectanglePerimeter( double side, double high);
                    break;
                case 4:
                    MyMath.rectangleArea( double side, double high);
                    break;
                case 5:
                    MyMath.circlePerimeter( double radius);
                    break;
                case 6:
                    MyMath.circleArea( double radius);
                    break;
                case 7:
                    MyMath.isPrime( int number);
                    break;
                case 8:
                    MyMath.isNotPrime( int number);
                    break;
                case 9:
                    MyMath.figureCount( int digit);
                    break;
                case 10:
                    MyMath.evenFigureCount( int number);
                    break;
                case 11:
                    MyMath.oddFigureCount( int number);
                    break;
                case 12:
                    MyMath.factorial( int number);
                    break;
                case 13:
                    MyMath.factorialRecursive( int number);
                    break;
                case 14:
                    MyMath.quadraticEcuationSolutions( int number, int number1, int number2);
                    break;
                case 15:
                    MyMath.figuresSumatory( int number);
                    break;*/
                default:
                    System.out.println("Has salido");
            }
        }
        while (exercicie != 0); {
        }

    }
}

