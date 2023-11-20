package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.geom.Point2D;

public abstract class Shape implements Paint {

   protected Turtle turtle;

   protected Point2D.Double location;

   protected String color;

   protected int border;

   public Shape(Turtle turtle, String color, int border, double x, double y) {
      this.turtle = turtle;
      this.location = new Point2D.Double(x,y);
      this.color = color;
      this.border = border;
   }

   public Turtle getTurtle() {
      return turtle;
   }

   public void setTurtle(Turtle turtle) {
      this.turtle = turtle;
   }

   public Point2D.Double getLocation() {
      return location;
   }

   public void setLocation(Point2D.Double location) {
      this.location = location;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getBorder() {
      return border;
   }

   public void setBorder(int border) {
      this.border = border;
   }


   public void paint() {

   }


}
