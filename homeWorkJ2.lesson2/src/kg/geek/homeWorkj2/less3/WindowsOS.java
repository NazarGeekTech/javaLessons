package kg.geek.homeWorkj2.less3;

public class WindowsOS extends OperatingSystems {

    private String sharing; /*OneDrive*/
    private String personalAssistant;

    public WindowsOS(String OS_Type, String OS_Name, double OS_Version, Processor processor, SecureHardware secureHardware,String sharing,String personalAssistant) {
        super(OS_Type, OS_Name, OS_Version, processor, secureHardware);
        this.personalAssistant = personalAssistant;
        this.sharing = sharing;
    }


    public String getSharing() {
        return sharing;
    }

    public String getPersonalAssistant() {
        return personalAssistant;
    }

    public void printAll(){
        super.printAll();
        System.out.println("Futures on Windows OS \uD83D\uDCBB: " + "\nSharing " + getSharing() + "\nPersonalAssistant " + getPersonalAssistant() +"\n");
    }
}
