abstract class Shape {
    public Shape(Color c) {
        color = c;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColorDescription() {
        return "Red: " + color.r() + ", Green: " + color.g() + ", Blue: " + color.b() + ", Alpha: " + color.a();
    }
    public String getClassName() {
        return "Shape type: " + this.getClass().getSimpleName();
    }

    protected Color color;
}
