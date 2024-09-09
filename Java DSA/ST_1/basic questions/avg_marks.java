import java.util.*;

public class avg_marks {
    public static void main(String[] args){
        int a,b,c,avg;
        System.out.println("Enter marks of subjects: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avg = (a+b+c)/3;
        System.out.println("Average marks is:"+avg);
    }
    
}
