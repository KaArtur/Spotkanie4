package Interface;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println(rectangle instanceof Shape);

        shape = new Rectangle();
        shape.draw();
        shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();

    }


}
