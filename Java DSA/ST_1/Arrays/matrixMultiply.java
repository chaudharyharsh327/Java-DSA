//TO MULTIPKE A MATRIX 
//COLUMN OF FIRST MATRIX SHOULD BE EQUAL TO ROWS OF SECOND
//EG--> 2*3   3*4


import java.util.Scanner;


public class matrixMultiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] one = new int[r1][c1];
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j] = sc.nextInt();

            }

        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] two = new int[r2][c2];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j] = sc.nextInt();

            }

        }
        if(c1 != r2){
            System.out.println("Invalid Input");
            return;

        }

        //matrix multiplication first ka row * second ka column
        int product[][] = new int[r1][c2];
        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[0].length;j++){
                for(int k=0;k<c1;k++){
                    //multiply krte waqt first matrix ki row aur second ka col same rehta hai
                    product[i][j] += one[i][k] * two[k][j];
                }

            }
        }


        //PRINTING THE MULTIPLIED MATRIX
        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[0].length;j++){
                System.out.println(product[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}