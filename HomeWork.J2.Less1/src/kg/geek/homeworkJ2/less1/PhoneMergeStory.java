package kg.geek.homeworkJ2.less1;

public class PhoneMergeStory {
    private String originalFrom;
    private String assembledFrom;

    public PhoneMergeStory(String originalFrom,String assembledFrom){
        this.assembledFrom = assembledFrom;
        this.originalFrom = originalFrom;
    }


    public String getOriginalFrom(){
        return originalFrom;
    }
    public String getAssembledFrom(){
        return assembledFrom;
    }

}
