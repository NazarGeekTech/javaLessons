package kg.geek.homeworkJ2.less1;


import java.lang.ref.PhantomReference;

public final class IPhone extends MobilePhone {
    private String generationOfPhone;
    private String modelOfPhone;
    private CurrentLevelOfBattery currentLevelOfBattery;


    public IPhone(int year, TypeOfBatteries typeOfBatteries, String typeOfBody,
                  String wrapSpeedProcessor, String generationOfPhone, String modelOfPhone, CurrentLevelOfBattery currentLevelOfBattery) {
        super(year, typeOfBatteries, typeOfBody, wrapSpeedProcessor);
        this.generationOfPhone = generationOfPhone;
        this.modelOfPhone = modelOfPhone;
        this.currentLevelOfBattery = currentLevelOfBattery;
    }

    public IPhone(int year, PhoneMergeStory phoneMergeStory, TypeOfBatteries typeOfBatteries,
                  String typeOfBody, String wrapSpeedProcessor, String generationOfPhone, String modelOfPhone) {
        super(year, phoneMergeStory, typeOfBatteries, typeOfBody, wrapSpeedProcessor);
        this.generationOfPhone = generationOfPhone;
        this.modelOfPhone = modelOfPhone;
    }

    public IPhone(String generationOfPhone, String modelOfPhone, CurrentLevelOfBattery currentLevelOfBattery) {
        this.generationOfPhone = generationOfPhone;
        this.modelOfPhone = modelOfPhone;
        this.currentLevelOfBattery = currentLevelOfBattery;
    }


    public String getGenerationOfPhone() {
        return generationOfPhone;
    }

    public String getModelOfPhone() {
        return modelOfPhone;
    }

    public CurrentLevelOfBattery currentLevelOfBattery() {
        return currentLevelOfBattery;
    }


    @Override
    public String allAboutPhone() {
        return " Iphone =  " + "\nGeneration of Phone = " + generationOfPhone +
                "\nModel of phone = " + modelOfPhone + "\n" + super.allAboutPhone();
    }

    @Override
    public void daileTo(int phoneNumber, String name) {
        super.daileTo(phoneNumber, name);
        //        code below does that user or owner has to be aware of battery level
        if (currentLevelOfBattery == CurrentLevelOfBattery.RUNNING_LOW) {
            System.out.println("Your call may over soon since your battery is Running low");
        } else if (currentLevelOfBattery == CurrentLevelOfBattery.HIGH) {
            System.out.println("You are free to gossip all night long ");
        } else {
            System.out.println("Do what you need to do ");
        }

    }

    @Override
    public void daileTo(String name, int phoneNumber, String region) {
       super.daileTo(name,phoneNumber,region);
        if (currentLevelOfBattery == CurrentLevelOfBattery.RUNNING_LOW) {
            System.out.println("Your call may over soon since your battery is Running low");
        } else if (currentLevelOfBattery == CurrentLevelOfBattery.HIGH) {
            System.out.println("You are free to gossip all night long ");
        } else {
            System.out.println("Do what you need to do ");
        }
    }

}
