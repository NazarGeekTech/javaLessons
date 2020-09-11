package kg.geek.homeworkJ2.less1;

import java.util.Random;

public class MobilePhone extends Phone {
    private String bodyType;
    private String wrapSpeedProcessor;


    public MobilePhone(int year, PhoneMergeStory phoneMergeStory, TypeOfBatteries typeOfBatteries, String bodyType, String wrapSpeedProcessor) {
        super(year, phoneMergeStory, typeOfBatteries);
        this.bodyType = bodyType;
        this.wrapSpeedProcessor = wrapSpeedProcessor;
    }

    public MobilePhone(int year, TypeOfBatteries typeOfBatteries, String bodyType, String wrapSpeedProcessor) {
        super(year, typeOfBatteries);
        this.bodyType = bodyType;
        this.wrapSpeedProcessor = wrapSpeedProcessor;
    }

    public MobilePhone() {
    }

    ;

    /* i need this setters to set the values to empty constructor :) */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setWrapSpeedProcessor(String wrapSpeedProcessor) {
        this.wrapSpeedProcessor = wrapSpeedProcessor;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getWrapSpeedProcessor() {
        return wrapSpeedProcessor;
    }


    @Override
    public String allAboutPhone() {
        return "Phone  [\ntype of body = " + bodyType +
                "\nWrap speed Processor = " + wrapSpeedProcessor +
                "\n" + super.allAboutPhone();
    }

    //        this randoms to use on overLoading methods
    Random r = new Random();
    int randomForDaile = r.nextInt(5) + 1;

    public void daileTo(int phoneNumber, String name) {
        switch (randomForDaile) {
            case 1:
                System.out.println("User " + name + " phone number " + phoneNumber + "\nbusy try again  ");
                break;
            case 2:
                System.out.println("User " + name + " " + phoneNumber + "\nunreachable or out of service ");
                break;
            case 3:
                System.out.println("You are on hold wait for it or call later on");
                break;
            default:
                System.out.println("You are on call with " + name + " " + phoneNumber);
                break;
        }
    }

    public void daileTo(String name, int phoneNumber, String region){
        switch (randomForDaile) {
            case 1:
                System.out.println("User " + name + " phone number " + phoneNumber + " locates in " + region +"\nbusy try again  ");
                break;
            case 2:
                System.out.println("User "  + name + " " + phoneNumber + " locates in " + region + "\nunreachable or out of service  in "+ region );
                break;
            case 3:
                System.out.println("You are on hold wait for it or call later on");
                break;
            default:
                System.out.println("You are on call with " + name + " " + phoneNumber +" locates in " + region);
                break;
        }

    }

    public final void daileTo(String name) {
        System.out.println("the user name is " + name);
        }



    public final void orderAPhone(String bodyType, int year) {

        System.out.println("You have ordered " + bodyType + "\nProduced year " + year +
                "\nWill arrive in " + (int) (Math.random() * 15 + 5) + " " + "days ");
    }


}
