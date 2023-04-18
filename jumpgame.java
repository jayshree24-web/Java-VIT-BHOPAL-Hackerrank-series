import java.io.*;
import java.util.*;

public class Solution {
    public static boolean jump(int [] arr){
        int reach=0;
        for(int i=0;i<=reach;i++){
            reach=Math.max(reach,arr[i]+i);
            if(reach>=arr.length-1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(jump(arr));
    }
}
