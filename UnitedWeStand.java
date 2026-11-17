import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            if(a[0]==a[n-1]){
                System.out.println(-1);
                continue;
            }
            int i=0;
            while (i<n && a[i]==a[0]){
                i++;
            }
            System.out.println(i+" "+(n-i));
            for(int j=0; j<i; j++)
                System.out.print(a[j]+" ");
            System.out.println();
            for(int j=i; j<n; j++)
                System.out.print(a[j]+" ");
            System.out.println();
        }
    }
}
