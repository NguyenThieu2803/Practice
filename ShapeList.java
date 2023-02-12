/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ShapeList {
    int n;
    Shape []a;;

    public ShapeList() {
    }

    public ShapeList(int n, Shape[] a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Shape[] getA() {
        return a;
    }

    public void setA(Shape[] a) {
        this.a = a;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many shape you want to create? :");
        n=sc.nextInt();
        a=new Shape[n];
        for(int i=0;i<n;i++){
        System.out.println("choose the shape type: retangle (1) or circle (2)");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the valid value follow step: color filled width height");
            String c=sc.next();
            boolean f=sc.nextBoolean();
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            a[i]=new Retange(w, h, c, f);
        }
        if(choice==2){
            System.out.println("Enter the valid value follow step: color filled radius");
            String c=sc.next();
            boolean f=sc.nextBoolean();
            double r=sc.nextDouble();
            a[i]=new Circle(r, c, f);
        }
        }
    }
    void output(){
        for(int i=0;i<n;i++){
            if(a[i] instanceof Retange){
            System.out.println(a[i].toString());
            }else{
                System.out.println(a[i].toString());
            }
        }
    }
    double GreatestArea(){
        double max=0;
        for(int i=0;i<a.length;i++){
            if(a[i].getArea()>max){
                max= a[i].getArea();
            }
        }
        return max;
    }
    void softDecending(){
        Shape temp = a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].getArea()<a[j].getArea()){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        output();
    }
    public static void main(String[] args) {
        ShapeList a=new ShapeList();
        a.input();
        a.output();
        System.out.println("the greatest area is "+a.GreatestArea());
        a.softDecending();
    }
}
