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
