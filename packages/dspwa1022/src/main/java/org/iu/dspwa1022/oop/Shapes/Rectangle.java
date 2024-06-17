package org.iu.dspwa1022.oop.Shapes;

public class Rectangle implements Shape {

    public final double width;
    public final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        // TODO: Implement this method
        return height * width;
    }

    @Override
    public double getPerimeter() {
        // TODO: Implement this method
        return (height + width)*2;
    } 

}
