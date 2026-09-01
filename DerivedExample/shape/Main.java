package shape;
public class Main{
    public static void main(String[] args){
        Square s1 = new Square(10);
        assert(s1.isFilled() == true);
        assert(s1.getColor().equals("green"));
        Rectangle r1 = new Rectangle(10, 9);
        r1.getArea();
        System.out.println(s1.getColor());
        // We can give assert statements  here to validate our program.

    }
}