// 1. Magic Numbers.

// E.G 
// Number= 50113 
// => 5+0+1+1+3=10 
// => 1+0=1 
// This is a Magic Number.
// sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,then the number is a magic number.
import java.util.*;

public class ExtraPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         //jab tak single digit ka nhi ho jata tab tak sum kro
//         while(n>9){
//             int sum=0; //taki sum ki value reset ho jaaye
//             while(n>0){
//                 int rem = n%10;
//                 sum = sum+rem;
//                 n=n/10;
//             }
//             n = sum;
//         }
//         if(n==1){
//             System.out.println("it is magic number");
//         }
//         else{
//             System.out.println("not a magic number");
//         }
//     }
    //////////////////////////////////////////////////////////////////



// 2. Happy Numbers.

// E.G.

// Number = 32

// 3*2+ 2*2 = 13

// 1*2 + 3*2 = 10

// 1*2 + 0*2 = 1

// In this example, we split 32 to get the sum of squares of its digits which forms another number (13), we replace 32 by 13 to continue this cycle until result 1. We found 32 a happy number.


// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         //jab tak single digit ka nhi ho jata tab tak sum kro
//         while (n > 9) {
//             int sum = 0; //taki sum ki value reset ho jaaye
//             while (n > 0) {
//                 int rem = n % 10;
//                 // rem = rem*rem;
//                 sum = sum + rem * rem;
//                 n = n / 10;
//             }
//             n = sum;

//         }
//         if (n == 1) {
//             System.out.println("it is happy number");
//         } else {
//             System.out.println("not a happy number");
//         }

//     }


///////////////////////////////////////////////////////

//     3. Duck Numbers.

// E.G.

// Number = 2012.     - Duck

// Number = 0025.     - Not Duck

// Number = 2345.     - Not Duck

// If given number has zero in between or end, that is call duck number.


// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         String n = sc.nextLine();

//         
//         if (n.charAt(0) == '0') {
//             System.out.println("not duck");
//         } else {
//             if (n.contains("0")) {
//                 System.out.println("duck");
//             } else {
//                 System.out.println("it is duck");
//             }
//         }

//     }
// }

////////////////////////////////////////////////////////



// 4. Spy Numbers.

// E.G.

// input - 1421

// Sum of digits ==> 1+4+2+1 = 8

// Product of digits ==> 1*4*2*1 = 8

// Since the product and the sum of the digits are exactly the same, the number is a spy number

// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         
//         int sum = 0, prod = 1;
//         while (n > 0) {
//             int rem = n % 10;
//             sum = sum + rem;
//             prod = prod * rem;
//             n = n / 10;
//         }
//         if (sum == prod) {
//             System.out.println("spy number");
//         } else {
//             System.out.println("Not a spy number");
//         }

//     }
// }


//////////////////////////////////////////////////////////


// 5. Strong Number

// E.G.

// A strong number is a number in which the sum of the factorial of the digits is equal to the number itself.

// 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145


    //    public static int factorial(int n){
    //     int result = 1;
    //     for(int i=1;i<=n;i++){
    //         result = result*i;
    //     }
    //     return result;

    //    }

    //    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number: ");
    //     int n = sc.nextInt();
    //     int sum=0,temp=n;
    //     while(temp>0){
    //         int digit = temp%10;
    //         sum = sum+ factorial(digit);
    //         temp = temp/10;
    //     }

    //     if(sum == n){
    //         System.out.println("it is strong number");
    //     }
    //     else{
    //         System.out.println("not strong number");
    //     }
    //    }
    // }
       
/////////////////////////////////////

// 6. Perfect Number

// E.G.

// A perfect number is a number which is equal to the sum of its proper positive divisors.

// For example, 6 is a perfect number.

// The divisors of 6 are 1, 2 and 3.1 + 2 + 3 = 6.


 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //eg-64 ka last divisible 32 hoga
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("it is perfect number");
        } else {
            System.out.println("not a perfect number");
        }

    }
}
