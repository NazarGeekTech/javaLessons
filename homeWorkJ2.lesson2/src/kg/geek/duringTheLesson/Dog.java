package kg.geek.duringTheLesson;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public String draw() {
        return "dog " + " \uD83D\uDC15 ";
    }

    @Override
    public void callSound(CommandType commandType){
        if (commandType == CommandType.BARK_UP){
            for (int i = 0; i <3 ; i++) {
                System.out.println("gav gav gav ");
            }
        }else if (commandType == CommandType.JUMP_UP){
            for (int i = 0; i <4 ; i++) {
                System.out.println("jump jump jump");
            }
        }else if (commandType == CommandType.ROLL_OVER){
            int a = 0;
            while (a < 3) {
                System.out.print("rolling rolling ");
                a++;
            }
            }else if (commandType == CommandType.SIT_DOWN){
            System.out.println("hhhhhhm");
        }


    }
}
