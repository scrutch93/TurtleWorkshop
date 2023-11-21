package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;
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



      return this.color;
   }

   public void setColor(String color) {

      if (color == "red"){
         turtle.setColor(Color.RED);
      }else if (color == "blue") {
         turtle.setColor(Color.BLUE);
      }else if (color == "green"){
         turtle.setColor(Color.GREEN);
      }else if (color == "yellow"){
         turtle.setColor(Color.YELLOW);
      }

      //this.color = color;
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
