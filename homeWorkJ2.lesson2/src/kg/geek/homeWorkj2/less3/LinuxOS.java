package kg.geek.homeWorkj2.less3;

public class LinuxOS  extends OperatingSystems{
    private String distribution; /*LINUX MINT,MANJARO,DEBIAN,UBUNTU*/
    private String desktopEnvironment; /*GNOME, Cinnamon, Mate, Pantheon, Enlightenment*/

    public LinuxOS(String OS_Type, String OS_Name, double OS_Version, Processor processor, SecureHardware secureHardware,String distribution,String desktopEnvironment) {
        super(OS_Type, OS_Name, OS_Version, processor, secureHardware);
        this.desktopEnvironment = desktopEnvironment;
        this.distribution = distribution;
    }


    public String getDistribution(){
        return distribution;
    }
    public String getDesktopEnvironment(){
        return desktopEnvironment;
    }

    @Override
    public void printAll(){
        super.printAll();
        System.out.println("Futures on Linux OS \uD83D\uDC27: " + "\nDistribution " + getDistribution()+
                "\nDesktop environment " + getDesktopEnvironment()+"\n");
    }


}
