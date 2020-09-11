package DuringTheLesson;

public class Pet {

    private int age = generateDefaultAge();
    private Shelter shelter;
    private Color color;

    public Pet(){};

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private int generateDefaultAge() {
        return (int) Math.random() * 10 + 5;
    }

    public final String getInfo() {
        if (shelter != null && color != null) {
            return "Pet  = [ " + "\nage = " + age +
                    "\nshalter = " + shelter.getName() + shelter.getAddress() +
                    "\ncolor = " + color + "\n]";
        }else {
            return "Pet  = [ " + "\nage = " + age;


        }
    }


}
