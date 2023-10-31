package tema2;

public class MyMath {
    public static double squarePerimeter(double side) {
        if (side < 0) {
            return 0;
        }
        return 4 * side;
    }

    public static double squareArea(double side) {
        if (side < 0) {
            return 0;
        }
        return side * side;
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
}
