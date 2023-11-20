package com.pluralsight;

import com.pluralsight.forms.Turtle;

public abstract class Shape implements Paint {

   protected Turtle turtle;

   protected String location;

   protected String color;

   protected int border;

   public Shape(Turtle turtle, String location, String color, int border) {
      this.turtle = turtle;
      this.location = location;
      this.color = color;
      this.border = border;
   }


   @Override
   public void paint() {

   }
}
