package kg.geek.duringTheLesson;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("parameter Rectangle " + (length *width));
    }

    @Override
    public String draw() {
        return "Rectangle emoji \uD83D\uDFE5  \uD83D\uDFE5 ";
    }
}
