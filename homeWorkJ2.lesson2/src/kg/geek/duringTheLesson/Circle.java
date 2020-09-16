package kg.geek.duringTheLesson;

public class Circle extends Figure {

    private final double PI = 3.14;
    private double radius = 0.0;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void calculatePerimeter() {
        double result = 2*PI*radius;
        System.out.println("Perimeter  of circle " + (int)result);
    }


    @Override
    public String draw() {
        return "circle Emoji   ⭕️ ";


    }
}
