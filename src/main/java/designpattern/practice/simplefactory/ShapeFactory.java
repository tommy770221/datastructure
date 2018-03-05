package designpattern.practice.simplefactory;

public class ShapeFactory {

        public static Shape getShape(String shapeType) throws UnsupportedOperationException{
            Shape shape;
            if("triangle".equalsIgnoreCase(shapeType)){
                shape=new Triangle();
                return shape;
            }else if("circle".equalsIgnoreCase(shapeType)){
                shape=new Triangle();
                return shape;
            }else if("square".equalsIgnoreCase(shapeType)){
                shape=new Triangle();
                return shape;
            }else{
                throw new UnsupportedOperationException();
            }

        }
}
