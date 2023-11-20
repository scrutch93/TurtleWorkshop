package com.pluralsight;

import com.pluralsight.forms.Turtle;

public class Circle extends Shape{

    private int radius;

    public Circle(Turtle turtle, String location, String color, int border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        super.paint();
    }
}
