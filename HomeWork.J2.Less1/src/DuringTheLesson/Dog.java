package DuringTheLesson;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    /* 3 type of constructors down below*/
    public Dog() {
    }

    ;

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;

    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }/*end of constructors */

    /*getters and setters */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setCommands(String[] commands){
        this.commands = commands;
    }
    public String[] getCommands(){
        return commands;
    }/*end of get sets*/


    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }


//    public String getInfo(){
//        if (commands != null) {
//            return "Dog = [ " +
//                    "\nname = " + name +
//                    "\nbreed = " + breed +
//                    "\ncommands = " + Arrays.toString(commands) +
//                    "\n" + super.getInfo();
//        } else {
//            return "Dog = [ " +
//                    "\nname = " + name +
//                    "\nbreed = " + breed +
//                    "\n" + super.getInfo();
//        }
    }









