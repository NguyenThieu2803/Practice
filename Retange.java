/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

/**
 *
 * @author Lenovo
 */
public class Retange extends Shape{
    double width;
    double height;
    public Retange(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Retange() {
        
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "The rectangle have  Area: "+this.getArea()+", "+width+"x"+height+", color: "+color+", filled: "+filled;
    }

    @Override
    double getArea() {
        return width*height;
    }

    @Override
    double getPerimeter() {
        return (width+height)*2;
    }
    public static void main(String[] args) {
        Shape a=new Retange(2, 8, "red", true);
        System.out.println(a.toString());
    }
}
