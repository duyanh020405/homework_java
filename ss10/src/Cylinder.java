package ss10.src;

public class Cylinder extends Circle_bt5 {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(double radius) {
        return Math.PI * radius * radius *height;
    }

    public static void main(String[] args) {
        Circle_bt5 new_circle = new Circle_bt5(10);
        Cylinder new_cylinder = new Cylinder(new_circle.getRadius() , 20);
        System.out.println(new_cylinder.getVolume(new_circle.getRadius() ));
        System.out.println(new_cylinder.getArea());

    }

}
