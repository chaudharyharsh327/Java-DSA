// import java.util.*;

// public class secToHourMinute {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter seconds: ");
//         int sec = sc.nextInt();
//         int x1=sec%60;  //eg 310sec = 310%60 = some minutes and 10 sec
//         int x2 = sec/60;  //for value of minute 310/60= 5 minutes ans will be 5mins 10secs
//         int x3 = x2%60;   //for remaining minutes
//         x2=x2/60;//converts minutes into hours
//         System.out.println("HH:MM:SS- "+x2+":"+x3+":"+x1);

//     }

//}

import java.util.*;

public class secToHourMinute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int sec = sc.nextInt();
        int days = sec/86400;
        int remainingsecs = sec%86400;

        int hours = remainingsecs/3600;
        remainingsecs = remainingsecs%3600;

        int mins = remainingsecs/60;
        remainingsecs=remainingsecs%60;

        System.out.println(days + " days, " + hours + " hours, " + mins + " minutes, " + sec + " seconds");       

    }
}
