package com.pluralsight;

import com.pluralsight.forms.World;
import com.pluralsight.forms.Turtle;
import java.awt.*;
import java.util.Scanner;

public class MainApp
{
    static World world = new World(200, 200);

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Welcome.");
        System.out.println("Select an option: ");
        System.out.println("[1] Add a shape");
        System.out.println("[2] Save Image");
        System.out.println("[0] Exit");
        int selection = keyboard.nextInt();

        switch (selection) {
            case 1:
                addShape(world);
            case 2:

            case 0:
        }

    }

        public static void addShape(World world){
            Scanner keyboard = new Scanner(System.in);

            System.out.println("What is the shape you would like to create?");
            String response = keyboard.nextLine().trim().toLowerCase();

            switch (response) {
                case "square":
                        makeSquare(world);
                        break;
                case "circle":
                        makeCircle(world);
                        break;
                case "triangle":
                        makeTriangle(world);
                        break;
                case "hexagon":
                        makeHexagon(world);

            }



    }


    public static void makeSquare(World world) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("How long is a side?");
        double side = keyboard.nextDouble();
        System.out.println("What is the border width?");
        int width = keyboard.nextInt();
        System.out.println("What is the border color?");
        String color = keyboard.next();
        System.out.println("What is location (x, y)?");
        System.out.println("Enter x coordinate: ");
        int x = keyboard.nextInt();
        System.out.println("Enter y coordinate: ");
        int y = keyboard.nextInt();


        Turtle turtle = new Turtle(world, x, y);
        Square square = new Square(turtle,color,width,x,y,side);

        square.paint();

    }


    public static void makeCircle(World world) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the the radius?");
        double radius = keyboard.nextDouble();

        System.out.println("What is the border width?");
        int width = keyboard.nextInt();
        System.out.println("What is the border color?");
        String color = keyboard.next();
        System.out.println("What is location (x, y)?");
        System.out.println("Enter x coordinate: ");
        int x = keyboard.nextInt();
        System.out.println("Enter y coordinate: ");
        int y = keyboard.nextInt();

        Turtle turtle = new Turtle(world, x, y);
        Circle circle = new Circle(turtle,color,width,x,y,radius);


        circle.paint();
    }


    public static void makeTriangle(World world) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the border width?");

        System.out.println("What is the border color?");

        System.out.println("What is x, y?");


    }



    public static void makeHexagon(World world) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What is the border width?");

        System.out.println("What is the border color?");

        System.out.println("What is x, y?");


    }






        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
//        World world = new World(200, 200);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
    }

