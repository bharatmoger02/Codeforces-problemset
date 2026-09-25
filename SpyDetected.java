import java.util.Arrays;
import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i]= sc.nextInt();
            }

            int common=0;
            if (nums[0]==nums[1])
                common=nums[0];
            else if (nums[0]==nums[2])
                common=nums[0];
            else
                common=nums[1];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=common){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}

