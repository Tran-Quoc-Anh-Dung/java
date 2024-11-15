interface Shape{
    double getArea();
    double getPerimeter();
}

//lớp rectangle
class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //tính diện tích rectangle
    public double getArea(){
        return width * height;
    }
    //tính chu vi Rec
    public double getPerimeter(){
        return 2*(width + height);
    }
}
//lớp circle
class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    //tính diện tích hình tron 
    public double getArea(){
        return Math.PI * radius * radius;
    }
    //tính chu vi hình tròn
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
//lớp tam giác
class Triangle implements Shape{
    private double a,b,c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //tính diện tích tam giác
    public double getArea(){
        double s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    //tính chu vi hình tròn
    public double getPerimeter(){
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        //tạo mảng cho 3 hình
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(18,18);
        shapes[1] = new Triangle(30,30,30);
        shapes[2] = new Circle(12);

        for(Shape shape : shapes){
            System.out.println("Class: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
        
    }

}