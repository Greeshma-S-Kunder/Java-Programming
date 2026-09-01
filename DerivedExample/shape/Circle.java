package shape;
public class Circle extends Shape{
        private double radius = 1.0;
        
        public Circle(){
           super();
           radius = 1.0; 
        }
        
        public Circle(double radius){
            super();
            this.radius = radius;
        }
        public Circle(double radius, String color, boolean filled){
            super(color, filled);
            this.radius = radius;
        }
        
        public double getRadius(){
            return radius;
        }
        
        public void setRadius(double radius){
            this.radius = radius;
        }
        public double getArea(){
            double area = 3.14 * getRadius() * getRadius();
            System.out.println("Inside Circle ARea");
            return area;
        }
        public double getPerimeter(){
            double perimeter = 2 * 3.14 * getRadius();
            System.out.println("Inside Circle Perimeter");
            return perimeter;
        }
        
        @Override
        public String toString(){
            return "Radius : " + getRadius();
        }
    }