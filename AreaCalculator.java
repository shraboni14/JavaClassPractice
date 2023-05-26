
public class AreaCalculator {

    // Method to calculate area of a triangle
    public static float area(float base, float height) {
        return (base * height) / 2;
    }

    // Method to calculate area of a rectangle
    public static double area(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        float triangleArea = area(5, 6);
        double rectangleArea = area(4, 7);
        System.out.println("Area of triangle: " + triangleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }

}
