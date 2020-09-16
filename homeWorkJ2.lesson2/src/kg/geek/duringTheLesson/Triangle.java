package kg.geek.duringTheLesson;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of triangle " + (a + b + c));
    }

    @Override
    public String draw() {
        return "triangle emoji   \uD83D\uDD3A ";
    }
}
