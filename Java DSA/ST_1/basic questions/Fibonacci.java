
// import java.util.Scanner;

// public class fibonnaci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         int a=0,b=1;
//         for(int i=0;i<n;i++){
//             int c=a+b;
//             a=b;
//             b=c;
//             System.out.println(c);
//         }
//     }
// }



import java.util.Scanner;  

public class Fibonacci {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int n = sc.nextInt();  

        int a = 0, b = 1;  // The first two Fibonacci numbers  
        int nextFibo = a;  // Initialize the next Fibonacci number  

        // Continue calculating Fibonacci numbers until we exceed n  
        while (nextFibo <= n) {  
            nextFibo = a + b;  // The next Fibonacci number  
            a = b;             // Move to the next pair  
            b = nextFibo;  
        }  

        System.out.println("The next Fibonacci number after " + n + " is: " + nextFibo);  
        sc.close();  // Close the scanner  
    }  
}




// import java.util.Scanner;

// public class fibonnaci {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the number
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // Find and print the next closest Fibonacci number
//         int nextFibonacci = getNextFibonacci(number);
//         System.out.println("The next closest Fibonacci number greater than " + number + " is: " + nextFibonacci);

//         scanner.close();
//     }

//     public static int getNextFibonacci(int number) {
//         int a = 0;
//         int b = 1;

//         while (b <= number) {
//             int temp = b;
//             b = a + b;
//             a = temp;
//         }

//         return b;
//     }
// }

//0 1 1 2 3 5 8 13
//0 1 2 3 4 5 6 7