
interface MyCamera{
    void takeSnap();
    void recordVideo();
    //default methods used to add new functionality to exisiting interface
    //interface can also include private methods for default methods to use
    default void record4kVideo(){
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("recording video");
    }

    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5g"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to" + network);
    }

}


public class Inhertiance_in_interaface {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        String[] arr = ms.getNetworks();
        for(String item:arr){
            System.out.println(item);

        }
    }
    
}
