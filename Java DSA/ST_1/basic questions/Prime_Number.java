
// import java.util.Scanner;

// public class Prime_Number {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int low = sc.nextInt();
//         int high = sc.nextInt();

//         for(int i=low;i<=high;i++){
//             int count = 0;

//             //prime means kisi se bhi divide nhi hona chahiye
//             //1 se toh sabhi divide ho jate hai islea
//             //2 se leke root n tak check krnge root n tak divisor mil jata h 
//             //agr hota hai toh
//             for(int div =2; div*div<=i;div++){
//                 if(i%div == 0){
//                     count++;
//                     break;
//                 }
//             }
//             if(count == 0){
//                 System.out.println(i+" :it is prime");
//             }
//             else{
//                 System.out.println(i+" :Not prime");
//             }
//         }
//     }
    
// }




import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
            int count = 0;

            //prime means kisi se bhi divide nhi hona chahiye
            //1 se toh sabhi divide ho jate hai islea
            //2 se leke root n tak check krnge root n tak divisor mil jata h 
            //agr hota hai toh
            for(int div =2; div*div<=i;div++){
                if(i%div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i+" :it is prime");
            }
            else{
                System.out.println(i+" :Not prime");
            }
        
    }
    
}
