public class Main {
    public static void main(String[] args) {
        //Circle
        Circle circle = new Circle(31.28, "pink",false);
        System.out.println(circle.toString());
        //first Cylinder
        Cylinder firstCylinder = new Cylinder();
        firstCylinder.setRadius(19.93);
        firstCylinder.setHeight(31.8);
        firstCylinder.setColor("blue");
        firstCylinder.setFilled(false);
        System.out.println(firstCylinder.toString());

        //second Cylinder
        Cylinder secondCylinder = new Cylinder(19.94,"orange",true,28.4);
        System.out.println(secondCylinder.toString());
    }
}
