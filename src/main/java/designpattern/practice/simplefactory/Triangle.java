package designpattern.practice.simplefactory;

public class Triangle implements Shape {

    public void draw() {
        System.out.println("draw triangle");
    }

    public void erase() {
       System.out.println("draw erase ");
    }
}
