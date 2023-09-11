public class Shape {
    private final String shapeName;
    private int numberOfEdges;


    public Shape() {
        this.shapeName = "Undefined shape";
        System.out.println("Shape object created.");
    }


    public Shape(double radius) {
        this.shapeName = "Circle";
        this.numberOfEdges = 0;
        System.out.println("Circle object with radius " + radius + " created.");
    }


    public Shape(int edges, double edgeLength) {
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println("Square object with edge length " + edgeLength + " created.");
    }


    public Shape(int edges, double e1, double e2) {
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println("Rectangle object with edges " + e1 + " and " + e2 + " created.");
    }


    public Shape(int edges, double e1, double e2, double e3) {
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.println("Triangle object with edges " + e1 + ", " + e2 + ", and " + e3 + " created.");
    }

    public String getShapeDetails() {
        return "Shape: " + this.shapeName + ", Number of Edges: " + this.numberOfEdges;
    }
}
