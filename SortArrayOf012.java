/*
Time Complexity -> O(n)
Space Complexity -> O(1)

Note: Another way would be to frist run a for loop and store the counts of each number in a variable. 
Then run another for loop and fill the same array inplace
Time complexity --> O(2n) = O(n).
 */
package GFG.Array;

import java.util.Arrays;
import java.util.Random;

public class SortArrayOf012 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];

        for(int i=0; i<10;i++)
        {
            array[i]= rand.nextInt(3) ;
        }

        int s=0, m=0, k=array.length-1;

        System.out.println(Arrays.toString(array));

        for(int i=0; i<array.length; i++){
            while(array[s]==0){
                s++;
                i++;
            }
            while(array[k]==2){
                k--;
            }
            if(array[i]==0){
                int temp = array[s];
                array[s] = array[i];
                array[i] = temp;
                s++;
            }
            if(array[i]==2 && i<k){
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
                if(array[i]==0){            //because we could have replace it with 0 which needs to go at the beginning.
                    int temp1 = array[s];
                    array[s] = array[i];
                    array[i] = temp1;
                    s++;
                }
                k--;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
