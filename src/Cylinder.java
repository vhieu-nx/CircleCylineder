public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height * getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder has Volume is: " + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
