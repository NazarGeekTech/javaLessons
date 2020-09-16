package kg.geek.homeworkJ2.less1;


public final class IPhone extends MobilePhone {
    private String generationOfPhone;
    private String modelOfPhone;
    private CurrentLevelOfBattery currentLevelOfBattery;

    public CurrentLevelOfBattery getCurrentLevelOfBattery() {
        return currentLevelOfBattery;
    }

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

    public IPhone() {
    }


    public String getGenerationOfPhone() {
        return generationOfPhone;
    }

    public String getModelOfPhone() {
        return modelOfPhone;
    }


    public void setGenerationOfPhone(String generationOfPhone) {
        this.generationOfPhone = generationOfPhone;
    }

    public void setModelOfPhone(String modelOfPhone) {
        this.modelOfPhone = modelOfPhone;
    }

    public void setCurrentLevelOfBattery(CurrentLevelOfBattery currentLevelOfBattery) {
        this.currentLevelOfBattery = currentLevelOfBattery;
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
        super.daileTo(name, phoneNumber, region);
        if (currentLevelOfBattery == CurrentLevelOfBattery.RUNNING_LOW) {
            System.out.println("Your call may over soon since your battery is Running low");
        } else if (currentLevelOfBattery == CurrentLevelOfBattery.HIGH) {
            System.out.println("You are free to gossip all night long ");
        } else {
            System.out.println("Do what you need to do ");
        }
    }


    /*На сообразительность
h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC*/


    public IPhone(IPhone iPhone) {
        modelOfPhone = iPhone.modelOfPhone;
        currentLevelOfBattery = iPhone.currentLevelOfBattery;
        generationOfPhone = iPhone.generationOfPhone;


    }
    public void throwInfo(){
        System.out.println("generation Of Phone "+this.generationOfPhone+ "\ncurrentLevel Of Battery "+this.currentLevelOfBattery +
                "\nmodel Of Phone "+this.modelOfPhone);
    }

}
