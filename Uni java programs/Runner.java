class Circle {
    private int radius;
   
    public Circle() {
    radius = 7;
    }
    public Circle(int r) {
    radius = r;
    }
    public void setRadius(int r) {
    radius = r;
    }
    public int getRadius() {
    return radius;
    }
    public void display() {
    System.out.println("radius = " + radius);
    }
    public double CalculateCircumference() {
    double a = 3.14 * radius * radius;
    return a;
    }
   }
   public class Runner {
    public static void main(String args[]) {
    Circle c1 = new Circle();
    c1.setRadius(5);
    System.out.println("Circumference of Circle 1 is: " + c1.CalculateCircumference());
    int r = c1.getRadius();
    Circle c2 = new Circle(r);
    c2.setRadius(5);
    System.out.println("Circumference of Circle 2 is: " + c2.CalculateCircumference());
  
    
}
    }