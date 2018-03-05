package designpattern.practice.simplefactory;

public class ExcuteMain {

    public static void main(String[] args) {
        Triangle triangle;
        triangle=(Triangle) ShapeFactory.getShape("tiangle");
        triangle.draw();

    }
}
