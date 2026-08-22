import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        int sum=0;
        for (int i = 0; i < coins.length; i++) {
            coins[i]= sc.nextInt();
            sum+=coins[i];
        }

        Arrays.sort(coins);
        int limit=(sum+2-1)/2;
        int count=0;
        for (int i = n-1; i >=0; i--) {
            sum-=coins[i];
            count++;
            if (sum<limit) {
                System.out.println(count);
                return;
            }
        }
    }
}
