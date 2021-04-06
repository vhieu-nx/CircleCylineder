public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private boolean filled = true;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius()
                + " and color is " + getColor()
                + " and " + (isFilled() ? "filled" : "not filled");
    }
}