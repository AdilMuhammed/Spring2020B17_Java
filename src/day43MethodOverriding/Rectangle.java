package day43MethodOverriding;

public class Rectangle extends Shape {
/*
inherited:
        area, perimeter
        calculateArea(), calculatePerimeter()
 */

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void calculaeArea(){
        area = length * width;
        System.out.println("Area of the Rectangle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = length + width;
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }





}
