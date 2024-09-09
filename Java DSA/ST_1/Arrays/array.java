//ARRAY DECLARATION AND PRINT

// public class array {
//     public static void main(String[] args) {
//         int marks[] = {97,98,95};
//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }
    
// }



//ARRAY INPUT OUTPUT WITH SIZE
import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //array declaration
        int numbers[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

    }
    
}
