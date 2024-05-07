package org.iu.dspwa1022.oop.Shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return width*4;
    }

}
