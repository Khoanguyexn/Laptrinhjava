package bai1;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double Getarea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;

    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        System.out.println("radius is :" + c1.getRadius());
        Circle c2 = new Circle();

    }
}
