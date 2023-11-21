package com.pluralsight;

import com.pluralsight.forms.Turtle;

public class Circle extends Shape{

    private double radius;

    public Circle(Turtle turtle, String color, int border, double x, double y, double radius) {
        super(turtle, color, border, x, y);
        this.radius = radius;
    }


    @Override
    public void paint() {
        int steps = 360;


        turtle.penDown();
        turtle.setPenWidth(border);
        super.setColor(color);


        turtle.penDown();

        for (int i = 0; i < steps; i++) {
            turtle.forward(radius*2 * Math.PI / steps);
            turtle.turnRight(360.0 / steps);
        }

        super.paint();
    }
}
