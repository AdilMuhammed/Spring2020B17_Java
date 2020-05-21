package day43MethodOverriding;

public class Square extends Shape {

    public double side;

    public Square(double side){
        this.side = side;
    }

    public void calculaeArea(){
        area = side * side;
        System.out.println("Area of the Square: "+area);
    }

    public void calculatePerimeter(){
        perimeter = side + side;
        System.out.println("Perimeter of the Square: "+perimeter);
    }



}
