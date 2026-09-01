package shape;
public class Square extends Rectangle{
    
    public Square(){
        super();
    }
    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "Side : " + super.getWidth();
    }
    
    public double getArea(){
        double area = super.getWidth() * super.getLength();
        System.out.println("inside Square area");
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * (super.getLength() + super.getWidth());
        System.out.println("inside Square peri");
        return perimeter;
    }
    
}