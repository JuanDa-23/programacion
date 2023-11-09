public class EjercicioDiez {

    public static void main(String[] args) {

        System.out.println("El perimetro de un cuadrado de lado 3 es " + MyMath.squarePerimeter(3));
        System.out.println("El area de un cuadrado de lado 5,5 es " + MyMath.squareArea(5.5));
        System.out.println("El perímetro de un rectángulo de base 2 y altura 7 es " + MyMath.rectanglePerimeter(2, 7));
        System.out.println("El area de un rectángulo de base 6,2 y altura 2,3 es " + MyMath.rectangleArea(6.2, 2.3));
        System.out.println("El perímetro de un círculo de radio 9 es " + MyMath.circlePerimeter(9));
        System.out.println("El area de un círculo de radio 1,5 es " + MyMath.circleArea(1.5));
        System.out.println("¿El número 27543 es primo? " + MyMath.isPrime(27543));
        System.out.println("¿No es el numero 24 primo? " + MyMath.isNotPrime(24));
        System.out.println("Devuelveme los dígitos de 123 son " + MyMath.figureCount(123));
        System.out.println("Ahora los dígitos pares de 4561 son" + MyMath.evenFigureCount(4561));
        System.out.println("Y por último los dígitos impares del número 7233 son " + MyMath.oddFigureCount(7233));
        System.out.println("El factorial de 5 es " + MyMath.factorial(5));
        System.out.println("El factorial de 3 es " + MyMath.factorialRecursive(3));
        System.out.println("Cuantas soluciones da la ecuación de segundo grado de 2, 5 y 10: " + MyMath.quadraticEcuationSolutions(2, 5, 10));
        System.out.println("No sé que hace esto pero introduciré un 15. La respuesta es: " + MyMath.figuresSumatory(15));

    }
}

