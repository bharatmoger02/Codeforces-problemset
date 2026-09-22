import java.util.Arrays;
import java.util.Scanner;

public class Restoring3Nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        Arrays.sort(nums);
        int sum=nums[3];
        int a =sum-nums[2];
        int b=sum-nums[1];
        int c=sum-nums[0];
        System.out.println(a+" "+b+" "+c);
    }
}
