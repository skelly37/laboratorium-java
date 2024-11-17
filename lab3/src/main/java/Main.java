public class Main{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2, new Color(255,255,255,0));
        Rectangle rectangle = new Rectangle(2,3, new Color(0,0,0));
        ShapeDescriber.describe(triangle);
        ShapeDescriber.describe(rectangle);
    }
}