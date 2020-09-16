package kg.geek.homeWorkj2.less3;

public class Processor {
    private double GHz;
    private String coreI; /*core i5 or i7*/
    private String graphics;

    public Processor(double GHz,String coreI,String graphics){
        this.GHz = GHz;
        this.coreI = coreI;
        this.graphics = graphics;
    }

    public double getGHz(){
        return GHz;
    }
    public String getCoreI(){
        return coreI;
    }
    public String getGraphics(){
        return graphics;
    }
}
