import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i]= sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int x=0;
            while (k-->0){
                if(a[x]<b[b.length-1-x])
                    a[x]=b[b.length-1-x];
                x++;
            }
            System.out.println(total(a));
        }
    }

    private static int total(int[] nums) {
        int sum=0;
        for (int n:nums)
            sum+=n;
        return sum;
    }
}
