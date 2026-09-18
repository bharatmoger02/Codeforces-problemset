import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] x=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]= sc.nextInt();
        }
        Arrays.sort(x);
        int q= sc.nextInt();
        while (q-->0){
            int a= sc.nextInt();
            int l=0;
            int r=n;
            while(l<r){
                int mid=l+(r-l)/2;
                if (x[mid]<=a)
                    l=mid+1;
                else
                    r=mid;
            }
            System.out.println(l);
        }
    }
}
