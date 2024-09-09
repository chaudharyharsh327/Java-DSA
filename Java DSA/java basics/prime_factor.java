import java.util.*;

public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int div = 2; div<n; div++){
            //jab tak divide ho rha hai divide krte rho
            while(n%div == 0){
                n = n/div;
                System.out.println(div);;
            }
        }
    
        
    }

    
}
