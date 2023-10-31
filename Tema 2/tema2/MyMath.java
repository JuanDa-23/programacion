package tema2;

public class MyMath {
    public static double squarePerimeter(double side) {
        if (side < 0) {
            System.out.println(side = 0);
        }
        return 4 * side;
    }

    public static double squareArea(double side) {
        if (side < 0) {
            System.out.println(side = 0);
        }
        return side * side;
    }
}
