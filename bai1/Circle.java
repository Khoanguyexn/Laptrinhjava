package bai1;

public class Circle {

        private double radius;
        private String color;
        public Circle() {
            radius=1.0;
            color="red";
        }
        public Circle(double r) {
            radius=r;
            color="red";
        }
        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return radius*radius*Math.PI;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        @Override
        public String toString() {
            return "Circle [radius=" + radius + ", color=" + color + "]";
        }


public static void main(String[] args) {
    Circle c1= new Circle(1.1);
    System.out.println(c1);
    System.out.println("radius is :"+c1.getRadius());
    Circle c2=new Circle();

}
}