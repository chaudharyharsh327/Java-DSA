//eg-45
//45*45=2025
//20+25=45 
//THAT IS KAPREKAR NUMBER



// import java.util.Scanner;  

// public class Kaprekar {  
//     public static void main(String[] args) {  
//         System.out.println("Enter any number: ");  
//         //eg input = 9
//         Scanner sc = new Scanner(System.in);  
//         int num = sc.nextInt();  
        
//         //9*9=81
//         int sqr = num * num;  
//         int temp = num;  //input digit assigned to temp (temp=9)
//         int c = 1;  
        
//         // Calculate the number of digits in input for 9 it is 1 digit
//         //the power on c is the number of digit in temp
//         while (temp != 0) {  
//             c *= 10;  
//             temp /= 10;  
//         }  
        
//         // Split the square into two parts  eg 8 and 1
//         int a = sqr % c; // Right part  
//         int b = sqr / c; // Left part  
//         int sum = a + b;  //check if 8+1 is equal to num or not in this case it is karpekar
        
//         // Check if it is a Kaprekar number  
//         if (sum == num) {  
//             System.out.println(num + " is a Kaprekar number.");  
//         } else {  
//             System.out.println(num + " is not a Kaprekar number.");  
//         }  
//     }  
// }


import java.util.Scanner;

public class Karp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<=N;i++){
            int n = sc.nextInt();
            int sq = n*n;
        int temp=n;
        int c=1;
        while(temp!=0){
            c*=10;
            temp/=10;
        }
        //split in half
        int a = sq%c;
        int b = sq/c;
        int sum = a+b;

        if(sum==n){
            System.out.println("1");

        }
        else{
            System.out.println("0");

        }
        }
        
    }
}