package kg.geek.duringTheLesson;

public class Square  extends Figure {
final private int side1;
final private int side2;
final private int side3;
final private int side4;

    public Square(String name, int side1, int side2, int side3, int side4) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public int getSide4() {
        return side4;
    }

    public void calculateSquare(){

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of triangle " + (side1 * 4));
    }

    @Override
    public String draw() {
        return "square emoji  \uD83D\uDFE5 ";
    }
}
