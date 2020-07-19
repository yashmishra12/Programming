package GFG.Array;

import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] matrix = new int[t][2];
        int[] inputs = new int[t];

        for(int i=0; i<t; i++){
            for(int k=0;k<2; k++){
                matrix[i][k]=sc.nextInt();
            }
            inputs[i]=sc.nextInt();
        }
        for(int i=0; i<t; i++){
            for(int k=0;k<2; k++){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.print("\nYour number: ");
            System.out.print(inputs[i]+"\n");
        }
    }

}
