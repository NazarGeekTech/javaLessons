package kg.geek.homeworkJ2.less1;

import java.util.Arrays;

public class Phone {

    private int year;
    private PhoneMergeStory phoneMergeStory;
    private TypeOfBatteries batteryType;

    public Phone(){}

    public Phone(int year,PhoneMergeStory phoneMergeStory,TypeOfBatteries batteryType){
        this.year = year;
        this.phoneMergeStory = phoneMergeStory;
        this.batteryType = batteryType;
    }

    public Phone(int year,TypeOfBatteries batteryType){
        this.year = year;
        this.batteryType = batteryType;
    }

    public int getYear(){
        return year;
    }

    public PhoneMergeStory getPhoneMergeStory(){
        return phoneMergeStory;
    }

    public  TypeOfBatteries getBatteryType(){
        return batteryType;
    }

    public String allAboutPhone(){
        if (phoneMergeStory != null) {
            return " --Information from second class :" + "\nYear = " + year +
                    "\nPhone merge story " + "\nOriginally from " + phoneMergeStory.getOriginalFrom() + "\nAssembled from " + phoneMergeStory.getAssembledFrom() +
                    "\nType of batteries " + batteryType;
        }else {
            return " --Information from second class :" + "\nYear = " + year +
                    "\nType of batteries " + batteryType;
        }
    }




}
