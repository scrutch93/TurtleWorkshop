package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.geom.Point2D;

public class Square extends Shape {

    private double sideLength;

    public Square(Turtle turtle, String color, int border, double x, double y) {
        super(turtle, color, border, x, y);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {




          getTurtle().forward(getSideLength());
          getTurtle().turnRight(90);
          getTurtle().forward(getSideLength());
          getTurtle().turnRight(90);
          getTurtle().forward(getSideLength());
          getTurtle().turnRight(90);
          getTurtle().forward(getSideLength());


        super.paint();
    }
}
