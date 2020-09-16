package kg.geek.homeWorkj2.less3;

import java.util.Arrays;

public abstract class OperatingSystems  implements Printable{
    private String OS_Type; /*Single-tasking and multi-tasking*/
    private String OS_Name;
    private double OS_Version;
    private Processor processor;
    private SecureHardware secureHardware;

    public OperatingSystems(String OS_Type, String OS_Name,double OS_Version,Processor processor,SecureHardware secureHardware){
        this.OS_Type = OS_Type;
        this.OS_Name = OS_Name;
        this.OS_Version = OS_Version;
        this.processor = processor;
        this.secureHardware = secureHardware;
    }

    public String getOS_Type(){
        return OS_Type;
    }
    public String getOS_Name(){
        return OS_Name;
    }
    public double getOS_Version(){
        return OS_Version;
    }
    public Processor getProcessor(){
        return processor;
    }

    public SecureHardware getSecureHardware(){
        return secureHardware;
    }

    @Override
    public void printAll(){
        System.out.println("Characteristic of OS : " + "\nOS type : " + getOS_Type()+
                "\nOS name : " + getOS_Name() + "\nProcessor : "+ processor.getCoreI() +" " + processor.getGraphics() + " "+processor.getGHz() +
                "\nOS version : " + getOS_Version() + "\nSecurity Hardware : " + getSecureHardware()) ;
    }


}
