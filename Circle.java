/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

/**
 *
 * @author Lenovo
 */
public class Circle extends Shape {
    double radius;

    public Circle(double radius, String color,boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
         return "The circle area is: "+this.getArea()+", color: "+color+", filled: "+filled;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI*2*radius;
    }
    public static void main(String[] args) {
        Shape a = new Circle(23, "red", true);
        System.out.println(a.toString());
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }
    
    
}
