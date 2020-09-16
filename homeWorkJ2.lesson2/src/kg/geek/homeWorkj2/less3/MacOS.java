package kg.geek.homeWorkj2.less3;

public class MacOS extends OperatingSystems {
    private String appleStore;
    private String  appleWatch;
    private String  brand;


    public MacOS(String OS_Type, String OS_Name, double OS_Version, Processor processor, SecureHardware secureHardware,String appleStore,String appleWatch,String brand) {
        super(OS_Type, OS_Name, OS_Version, processor, secureHardware);
        this.appleStore = appleStore;
        this.appleWatch = appleWatch;
        this.brand = brand;
    }

    public String getAppleStore(){
        return appleStore;
    }
    public String getAppleWatch(){
        return appleWatch;
    }
    public String getBrand(){
        return brand;
    }

    @Override
    public void printAll(){
        super.printAll();
        System.out.println("Futures in MacOS \uF8FF: " + "\nApple Store " + getAppleStore() +
                "\nApple Watch " + getAppleWatch() + "\nbrand " + getBrand() +"\n");
    }

}
