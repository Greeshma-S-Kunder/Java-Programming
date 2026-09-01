package shape;
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        double area = getWidth() * getLength();
        System.out.println("inside Rectangel area");
        return area;
    }
    public double getPerimeter(){
        double perimeter  = 2 * ( getWidth() + getLength());
        System.out.println("inside Rectangel peri");
        return perimeter;
    }
    @Override
    public String toString(){
        return "Width : " + getWidth()  + "\n" + "Length : " + getLength(); 
    }
}