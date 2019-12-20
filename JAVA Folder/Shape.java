public class Shape {
    public void display(){
        System.out.println("Shape");
    }
}
Circle.java
class Circle extends Shape {
    public void display() {
        System.out.println("Circle");
    }
}
ShapeDetails.java
public class ShapeDetails {
    public static void main(String args[]) {
        Shape shape = new Circle();
        shape.display();
    }
}