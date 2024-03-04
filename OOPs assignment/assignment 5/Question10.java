class Point{
    double x;
    double y;
    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
class Circle{
    Point center;
    double radius;
    public Circle(Point center,double radius){
        this.center=center;
        this.radius=radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
public class Question10 {
    public static void main(String[] args) {
        Point cc=new Point(0, 0);
        double circleRadius=5;
        Circle c=new Circle(cc, circleRadius);
        System.out.println("Area of circle is "+c.area());
    }
}
