public class ShapeTest {
    public static void main(String[] args) {

        Shape defaultShape = new Shape();
        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 4.0);
        Shape rectangle = new Shape(4, 5.0, 6.0);
        Shape triangle = new Shape(3, 3.0, 4.0, 5.0);


        String defaultShapeDetails = defaultShape.getShapeDetails();
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();


        System.out.println(defaultShapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}
