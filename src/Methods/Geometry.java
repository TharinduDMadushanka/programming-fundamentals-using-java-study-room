package Methods;

public class Geometry {
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double circleArea = areaOfCircle(5.0);
        double rectangleArea = areaOfRectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
