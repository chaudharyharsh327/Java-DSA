//INTERFACE is group of related methods with empty bodies
//inheritance mein extends keyword ka use hota hai
//interface mein implements keyword ka use hota hai
//ABSTACTE CLASS VS INTERFACE
//we cant extend multiple abstract classes but we can implement multiple
//interfaces at a time



    interface Bicycle{
        int a =45;
        void applyBrake(int decrement);
        void speedUp(int increment);
    }
    //MORE THAN ONE INTERFACE CAN BE POSSIBLE
    interface hornBicycle{
        void blowHorn();
    }

     class AvonCycle implements Bicycle, hornBicycle{
         
        public void applyBrake(int decrement){
           System.out.println("applying brake");
        }
        public void speedUp(int increment){
            System.out.println("applying speed");
        }
        public void blowHorn(){
            System.out.println("pee pee pee");
        }
    }


    public class interfaceClass {
    public static void main(String[] args){
        AvonCycle cycleHarsh = new AvonCycle();
        cycleHarsh.applyBrake(1);
        //you cannot modify properties in interfaces
        //value of (a) cannot be changed no matter where you declare it again
        System.out.println(cycleHarsh.a);
        cycleHarsh.blowHorn();
        
    }
}
