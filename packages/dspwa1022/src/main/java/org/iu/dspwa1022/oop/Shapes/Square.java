package org.iu.dspwa1022.oop.Shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(0, 0);
    }

    @Override
    public double getArea() {
        return Math.random();
    }

    @Override
    public double getPerimeter() {
        return 42;
    }

}
