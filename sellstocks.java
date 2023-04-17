//Best time to buy and sell stock 8
import java.io.*;
import java.util.*;

public class Solution {
    public static int maxProfit(int[]prices){
        int max=0;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(minsofar,prices[i]);
            int diff=prices[i]-minsofar;
            if(diff>max){
                max=diff;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []prices=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }
}
