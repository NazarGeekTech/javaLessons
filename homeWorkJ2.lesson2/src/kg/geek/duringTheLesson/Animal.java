package kg.geek.duringTheLesson;

public abstract class Animal implements Drawable,SoundProducible {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
