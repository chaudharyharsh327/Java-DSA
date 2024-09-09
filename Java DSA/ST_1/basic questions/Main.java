
// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int a=0;
//         int b=1;
//         for(int i=0;i<n;i++){
//             System.out.println(a);
//             int c=a+b;
//             a=b;
//             b=c;
//         }
//     }    
// }





import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and print the next closest Fibonacci number
        int nextFibonacci = getNextFibonacci(number);
        System.out.println("The next closest Fibonacci number greater than " + number + " is: " + nextFibonacci);

        scanner.close();
    }

    public static int getNextFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (b <= number) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }
}

