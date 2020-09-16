package kg.geek.duringTheLesson;

public abstract class Figure implements Drawable {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculatePerimeter();
    public abstract String draw();
}
